package net.javaguides.springboot.springsecurity.service;

import net.javaguides.springboot.springsecurity.Entity.CartItem;
import net.javaguides.springboot.springsecurity.Entity.Laptop.Laptop;
import net.javaguides.springboot.springsecurity.Entity.User;
import net.javaguides.springboot.springsecurity.repository.CartRepository;
import net.javaguides.springboot.springsecurity.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CartServices {

    @Autowired
    private CartRepository cartRepo;

    @Autowired
    private LaptopRepository lapRepo;

    public List<CartItem> listCartItems(User user){
        return cartRepo.findByUser(user);
    }

    @Transactional
    public Integer addProduct(Long lapId, User user, Integer quantity){
        Integer addedNum = quantity;

        Laptop laptop = lapRepo.findById(lapId).get();

        CartItem cart = cartRepo.findByUserAndLaptop(user, laptop);

        if (cart != null) {
            addedNum = cart.getQuantity() + quantity;
            cart.setQuantity(addedNum);
            cartRepo.save(cart);
        } else{
            cart = new CartItem();
            cart.setUser(user);
            cart.setQuantity(quantity);
            cart.setLaptop(laptop);
            cartRepo.save(cart);
            return quantity;
        }
        return addedNum;
    }
    @Transactional
    public void removeProduct(Long userId, Long lapId){
        cartRepo.deleteByUserAndProduct(userId, lapId);

    }

}
