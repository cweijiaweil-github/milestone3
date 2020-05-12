package com.emart.cart.controller;

import java.util.ArrayList;
import java.util.List;

import com.emart.cart.entity.Cart;
import com.emart.cart.service.CartService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
// @Slf4j
@RequestMapping(value = "cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @PostMapping(value = "/addcart")
    public Cart addCartItems(@RequestBody Cart cart) {
        return this.cartService.addCarts(cart);
    }

    @PostMapping(value = "/listcarts")
    public List<Cart> listCarts() {
        return this.cartService.listCarts();
    }

    @GetMapping(value = "/deletecart/{id}")
    public List<Cart> addCartItems(@PathVariable("cartId")  String id) {
        String[] idList = id.split(",");
        List<Integer> LString = new ArrayList<Integer>();
        for(String str : idList){
            LString.add(new Integer(str));
        }
        cartService.deleteBatch(LString);
        return this.listCarts();
    }
   

}