package net.javaguides.springboot.springsecurity.service;

import net.javaguides.springboot.springsecurity.model.Champs;

import net.javaguides.springboot.springsecurity.repository.ChampRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ChampServiceIpml implements ChampService {

    @Autowired
    ChampRepository champRepository;

    @Override
    public Optional<Champs> findById(Long id) {
        return champRepository.findById(id);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }

    @Override
    public List<Champs> search(String name) {
        return champRepository.findByName(name);
    }
}

