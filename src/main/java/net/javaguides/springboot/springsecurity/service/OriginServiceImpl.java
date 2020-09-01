package net.javaguides.springboot.springsecurity.service;


import net.javaguides.springboot.springsecurity.Exception.RecordNotFoundException;
import net.javaguides.springboot.springsecurity.model.BasicItem;
import net.javaguides.springboot.springsecurity.model.Origin;
import net.javaguides.springboot.springsecurity.repository.OriginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OriginServiceImpl implements OriginService {
    @Autowired
    OriginRepository originRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }


    @Override
    public Optional<Origin> findById(Long id) {
        return originRepository.findById(id);
    }


    public void deleteItemById(Long id) throws RecordNotFoundException {
        Optional<Origin> item = originRepository.findById(id);

        if (item.isPresent()) {
            originRepository.deleteById(id);
        } else {
            throw new RecordNotFoundException("No Origins record exist for given id");
        }
    }

    public Origin getItemById(Long id) throws RecordNotFoundException {
        Optional<Origin> origin = originRepository.findById(id);

        if (origin.isPresent()) {
            return origin.get();
        } else {
            throw new RecordNotFoundException("No  Origins record exist for given id");
        }
    }


    public Origin create(Origin origin) {
        Origin newEntity = origin;
        newEntity.setName(origin.getName());
        newEntity.setDes(origin.getDes());
        newEntity.setImage(origin.getImage());
        newEntity.setNum1(origin.getNum1());
        newEntity.setNum2(origin.getNum2());
        newEntity.setNum3(origin.getNum3());
        newEntity.setNum4(origin.getNum4());
        newEntity.setSl1(origin.getSl1());
        newEntity.setSl2(origin.getSl2());
        newEntity.setSl3(origin.getSl3());
        newEntity.setSl4(origin.getSl4());


        newEntity = originRepository.save(newEntity);
        return newEntity;
    }

    public Origin update(Origin origin) {
        Optional<Origin> newOrigin = originRepository.findById(origin.getId());

        if (newOrigin.isPresent()) {
            Origin newEntity = newOrigin.get();
            newEntity.setName(origin.getName());
            newEntity.setDes(origin.getDes());
            newEntity.setImage(origin.getImage());
            newEntity.setNum1(origin.getNum1());
            newEntity.setNum2(origin.getNum2());
            newEntity.setNum3(origin.getNum3());
            newEntity.setNum4(origin.getNum4());
            newEntity.setSl1(origin.getSl1());
            newEntity.setSl2(origin.getSl2());
            newEntity.setSl3(origin.getSl3());
            newEntity.setSl4(origin.getSl4());


            newEntity = originRepository.save(newEntity);



            return newEntity;
        } else {
            origin = originRepository.save(origin);
            return origin;
        }
    }

}
