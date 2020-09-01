package net.javaguides.springboot.springsecurity.repository;


import net.javaguides.springboot.springsecurity.model.Number;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NumberRepository extends JpaRepository<Number,Long> {
}
