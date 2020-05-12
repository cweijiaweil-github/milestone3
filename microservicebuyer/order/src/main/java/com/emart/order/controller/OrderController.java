package com.emart.order.controller;

import java.util.List;

import com.emart.order.entity.Item;
import com.emart.order.service.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
// @Slf4j
@RequestMapping(value = "order")
public class OrderController {

    
    @Autowired
    private OrderService orderService;

    @GetMapping(value = "/search/{item_name}")
    public Item searchItems(@PathVariable("item_name") String item_name) {
        
        return this.orderService.searchItems(item_name);
    }
    
    @PostMapping(value = "/fillerItems/{priceStart,priceEnd}")
    public List<Item> fillerItems(@PathVariable("priceStart") String priceStart,@PathVariable("priceEnd") String priceEnd) {
        return this.orderService.fillerItems(priceStart,priceEnd);
    }

}