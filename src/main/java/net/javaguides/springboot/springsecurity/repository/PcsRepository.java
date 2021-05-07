package net.javaguides.springboot.springsecurity.repository;

import net.javaguides.springboot.springsecurity.Entity.PCs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PcsRepository extends JpaRepository<PCs, Long> {
}
