package net.javaguides.springboot.springsecurity.web;

import net.javaguides.springboot.springsecurity.service.CartServices;
import net.javaguides.springboot.springsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CartController {

    @Autowired
    private CartServices cartServices;

    @Autowired
    private UserService userService;

    @GetMapping("/cart")
    public String showShoppingCart(Model model){
//        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//        List<CartItem> cartItems = cartServices.listCartItems(user);
//
//        model.addAttribute("cartItems",cartItems);
//        model.addAttribute("pageTitle","Shopping cart");
        String[] cartItems = new String[] {"Pc","Laptop","earphone"};
        model.addAttribute("cartItems", cartItems);
        return "Cart_page";
    }

}
