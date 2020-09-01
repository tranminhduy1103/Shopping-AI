package net.javaguides.springboot.springsecurity.service;

import net.javaguides.springboot.springsecurity.model.Champ;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;
import java.util.Optional;

public interface ChampService extends UserDetailsService  {

    Optional<Champ> findById(Long id);
    List<Champ>search(String name);


}
