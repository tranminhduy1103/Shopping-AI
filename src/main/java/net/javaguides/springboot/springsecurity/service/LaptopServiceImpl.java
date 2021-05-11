package net.javaguides.springboot.springsecurity.service;


import net.javaguides.springboot.springsecurity.Entity.Laptop.Laptop;
import net.javaguides.springboot.springsecurity.Entity.User;
import net.javaguides.springboot.springsecurity.repository.LaptopRepository;
import net.javaguides.springboot.springsecurity.web.dto.UserRegistrationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LaptopServiceImpl implements LaptopService {


    @Autowired
    LaptopRepository laptopRepository;

    @Override
    public Optional<Laptop> findById(Long id) {
        return laptopRepository.findById(id);
    }

//    @Override
//    public List<Laptop> search(String name) {
//            return laptopRepository.findByName(name);
//    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}
