package net.javaguides.springboot.springsecurity.service;

import net.javaguides.springboot.springsecurity.Exception.RecordNotFoundException;
import net.javaguides.springboot.springsecurity.model.Champ;
import net.javaguides.springboot.springsecurity.repository.ChampRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ChampServiceIpml implements ChampService {

    @Autowired
    ChampRepository champRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }

    @Override
    public Optional<Champ> findById(Long id) {
        return champRepository.findById(id);
    }



    @Override
    public List<Champ> search(String name) {
        return champRepository.findByName(name);
    }

    public void deleteChampById(Long id) throws RecordNotFoundException {
        Optional<Champ> champs = champRepository.findById(id);

        if (champs.isPresent()) {
            champRepository.deleteById(id);
        } else {
            throw new RecordNotFoundException("No user record exist for given id");
        }
    }

    public Champ getChampById(Long id) throws RecordNotFoundException {
        Optional<Champ> champs = champRepository.findById(id);

        if (champs.isPresent()) {
            return champs.get();
        } else {
            throw new RecordNotFoundException("No champion record exist for given id");
        }
    }



    public Champ create(Champ champ) {
        Champ newEntity = champ;
        newEntity.setName(champ.getName());
        newEntity.setImage(champ.getImage());
        newEntity.setCost(champ.getCost());
        newEntity.setCategorize(champ.getCategorize());
        newEntity.setCategorize1(champ.getCategorize1());
        newEntity.setOrigin(champ.getOrigin());
        newEntity.setOrigin1(champ.getOrigin1());
        newEntity.setHealth(champ.getHealth());
        newEntity.setArmor(champ.getArmor());
        newEntity.setDamage(champ.getDamage());
        newEntity.setDps(champ.getDps());
        newEntity.setMana(champ.getMana());
        newEntity.setMR(champ.getMR());
        newEntity.setSkill_name(champ.getSkill_name());
        newEntity.setSpeed(champ.getSpeed());
        newEntity.setRe_item1(champ.getRe_item1());
        newEntity.setRe_item2(champ.getRe_item2());
        newEntity.setRe_item3(champ.getRe_item3());
        newEntity.setStory(champ.getStory());
        newEntity=champRepository.save(newEntity);
        return newEntity;
    }

    public Champ update(Champ champ) {
        Optional<Champ> newChamp = champRepository.findById(champ.getId());

        if(newChamp.isPresent())
        {
            Champ newEntity = newChamp.get();
            newEntity.setName(champ.getName());
            newEntity.setImage(champ.getImage());
            newEntity.setCost(champ.getCost());
            newEntity.setCategorize(champ.getCategorize());
            newEntity.setCategorize1(champ.getCategorize1());
            newEntity.setOrigin(champ.getOrigin());
            newEntity.setOrigin1(champ.getOrigin1());
            newEntity.setHealth(champ.getHealth());
            newEntity.setArmor(champ.getArmor());
            newEntity.setDamage(champ.getDamage());
            newEntity.setDps(champ.getDps());
            newEntity.setMana(champ.getMana());
            newEntity.setMR(champ.getMR());
            newEntity.setSpeed(champ.getSpeed());
            newEntity.setSkill_name(champ.getSkill_name());
            newEntity.setRe_item1(champ.getRe_item1());
            newEntity.setRe_item2(champ.getRe_item2());
            newEntity.setRe_item3(champ.getRe_item3());
            newEntity.setStory(champ.getStory());
            newEntity=champRepository.save(newEntity);
            return newEntity;
        } else {
            champ = champRepository.save(champ);
            return champ;
        }
    }


}

