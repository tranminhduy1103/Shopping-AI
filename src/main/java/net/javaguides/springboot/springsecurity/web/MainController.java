package net.javaguides.springboot.springsecurity.web;

import net.javaguides.springboot.springsecurity.Exception.FileStorageException;
import net.javaguides.springboot.springsecurity.Exception.RecordNotFoundException;
import net.javaguides.springboot.springsecurity.Entity.*;
import net.javaguides.springboot.springsecurity.repository.*;
import net.javaguides.springboot.springsecurity.service.*;
import net.javaguides.springboot.springsecurity.upload.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

/**This is our MainController, this one will start first, load everything from here,...
 * we use this class so as to define some get and post method, provide some model for particular function to help us fletch data from data base, and
 * display data
 * We can call our Service or Repository here , which have been defined for their tasks)**/

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


    @GetMapping("/")
    public String root(Model model) {
        return "redirect:/test";
    }

    @GetMapping("/test")
    public String test(Model model) {
        return "list_laptop";
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
        return "login";
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
        return "test2";
    }


    @RequestMapping(path = "/delete/{id}")
    public String deleteUserById(Model model, @PathVariable("id") Long id)
            throws RecordNotFoundException {
        userService.deleteUserById(id);
        return "redirect:/";
    }


}








