package net.javaguides.springboot.springsecurity.service;


import net.javaguides.springboot.springsecurity.Exception.RecordNotFoundException;
import net.javaguides.springboot.springsecurity.model.BasicItem;
import net.javaguides.springboot.springsecurity.model.Skill;
import net.javaguides.springboot.springsecurity.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SkillServiceImpl implements SkillService {
    @Autowired
    SkillRepository skillRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }

    @Override
    public Optional<Skill> findById(Long id) {
        return skillRepository.findById(id);
    }


    public void deleteItemById(Long id) throws RecordNotFoundException {
        Optional<Skill> skill = skillRepository.findById(id);

        if (skill.isPresent()) {
            skillRepository.deleteById(id);
        } else {
            throw new RecordNotFoundException("No Skills record exist for given id");
        }
    }

    public Skill getItemById(Long id) throws RecordNotFoundException {
        Optional<Skill> skill = skillRepository.findById(id);

        if (skill.isPresent()) {
            return skill.get();
        } else {
            throw new RecordNotFoundException("No  Skills record exist for given id");
        }
    }


    public Skill create(Skill skill) {
        Skill newEntity=skill;
        newEntity.setName(skill.getName());
        newEntity.setDes(skill.getDes());
        newEntity.setImage(skill.getImage());
        newEntity.setDame(skill.getDame());

        newEntity=skillRepository.save(newEntity);
        return newEntity;
    }

    public Skill update(Skill skill) {
        Optional<Skill> newSkill = skillRepository.findById(skill.getId());

        if (newSkill.isPresent()) {
            Skill newEntity = newSkill.get();
            newEntity.setName(skill.getName());
            newEntity.setDes(skill.getDes());
            newEntity.setImage(skill.getImage());
            newEntity.setDame(skill.getDame());

            newEntity=skillRepository.save(newEntity);

            return newEntity;
        } else {
            skill = skillRepository.save(skill);
            return skill;
        }
    }
}
