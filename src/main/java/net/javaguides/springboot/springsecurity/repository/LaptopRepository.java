package net.javaguides.springboot.springsecurity.repository;


import net.javaguides.springboot.springsecurity.Entity.Laptop.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Long> {

    Optional<Laptop> findById(Long id);
//    List<Laptop> findByName(String name);
}
