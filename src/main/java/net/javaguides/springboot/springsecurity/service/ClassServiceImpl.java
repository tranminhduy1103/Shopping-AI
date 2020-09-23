package net.javaguides.springboot.springsecurity.service;


import net.javaguides.springboot.springsecurity.Exception.RecordNotFoundException;
import net.javaguides.springboot.springsecurity.model.Class;
import net.javaguides.springboot.springsecurity.model.Origin;
import net.javaguides.springboot.springsecurity.repository.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClassServiceImpl implements ClassService {
    @Autowired
    ClassRepository classRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }

    @Override
    public Optional<Class> findById(Long id) {
        return classRepository.findById(id);
    }


    public void deleteItemById(Long id) throws RecordNotFoundException {
        Optional<Class> Class = classRepository.findById(id);

        if (Class.isPresent()) {
            classRepository.deleteById(id);
        } else {
            throw new RecordNotFoundException("No Classes record exist for given id");
        }
    }

    public Class getItemById(Long id) throws RecordNotFoundException {
        Optional<Class> Class = classRepository.findById(id);

        if (Class.isPresent()) {
            return Class.get();
        } else {
            throw new RecordNotFoundException("No  Classes record exist for given id");
        }
    }


    public Class create(Class Class) {
        Class newEntity = Class;
        newEntity.setName(Class.getName());
        newEntity.setDes(Class.getDes());
        newEntity.setImage(Class.getImage());
        newEntity.setNum1(Class.getNum1());
        newEntity.setNum2(Class.getNum2());
        newEntity.setNum3(Class.getNum3());
        newEntity.setNum4(Class.getNum4());
        newEntity.setSl1(Class.getSl1());
        newEntity.setSl2(Class.getSl2());
        newEntity.setSl3(Class.getSl3());
        newEntity.setSl4(Class.getSl4());


        newEntity = classRepository.save(newEntity);
        return newEntity;
    }

    public Class update(Class Class) {
        Optional<Class> newclass = classRepository.findById(Class.getId());

        if (newclass.isPresent()) {
            Class newEntity = newclass.get();
            newEntity.setName(Class.getName());
            newEntity.setDes(Class.getDes());
            newEntity.setImage(Class.getImage());
            newEntity.setNum1(Class.getNum1());
            newEntity.setNum2(Class.getNum2());
            newEntity.setNum3(Class.getNum3());
            newEntity.setNum4(Class.getNum4());
            newEntity.setSl1(Class.getSl1());
            newEntity.setSl2(Class.getSl2());
            newEntity.setSl3(Class.getSl3());
            newEntity.setSl4(Class.getSl4());


            newEntity = classRepository.save(newEntity);



            return newEntity;
        } else {
            Class = classRepository.save(Class);
            return Class;
        }
    }

}
