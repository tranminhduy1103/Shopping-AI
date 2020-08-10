package net.javaguides.springboot.springsecurity.repository;


import net.javaguides.springboot.springsecurity.model.Origin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OriginRepository extends JpaRepository<Origin,Long> {
}
