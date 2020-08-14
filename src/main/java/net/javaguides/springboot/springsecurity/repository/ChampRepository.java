package net.javaguides.springboot.springsecurity.repository;

import net.javaguides.springboot.springsecurity.model.Champs;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface ChampRepository extends JpaRepository<Champs,Long> {
    Optional<Champs> findById(Long id);
    List<Champs> findByName(String name);


}
