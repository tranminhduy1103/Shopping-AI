package net.javaguides.springboot.springsecurity.service;


import net.javaguides.springboot.springsecurity.model.BasicItem;
import net.javaguides.springboot.springsecurity.model.Skill;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Optional;

public interface SkillService extends UserDetailsService {
    Optional<Skill> findById(Long id);


}
