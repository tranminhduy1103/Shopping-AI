package net.javaguides.springboot.springsecurity.service;


import net.javaguides.springboot.springsecurity.Exception.RecordNotFoundException;
import net.javaguides.springboot.springsecurity.model.Champ;
import net.javaguides.springboot.springsecurity.model.Item;
import net.javaguides.springboot.springsecurity.repository.BasicRepository;
import net.javaguides.springboot.springsecurity.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    ItemRepository itemRepository;



    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }

    public List<Item> buildItem(String name){
        List<Item> list=itemRepository.findAll();

        List<Item> listOfItem = new ArrayList<Item>();
        for (Item y : list) {
            if (y.getRecipe1_name().equals(name) || y.getRecipe2_name().equals(name)) {
                listOfItem.add(y);
            }
        }
        return listOfItem;
    }


    @Override
    public Optional<Item> findById(Long id) {
        return itemRepository.findById(id);
    }


    public void deleteItemById(Long id) throws RecordNotFoundException {
        Optional<Item> item = itemRepository.findById(id);

        if (item.isPresent()) {
            itemRepository.deleteById(id);
        } else {
            throw new RecordNotFoundException("No Items record exist for given id");
        }
    }

    public Item getItemById(Long id) throws RecordNotFoundException {
        Optional<Item> item = itemRepository.findById(id);

        if (item.isPresent()) {
            return item.get();
        } else {
            throw new RecordNotFoundException("No Items record exist for given id");
        }
    }


    public Item create(Item item) {
        Item newEntity=item;
        newEntity.setName(item.getName());
        newEntity.setDes(item.getDes());
        newEntity.setImage(item.getImage());
        newEntity.setRecipe1_name(item.getRecipe1_name());
        newEntity.setRecipe2_name(item.getRecipe2_name());
        newEntity=itemRepository.save(newEntity);
        return newEntity;
    }

    public Item update(Item item) {
        Optional<Item> newItem = itemRepository.findById(item.getId());

        if (newItem.isPresent()) {
            Item newEntity = newItem.get();
            newEntity.setName(item.getName());
            newEntity.setDes(item.getDes());
            newEntity.setImage(item.getImage());
            newEntity.setRecipe1_name(item.getRecipe1_name());
            newEntity.setRecipe2_name(item.getRecipe2_name());
            newEntity=itemRepository.save(newEntity);

            return newEntity;
        } else {
            item = itemRepository.save(item);
            return item;
        }
    }

}
