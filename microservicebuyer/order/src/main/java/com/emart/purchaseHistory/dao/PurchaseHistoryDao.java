package com.emart.purchaseHistory.dao;

import java.util.List;

import com.emart.purchaseHistory.entity.PurchaseHistory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseHistoryDao extends JpaRepository<PurchaseHistory, Integer>{
    
    @Query(value="select t.item_id from t_purchaseHistory as t where t.buyer_id = ?1",nativeQuery=true)
    public List<String> getHistoryList(String buyer_id);
}