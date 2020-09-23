package net.javaguides.springboot.springsecurity.repository;


import net.javaguides.springboot.springsecurity.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends JpaRepository<Skill,Long> {
}
