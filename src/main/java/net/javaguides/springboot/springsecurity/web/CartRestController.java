package net.javaguides.springboot.springsecurity.web;

import net.javaguides.springboot.springsecurity.service.CartServices;
import net.javaguides.springboot.springsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartRestController {
    @Autowired
    private CartServices cartService;

    @Autowired
    private UserService userService;

    @PostMapping("/cart/add/{pid}/{qty}")
    public String addProductToCart(@PathVariable("pid") Long pcId,
    @PathVariable("qty") Integer quantity){
//        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//        Integer addednum = cartService.addProduct(pcId, user, quantity);
        return "added";
    }
//    @PostMapping("/cart/remove/{id}")
//    public String removeProductFromCart(@PathVariable("id") Long id){
//        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//        cartService.removeProduct(id,user.getId());
//        return "redirect:../../cart";
//    }


}

