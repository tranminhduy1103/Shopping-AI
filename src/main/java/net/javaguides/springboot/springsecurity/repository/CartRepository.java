package net.javaguides.springboot.springsecurity.repository;

import net.javaguides.springboot.springsecurity.Entity.CartItem;
import net.javaguides.springboot.springsecurity.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartRepository extends JpaRepository<CartItem, Integer> {

    public List<CartItem> findByUser(User user);
}
