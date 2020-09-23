package net.javaguides.springboot.springsecurity.service;


import net.javaguides.springboot.springsecurity.model.Class;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Optional;

public interface ClassService extends UserDetailsService {
    Optional<Class> findById(Long id);
}
