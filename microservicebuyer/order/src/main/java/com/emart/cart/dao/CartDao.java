package com.emart.cart.dao;

import java.util.List;

import com.emart.cart.entity.Cart;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CartDao extends JpaRepository<Cart, Integer>{

    @Query(value="delete from t_cart t where t.id in (?1)",nativeQuery=true)
    public void deleteBatch(List<Integer> ids);
    // public void deleteCartByIdIn(List<Integer> ids);
    
}