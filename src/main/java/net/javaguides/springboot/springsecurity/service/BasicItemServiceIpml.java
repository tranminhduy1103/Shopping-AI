package net.javaguides.springboot.springsecurity.service;


import net.javaguides.springboot.springsecurity.Exception.RecordNotFoundException;
import net.javaguides.springboot.springsecurity.model.BasicItem;
import net.javaguides.springboot.springsecurity.model.Item;
import net.javaguides.springboot.springsecurity.repository.BasicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BasicItemServiceIpml implements BasicItemService {

    @Autowired
    BasicRepository basicRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }

    @Override
    public Optional<BasicItem> findById(Long id) {
        return basicRepository.findById(id);
    }


    public void deleteItemById(Long id) throws RecordNotFoundException {
        Optional<BasicItem> item = basicRepository.findById(id);

        if (item.isPresent()) {
            basicRepository.deleteById(id);
        } else {
            throw new RecordNotFoundException("No Basic Items record exist for given id");
        }
    }

    public BasicItem getItemById(Long id) throws RecordNotFoundException {
        Optional<BasicItem> item = basicRepository.findById(id);

        if (item.isPresent()) {
            return item.get();
        } else {
            throw new RecordNotFoundException("No  Basic items record exist for given id");
        }
    }


    public BasicItem create(BasicItem item) {
        BasicItem newEntity=item;
        newEntity.setName(item.getName());
        newEntity.setDes(item.getDes());
        newEntity.setImage(item.getImage());

        newEntity=basicRepository.save(newEntity);
        return newEntity;
    }

    public BasicItem update(BasicItem item) {
        Optional<BasicItem> newItem = basicRepository.findById(item.getId());

        if (newItem.isPresent()) {
            BasicItem newEntity = newItem.get();
            newEntity.setName(item.getName());
            newEntity.setDes(item.getDes());
            newEntity.setImage(item.getImage());

            newEntity=basicRepository.save(newEntity);

            return newEntity;
        } else {
            item = basicRepository.save(item);
            return item;
        }
    }

}
