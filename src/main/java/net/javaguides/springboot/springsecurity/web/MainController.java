package net.javaguides.springboot.springsecurity.web;

import net.javaguides.springboot.springsecurity.Exception.RecordNotFoundException;
import net.javaguides.springboot.springsecurity.model.Champs;
import net.javaguides.springboot.springsecurity.model.Item;
import net.javaguides.springboot.springsecurity.model.User;
import net.javaguides.springboot.springsecurity.repository.*;
import net.javaguides.springboot.springsecurity.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    ChampService champService;

    @Autowired
    UserRepository userRepository;

    @Autowired
    ItemServiceImpl itemService;

    @Autowired
    ItemRepository itemRepository;

    @Autowired
    ClassRepository classRepository;
    @Autowired
    OriginRepository originRepository;

    @GetMapping("/")
    public String root(Model model) {

//        return "redirect:/listofuser";
////        return "list-users";
        return "Main_Page";
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



    @GetMapping("/listofitem")
    public String listOfItem(Model model){
//        List<Item>list1=itemService.listOfTear();
//        model.addAttribute("list1",list1);
        model.addAttribute("basicItems",basicRepository.findAll());
        model.addAttribute("items", itemRepository.findAll());
        return "List_Item";
    }

    @GetMapping("listofSynergies")
    public String listofSynergies(Model model){

        model.addAttribute("classes",classRepository.findAll());
        model.addAttribute("origins",originRepository.findAll());
        model.addAttribute("champs",champRepository.findAll());


        return "List-Synergies";
    }



    @RequestMapping("champs/{id}")
    public String showDetail(@PathVariable Long id, Model model){
        Champs champs = champServiceIpml.findById(id).get();
        model.addAttribute("champ", champs);
        return "detailOfChamp";
    }

    @RequestMapping("items/{name}")
    public String BuildItem(@PathVariable String name, Model model){


        List<Item> items=  itemService.buildItem(name);
        model.addAttribute("basicItems",basicRepository.findAll());

        model.addAttribute("items",items);
        return "Build-Item";
    }





    @GetMapping("/listofuser")
    public String listofUser(Model model){
    List<User> list = userService.getAllUsers();
		model.addAttribute("users", list);
		return "Manage_member";
}

    @GetMapping("/teambuilder")
    public String teamBuilder(Model model){

        model.addAttribute("champs", champRepository.findAll());
        return "Team-Builder";
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

    @RequestMapping(path = "/createUser")
    public String addUser(Model model, @PathVariable("id") Optional<Long> id )
    {
        model.addAttribute("user", new User());

        return "add-editUser";
    }
    @GetMapping("/listofchamp")
    public String listOfChamp(Model model)
    {
        model.addAttribute("champs", champRepository.findAll());
        return "listofchamp";
    }

    @GetMapping("/Champs/search")
    public String search(@RequestParam("s") String s, Model model) {
        if (s.equals("")) {
            return "redirect:/Champs";
        }

        model.addAttribute("champs", champService.search(s));
        return "listofchamp";
    }
    @GetMapping("/manage_champ")
    public String manaChamp(Model model){
        model.addAttribute("champs", champRepository.findAll());
        return "Manage_champs";
    }
    @RequestMapping(path = "/createChamp")
    public String addUChapm(Model model, @PathVariable("id") Optional<Long> id )
    {
        model.addAttribute("champs", new Champs());

        return "add-editUser";
    }
    @GetMapping("/Manage_items")
    public String ManageItem(Model model){
//        List<Item>list1=itemService.listOfTear();
//        model.addAttribute("list1",list1);
        model.addAttribute("items", itemRepository.findAll());
        return "Manage_items";
    }
    @GetMapping("/Manage_basicItems")
    public String ManageBasicItem(Model model){
//        List<Item>list1=itemService.listOfTear();
//        model.addAttribute("list1",list1);awsdfghjk,jhgfdasdfhg
        model.addAttribute("basicItems",basicRepository.findAll());
        return "Manage_basicItems";
    }

//rererer
    @GetMapping("/Champ/search")
    public String search1(@RequestParam("s") String s, Model model) {
        if (s.equals("")) {
            return "redirect:/Champ";
        }
        model.addAttribute("champs", champService.search(s));
        return "Team-Builder";
    }






}
