package net.javaguides.springboot.springsecurity.service;

import net.javaguides.springboot.springsecurity.Entity.CartItem;
import net.javaguides.springboot.springsecurity.Entity.PCs;
import net.javaguides.springboot.springsecurity.Entity.User;
import net.javaguides.springboot.springsecurity.repository.CartRepository;
import net.javaguides.springboot.springsecurity.repository.PcsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServices {

    @Autowired
    private CartRepository cartRepo;

    @Autowired
    private PcsRepository pcsRepo;

    public List<CartItem> listCartItems(User user){
        return cartRepo.findByUser(user);
    }

    public Integer addProduct(Long pcId, Integer num, User user){
        PCs newpc = pcsRepo.findById(pcId).get();
        CartItem cart = new CartItem();
        cart.setUser(user);
        cart.setQuantity(num);
        cart.setPcs(newpc);
        return num;
    }

}
