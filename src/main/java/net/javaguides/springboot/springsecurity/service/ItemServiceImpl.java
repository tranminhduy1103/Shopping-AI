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

//    public List<Item> listOfTear(){
//        List<Item> list=itemRepository.findAll();
//        List<BasicItem> list1=basicRepository.findAll();
//        List<Item>listOfTear= new ArrayList<Item>();
//        for (BasicItem x:list1) {
//            for(Item y:list) {
//                if (y.getRecipe1_name().equals(x.getName()) || y.getRecipe2_name().equals(x.getName()))
//                    listOfTear.add(y);
//            }
//        }
//        return listOfTear;
//    }


}
