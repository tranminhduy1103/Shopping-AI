package net.javaguides.springboot.springsecurity.service;

import net.javaguides.springboot.springsecurity.Entity.Laptop.Laptop;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;
import java.util.Optional;

public interface LaptopService extends UserDetailsService {
    Optional<Laptop> findById(Long id);
//    List<Laptop> search(String name);
    
    // get all Laptop
    public List<Laptop> getAllLaptop();
    
    //save laptop
    public void saveLaptop(Laptop laptop);
    
    //get Laptop by Id
    public Laptop getLaptopById(long id);
    
    //delete laptop by id
    public void deleteLaptopById(long id);
}
