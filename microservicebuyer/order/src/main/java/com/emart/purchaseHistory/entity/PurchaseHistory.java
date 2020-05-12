package com.emart.purchaseHistory.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "t_purchaseHistory")
@EntityListeners(AuditingEntityListener.class)
@Data
@NoArgsConstructor
public class PurchaseHistory implements Serializable {


    /**
     *
     */
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "item_id")
    private String item_id;
    
    @NotNull
    @Column(name = "category_id")
    private String category_id;

    @NotNull
    @Column(name = "bsubcategory_id")
    private String bsubcategory_id;

    @Column(name = "buyer_id")
    private String buyer_id;

    @Column(name = "seller_id")
    private String seller_id;
    
    @Column(name = "transaction_id")
    private String transaction_id;
    
    @Column(name = "num_items")
    private int num_items;

    @Column(name = "remark")
    private String remark;
    
}