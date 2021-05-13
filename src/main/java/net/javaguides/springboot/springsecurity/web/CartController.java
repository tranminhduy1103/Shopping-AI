package net.javaguides.springboot.springsecurity.web;

import net.javaguides.springboot.springsecurity.Entity.CartItem;
import net.javaguides.springboot.springsecurity.Exception.RecordNotFoundException;
import net.javaguides.springboot.springsecurity.repository.ImageRepository;
import net.javaguides.springboot.springsecurity.service.CartServices;
import net.javaguides.springboot.springsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CartController {

    @Autowired
    ImageRepository imageRepository;

    @Autowired
    private CartServices cartServices;

    @Autowired
    private UserService userService;

    @GetMapping("/cart")
    public String showShoppingCart(Model model) throws RecordNotFoundException {
        String email;

        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        if (principal instanceof UserDetails) {
            email = ((UserDetails) principal).getUsername();
        } else {
            email = principal.toString();
        }
        List<CartItem> cart = cartServices.listCartItems(userService.findByEmail(email));
        double total = 0;
        for (CartItem item : cart) {
            total += item.getSubtotal();
        }
        model.addAttribute("cartItems", cart);

        model.addAttribute("Total", total);

        model.addAttribute("Images", imageRepository.findAll());

        return "Cart_page";
    }

    @RequestMapping(value = "/cart/remove/{id}")
    public String removeProductFromCart(Model model, @PathVariable("id") Long id)
            throws RecordNotFoundException {
        String email;

        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        if (principal instanceof UserDetails) {
            email = ((UserDetails) principal).getUsername();
        } else {
            email = principal.toString();
        }
        cartServices.removeProduct(userService.findByEmail(email).getId(), id);
        return "redirect:/cart";
    }

    @GetMapping("/checkout")
    public String Checkout(Model model) {
        String email;

        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        if (principal instanceof UserDetails) {
            email = ((UserDetails) principal).getUsername();
        } else {
            email = principal.toString();
        }
        List<CartItem> cart = cartServices.listCartItems(userService.findByEmail(email));
        double total = 0;
        for (CartItem item : cart) {
            total += item.getSubtotal();
        }
        model.addAttribute("cartItems", cart);

        model.addAttribute("Total", total);

        return "Checkout";
    }

    @RequestMapping("/cart/add/{pid}")
    public String addProductToCart(@PathVariable("pid") Long pcId){
        String email;

        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        if (principal instanceof UserDetails) {
            email = ((UserDetails) principal).getUsername();
        } else {
            email = principal.toString();
        }
        Integer addednum = cartServices.addProduct(pcId, userService.findByEmail(email), 1);
        return "redirect:/cart";
    }
}
