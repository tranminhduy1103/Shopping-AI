package net.javaguides.springboot.springsecurity.service;

import net.javaguides.springboot.springsecurity.Exception.RecordNotFoundException;
import org.springframework.security.core.userdetails.UserDetailsService;

import net.javaguides.springboot.springsecurity.Entity.User;
import net.javaguides.springboot.springsecurity.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);


    User save(UserRegistrationDto registration);

    User getUserById(Long uid) throws RecordNotFoundException;
}
