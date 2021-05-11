package net.javaguides.springboot.springsecurity.repository;


import net.javaguides.springboot.springsecurity.Entity.Image.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepository extends JpaRepository<Image, Long> {
}
