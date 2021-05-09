package net.javaguides.springboot.springsecurity.web;

import net.javaguides.springboot.springsecurity.Entity.CartItem;
import net.javaguides.springboot.springsecurity.Entity.User;
import net.javaguides.springboot.springsecurity.service.CartServices;
import net.javaguides.springboot.springsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CartController {

    @Autowired
    private CartServices cartServices;

    @Autowired
    private UserService userService;

    @GetMapping("/cart")
    public String showShoppingCart(Model model){
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        List<CartItem> cartItems = cartServices.listCartItems(user);
        model.addAttribute("cartItems", cartItems);
        return "Cart_page";
    }

}
