package net.javaguides.springboot.springsecurity.service;

import net.javaguides.springboot.springsecurity.model.Champs;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;
import java.util.Optional;

public interface ChampService extends UserDetailsService  {

    Optional<Champs> findById(Long id);
    List<Champs>search(String name);


}
