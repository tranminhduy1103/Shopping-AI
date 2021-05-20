package net.javaguides.springboot.springsecurity.web;

import net.javaguides.springboot.springsecurity.Entity.Laptop.Laptop;
import net.javaguides.springboot.springsecurity.Entity.User;
import net.javaguides.springboot.springsecurity.Exception.RecordNotFoundException;
import net.javaguides.springboot.springsecurity.repository.ImageRepository;
import net.javaguides.springboot.springsecurity.repository.LaptopRepository;
import net.javaguides.springboot.springsecurity.repository.PCRepository;
import net.javaguides.springboot.springsecurity.repository.UserRepository;
import net.javaguides.springboot.springsecurity.service.LaptopService;
import net.javaguides.springboot.springsecurity.service.LaptopServiceImpl;
import net.javaguides.springboot.springsecurity.service.UserServiceImpl;
import net.javaguides.springboot.springsecurity.upload.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Optional;

/**
 * This is our MainController, this one will start first, load everything from here,...
 * we use this class so as to define some get and post method, provide some model for particular function to help us fletch data from data base, and
 * display data
 * We can call our Service or Repository here , which have been defined for their tasks)
 **/

@Controller
public class MainController {


    @Autowired
    UserServiceImpl userService;
    @Autowired
    UserRepository userRepository;
    @Autowired
    FileService fileService;

    @Autowired
    PCRepository pc_test;

    /**
     * List of Laptop - Query
     */
    @Autowired
    LaptopRepository laptopRepository;
    @Autowired
    LaptopServiceImpl laptopServiceimpl;
    @Autowired
    LaptopService laptopService;
    @Autowired
    ImageRepository imageRepository;


    @GetMapping("/")
    public String root(Model model) {
        return "redirect:/Menu";
    }


    @GetMapping("/Laptops")
    public String ListofLaptop(Model model) {
        model.addAttribute("Laptops", laptopRepository.findAll());
        model.addAttribute("Images", imageRepository.findAll());
        return "List-Of-Laptops";
    }

    @GetMapping("Laptops/{id}")
    public String Laptop_Detail(@PathVariable Long id, Model model) {
        Laptop laptop = laptopServiceimpl.findById(id).get();
        model.addAttribute("laptop", laptop);
        model.addAttribute("Images", imageRepository.findAll());
        return "laptopDetail";
    }


    @GetMapping("/detail")
    public String Product_Detail(Model model) {
        return "laptopDetail";
    }


    @GetMapping("/Menu")
    public String userView() {
        return "mainpage";
    }


    @GetMapping("/LIST")
    public String testlist(Model model) {
        model.addAttribute("PCS", pc_test.findAll());
        return "test";
    }

    @GetMapping("/Login_form")
    public String login(Model model) {
        return "Login_form";
    }

    @GetMapping("/champ")
    public String champView() {
        return "champ";
    }

    @RequestMapping("/403")
    public String accessDenied() {
        return "/403";
    }

    @RequestMapping("/adminview")
    public String adminView() {
        return "/Admin-page";
    }


    /*** CRUD User*/
    @RequestMapping(path = {"/add"})
    public String addEmployeeById(Model model, @PathVariable("id") Optional<Long> id) {
        model.addAttribute("user", new User());
        return "Add_member";
    }

    @RequestMapping(path = "/create", method = RequestMethod.POST)
    public String createUser(User user) {
        userService.create(user);
        return "redirect:/listofuser";
    }

    @RequestMapping(path = "/update", method = RequestMethod.POST)
    public String updateUser(User user) {
        userService.update(user);
        return "redirect:/listofuser";
    }


    @GetMapping("/listofuser")
    public String listofUser(Model model) {
        List<User> list = userService.getAllUsers();
        model.addAttribute("users", list);
        return "List-Of-User";
    }


    @RequestMapping(path = "/delete/{id}")
    public String deleteUserById(Model model, @PathVariable("id") Long id)
            throws RecordNotFoundException {
        userService.deleteUserById(id);
        return "redirect:/";
    }

    @RequestMapping(path = {"/edit", "/edit/{id}"})
    public String editUserById(Model model, @PathVariable("id") Optional<Long> id)
            throws RecordNotFoundException {
        if (id.isPresent()) {
            User entity = userService.getUserById(id.get());
            model.addAttribute("user", entity);
        } else {
            model.addAttribute("user", new User());
        }
        return "Edit_member";
    }


}








