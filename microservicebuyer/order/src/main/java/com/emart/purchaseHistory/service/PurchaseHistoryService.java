package com.emart.purchaseHistory.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.emart.order.entity.Item;
import com.emart.order.service.ItemService;
import com.emart.purchaseHistory.dao.PurchaseHistoryDao;
import com.emart.purchaseHistory.entity.PurchaseHistory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PurchaseHistoryService {

    @Autowired
    PurchaseHistoryDao purchaseHistoryDao;

    @Autowired
    private ItemService itemService;

    public PurchaseHistory checkout(PurchaseHistory purchaseHistory) {
        return this.purchaseHistoryDao.save(purchaseHistory);
    }
    
    public Map<String,List<Map<String,Object>>> getHistoryList(String buyer_id) {
        List<Map<String,Object>> listmap = new ArrayList<Map<String,Object>>();
        List<String> listItem_id = this.purchaseHistoryDao.getHistoryList(buyer_id);
        Map<String,Object> map ;
        for(String item_id : listItem_id){
            map = new HashMap<String,Object>();
            Item item = this.itemService.getItemByItemId(item_id);
            map.put("item_name",item.getItem_name());
            map.put("price", item.getPrice());
            map.put("description", item.getDescription());
            map.put("create_date", item.getCreat_date());
            listmap.add(map);
        }
        Map<String,List<Map<String,Object>>> resmap = new HashMap<String,List<Map<String,Object>>>();
        resmap.put("key", listmap);
        return resmap;
    }

}
