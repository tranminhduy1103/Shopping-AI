package net.javaguides.springboot.springsecurity.service;

import net.javaguides.springboot.springsecurity.Entity.CartItem;
import net.javaguides.springboot.springsecurity.Entity.ProductTest;
import net.javaguides.springboot.springsecurity.Entity.User;
import net.javaguides.springboot.springsecurity.repository.CartRepository;
import net.javaguides.springboot.springsecurity.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServices {

    @Autowired
    private CartRepository cartRepo;

    @Autowired
    private ProductRepository proRepo;

    public List<CartItem> listCartItems(User user){
        return cartRepo.findByUser(user);
    }

    public Integer addProduct(Long productId, User user, Integer quantity){
        Integer addedNum = quantity;

        ProductTest product = proRepo.findById(productId).get();

        CartItem cart = cartRepo.findByUserAndProduct(user, product);

        if (cart != null) {
            addedNum = cart.getQuantity() + quantity;
            cart.setQuantity(addedNum);
        } else{
            cart = new CartItem();
            cart.setUser(user);
            cart.setQuantity(quantity);
            cart.setProduct(product);
            return quantity;
        }
        return addedNum;
    }

    public void removeProduct(Long productId, Long userId){
        cartRepo.deleteByUserAndProduct(userId, productId);

    }

//    public float updateQuantity(Long productId, int quantity, Long userId){
//        cartRepo.updateQuantity(quantity, productId, userId);
//        ProductTest product = proRepo.findById(productId).get();
//
//        float subtotal = product.getPrice()*quantity;
//        return subtotal;
//    }

}
