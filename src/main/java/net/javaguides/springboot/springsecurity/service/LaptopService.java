package net.javaguides.springboot.springsecurity.service;

import net.javaguides.springboot.springsecurity.Entity.Laptop.Laptop;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;
import java.util.Optional;

public interface LaptopService extends UserDetailsService {
    Optional<Laptop> findById(Long id);
//    List<Laptop> search(String name);
}
