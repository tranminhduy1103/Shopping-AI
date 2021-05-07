package net.javaguides.springboot.springsecurity.web;

import net.javaguides.springboot.springsecurity.service.CartServices;
import net.javaguides.springboot.springsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartRestController {
    @Autowired
    private CartServices cartService;

    @Autowired
    private UserService userService;

//    @PostMapping("/cart/add/{pid}/{qty}")
//    public String addProductToCart(PathVariable("pid") Long pcId,
//    @PathVariable("qty") Integer quantity){
//
//        User user = userService.findByID()
}

