package net.javaguides.springboot.springsecurity.service;


import net.javaguides.springboot.springsecurity.model.BasicItem;
import net.javaguides.springboot.springsecurity.model.Item;
import net.javaguides.springboot.springsecurity.repository.BasicRepository;
import net.javaguides.springboot.springsecurity.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    ItemRepository itemRepository;
    @Autowired
    BasicRepository basicRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }

    public List<Item> buildItem(String name){
        List<Item> list=itemRepository.findAll();

        List<Item> listOfItem= new ArrayList<Item>();
            for(Item y:list) {
                if (y.getRecipe1_name().equals(name) || y.getRecipe2_name().equals(name)){
                    listOfItem.add(y);
            }
        }
        return listOfItem;
    }


}
