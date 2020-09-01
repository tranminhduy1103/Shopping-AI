package net.javaguides.springboot.springsecurity.repository;


import net.javaguides.springboot.springsecurity.model.Class;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRepository extends JpaRepository<Class,Long> {


}
