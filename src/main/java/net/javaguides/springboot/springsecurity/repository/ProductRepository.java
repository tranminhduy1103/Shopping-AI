package net.javaguides.springboot.springsecurity.repository;

import net.javaguides.springboot.springsecurity.Entity.ProductTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductTest, Long> {
}
