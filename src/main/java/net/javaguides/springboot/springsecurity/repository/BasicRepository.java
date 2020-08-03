package net.javaguides.springboot.springsecurity.repository;


import net.javaguides.springboot.springsecurity.model.BasicItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BasicRepository extends JpaRepository<BasicItem,Long> {
}
