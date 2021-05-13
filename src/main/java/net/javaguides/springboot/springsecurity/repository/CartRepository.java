package net.javaguides.springboot.springsecurity.repository;

import net.javaguides.springboot.springsecurity.Entity.CartItem;
import net.javaguides.springboot.springsecurity.Entity.Laptop.Laptop;
import net.javaguides.springboot.springsecurity.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartRepository extends JpaRepository<CartItem, Integer> {

    public List<CartItem> findByUser(User user);

    public CartItem findByUserAndLaptop(User user, Laptop laptop);

    @Query("DELETE FROM CartItem c WHERE c.user.id = ?1 AND c.laptop.id = ?2")
    @Modifying
    public void deleteByUserAndProduct(Long userId, Long productId);

    //@Query()
    //@Modifying
    //public void updateQuantity(int quantity, Long productId, Long userId);
}
