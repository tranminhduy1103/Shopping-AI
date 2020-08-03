package net.javaguides.springboot.springsecurity.web;

import net.javaguides.springboot.springsecurity.Exception.RecordNotFoundException;
import net.javaguides.springboot.springsecurity.model.Champs;
import net.javaguides.springboot.springsecurity.model.Item;
import net.javaguides.springboot.springsecurity.model.User;
import net.javaguides.springboot.springsecurity.repository.BasicRepository;
import net.javaguides.springboot.springsecurity.repository.ChampRepository;
import net.javaguides.springboot.springsecurity.repository.ItemRepository;
import net.javaguides.springboot.springsecurity.repository.UserRepository;
import net.javaguides.springboot.springsecurity.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Optional;

/**This is our MainController, this one will start first, load everything from here,...
 * we use this class so as to define some get and post method, provide some model for particular function to help us fletch data from data base, and
 * display data
 * We can call our Service or Repository here , which have been defined for their tasks)**/

@Controller
public class MainController {

    @Autowired
    BasicRepository basicRepository;
    @Autowired
    UserServiceImpl userService;
    @Autowired
    ChampRepository champRepository;
    @Autowired
    ChampServiceIpml champServiceIpml;

    @Autowired
    UserRepository userRepository;

    @Autowired
    ItemServiceImpl itemService;

    @Autowired
    ItemRepository itemRepository;

    @GetMapping("/")
    public String root(Model model) {

        return "redirect:/listofitem";
////        return "list-users";
//        return "Main_Page";
    }


    @GetMapping("/Login_form")
    public String login(Model model) {
        return "Login_form";
    }


    @GetMapping("/Menu")
    public String userView(){
        return "Menu";
    }
    @GetMapping("/champ")
    public String adminView(){
        return "champ";
    }
    @RequestMapping("/403")
    public String accessDenied() {
        return "/403";
    }


    @GetMapping("/listofchamp")
    public String listOfChamp(Model model)
    {
        model.addAttribute("champs", champRepository.findAll());
        return "listofchamp";
    }

    @GetMapping("/listofitem")
    public String listOfItem(Model model){
//        List<Item>list1=itemService.listOfTear();
//        model.addAttribute("list1",list1);
        model.addAttribute("basicItems",basicRepository.findAll());
        model.addAttribute("items", itemRepository.findAll());
        return "List_Item";
    }



    @RequestMapping("champs/{id}")
    public String showDetail(@PathVariable Long id, Model model){
        Champs champs = champServiceIpml.findById(id).get();
//        System.out.println(champServiceIpml.findById(id));
        model.addAttribute("champ", champs);
        return "detailOfChamp";
    }





    @GetMapping("/listofuser")
    public String listofUser(Model model){
    List<User> list = userService.getAllUsers();
		model.addAttribute("users", list);
		return "test";
}


    @RequestMapping(path = {"/edit", "/edit/{id}"})
    public String editUserById(Model model, @PathVariable("id") Optional<Long> id)
            throws RecordNotFoundException
    {
        if (id.isPresent()) {
            User user = userService.getUserById(id.get());
            model.addAttribute("user", user);
        } else {
            model.addAttribute("user", new User());
        }
        return "addForm";
    }

    @RequestMapping(path = "/delete/{id}")
    public String deleteUserById(Model model, @PathVariable("id") Long id)
            throws RecordNotFoundException
    {
        userService.deleteUserById(id);
        return "redirect:/";
    }

    @RequestMapping(path = "/createUser", method = RequestMethod.POST)
    public String createOrUpdateEmployee(User user)
    {
        userService.createOrUpdateUser(user);
        return "redirect:/";
    }






}
