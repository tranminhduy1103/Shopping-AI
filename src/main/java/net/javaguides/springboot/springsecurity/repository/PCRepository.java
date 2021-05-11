package net.javaguides.springboot.springsecurity.repository;

import net.javaguides.springboot.springsecurity.Entity.PCs.PC_test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PCRepository extends JpaRepository<PC_test, Long> {
}
