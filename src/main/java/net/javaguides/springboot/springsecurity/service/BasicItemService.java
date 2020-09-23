package net.javaguides.springboot.springsecurity.service;


import net.javaguides.springboot.springsecurity.model.BasicItem;
import net.javaguides.springboot.springsecurity.model.Champ;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Optional;


public interface BasicItemService extends UserDetailsService {
    Optional<BasicItem> findById(Long id);

}
