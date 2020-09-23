package net.javaguides.springboot.springsecurity.service;

import net.javaguides.springboot.springsecurity.model.Champ;
import net.javaguides.springboot.springsecurity.model.Origin;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Optional;

public interface OriginService extends UserDetailsService {
    Optional<Origin> findById(Long id);
}
