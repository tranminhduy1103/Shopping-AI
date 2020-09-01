package net.javaguides.springboot.springsecurity.repository;

import net.javaguides.springboot.springsecurity.model.Champ;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface ChampRepository extends JpaRepository<Champ,Long> {
    Optional<Champ> findById(Long id);
    List<Champ> findByName(String name);


}
