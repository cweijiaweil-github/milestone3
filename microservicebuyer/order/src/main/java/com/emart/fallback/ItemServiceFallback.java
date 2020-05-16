package com.emart.fallback;

import com.emart.feign.ItemFeignClient;
import com.emart.order.entity.Item;

import org.springframework.web.bind.annotation.PathVariable;

public class ItemServiceFallback implements ItemFeignClient{
    
    @Override
    public Item searchItems(@PathVariable("item_name") String item_name){
        Item item = new Item();
        item.setItem_name("Error querying product information!");
        return item;
    }
}