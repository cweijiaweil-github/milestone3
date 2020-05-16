package com.emart.feign;

import com.emart.order.entity.Item;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "app-item")
public interface ItemFeignClient {
    
    @GetMapping(value = "/search/{item_name}")
    public Item searchItems(@PathVariable("item_name") String item_name);
}