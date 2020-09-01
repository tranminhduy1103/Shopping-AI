package net.javaguides.springboot.springsecurity.service;



import net.javaguides.springboot.springsecurity.model.Item;

import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Optional;

public interface ItemService extends UserDetailsService {

    Optional<Item> findById(Long id);

}
