package net.javaguides.springboot.springsecurity.web;

import net.javaguides.springboot.springsecurity.Exception.FileStorageException;
import net.javaguides.springboot.springsecurity.Exception.RecordNotFoundException;
import net.javaguides.springboot.springsecurity.model.*;
import net.javaguides.springboot.springsecurity.model.Class;
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
    FileService fileService;
    @Autowired
    ItemServiceImpl itemService;

    @Autowired
    ItemRepository itemRepository;
    @Autowired
    NumberRepository numberRepository;
    @Autowired
    SkillRepository skillRepository;
    @Autowired
    ClassRepository classRepository;
    @Autowired
    OriginRepository originRepository;
    @Autowired
    SkillServiceImpl skillService;
    @Autowired
    ClassServiceImpl classService;
    @Autowired
    OriginServiceImpl originService;
    @Autowired
    BasicItemServiceIpml basicItemServiceIpml;

    @GetMapping("/")
    public String root(Model model) {


        return "redirect:/Menu";

    }


    @GetMapping("/Login_form")
    public String login(Model model) {
        return "Login_form";
    }


    @GetMapping("/Menu")
    public String userView() {
        return "Menu";
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


    @GetMapping("/listofitem")
    public String listOfItem(Model model) {
//        List<Item>list1=itemService.listOfTear();
//        model.addAttribute("list1",list1);
        model.addAttribute("basicItems", basicRepository.findAll());
        model.addAttribute("items", itemRepository.findAll());
        return "List_Item";
    }

    @GetMapping("listofSynergies")
    public String listofSynergies(Model model) {
        model.addAttribute("nums", numberRepository.findAll());
        model.addAttribute("classes", classRepository.findAll());
        model.addAttribute("origins", originRepository.findAll());
        model.addAttribute("champs", champRepository.findAll());
        return "List-Synergies";
    }


    @RequestMapping("champs/{id}")
    public String showDetail(@PathVariable Long id, Model model) {
        Champ champs = champServiceIpml.findById(id).get();
        model.addAttribute("champ", champs);
        model.addAttribute("classes", classRepository.findAll());
        model.addAttribute("origins", originRepository.findAll());
        model.addAttribute("skills", skillRepository.findAll());
        model.addAttribute("items", itemRepository.findAll());
        return "detailOfChamp";
    }

    @RequestMapping("items/{name}")
    public String BuildItem(@PathVariable String name, Model model) {


        List<Item> items = itemService.buildItem(name);
        model.addAttribute("basicItems", basicRepository.findAll());

        model.addAttribute("items", items);
        return "Build-Item";
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
        return "edit-member";
    }

    @RequestMapping(path = {"/add"})
    public String addEmployeeById(Model model, @PathVariable("id") Optional<Long> id) {
        model.addAttribute("user", new User());
        return "add-member";
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
        return "Manage_member";
    }

    @GetMapping("/manage_class")
    public String manageclass(Model model) {

        model.addAttribute("classes", classRepository.findAll());
        return "manage_class";
    }
    @GetMapping("/manage_origin")
    public String manageorigin(Model model) {

        model.addAttribute("origins", originRepository.findAll());
        return "manage_origin";
    }

    @GetMapping("/listofchamp")
    public String listOfChamp(Model model) {
        model.addAttribute("champs", champRepository.findAll());
        model.addAttribute("origins", originRepository.findAll());
        model.addAttribute("classes", classRepository.findAll());
        return "listofchamp";
    }

    @GetMapping("/teambuilder")
    public String teamBuilder(Model model) {

        model.addAttribute("champs", champRepository.findAll());
        return "Team-Builder";
    }


    @RequestMapping(path = "/delete/{id}")
    public String deleteUserById(Model model, @PathVariable("id") Long id)
            throws RecordNotFoundException {
        userService.deleteUserById(id);
        return "redirect:/";
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
    public String manaChamp(Model model) {
        model.addAttribute("champs", champRepository.findAll());
        return "Manage_champs";
    }


    @GetMapping("/Manage_items")
    public String ManageItem(Model model) {

        model.addAttribute("items", itemRepository.findAll());
        return "Manage_items";
    }
    @GetMapping("/Manage_skill")
    public String ManageSkill(Model model) {
        model.addAttribute("skills", skillRepository.findAll());
        return "manage_skill";
    }

    @GetMapping("/Manage_synergies")
    public String ManageSynergies(Model model) {
        model.addAttribute("nums", numberRepository.findAll());
        model.addAttribute("origins", originRepository.findAll());
        model.addAttribute("classes", classRepository.findAll());
        return "Manage_synergies";
    }

    @GetMapping("/Manage_basicItems")
    public String ManageBasicItem(Model model) {
        model.addAttribute("basicItems", basicRepository.findAll());
        return "Manage_basicItems";
    }

    @GetMapping("/Champ/search")
    public String search1(@RequestParam("s") String s, Model model) {
        if (s.equals("")) {
            return "redirect:/Champ";
        }
        model.addAttribute("champs", champService.search(s));
        return "Team-Builder";
    }

    @RequestMapping(path = {"/edit-champ", "/edit-champ/{id}"})
    public String editChampById(Model model, @PathVariable("id") Optional<Long> id)
            throws RecordNotFoundException {
        if (id.isPresent()) {
            Champ entity = champServiceIpml.getChampById(id.get());
            model.addAttribute("champ", entity);
        } else {
            model.addAttribute("champ", new Champ());
        }
        return "Edit-champ";
    }

    @RequestMapping(path = {"/addchamp"})
    public String addChampById(Model model) {
        model.addAttribute("champ", new Champ());
        return "Add-champ";
    }

    @RequestMapping(path = "/createchamp", method = RequestMethod.POST)
    public String createChamp(@RequestParam("file") MultipartFile file, Champ champs) throws FileStorageException {
        if (file.isEmpty() || file.getOriginalFilename().equals("")) {
            return "redirect:/addchamp";
        } else {
            String storageLink = fileService.uploadFile(file);

            champs.setImage(storageLink);
            champRepository.save(champs);
            champServiceIpml.create(champs);
        }
        return "redirect:/manage_champ";
    }

    @RequestMapping(path = "/updatechamp", method = RequestMethod.POST)
    public String editChamp(@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes, Champ champs) throws FileStorageException {
        if (file.isEmpty() || file.getOriginalFilename().equals("")) {
            Champ champs1 = champs;
            champRepository.save(champs);
        } else {
            String storageLink = fileService.uploadFile(file);
            champs.setImage(storageLink);
            champRepository.save(champs);
            champServiceIpml.update(champs);
        }
        return "redirect:/manage_champ";
    }
    @RequestMapping(path = "/deletechamp/{id}")
    public String deleteChampById(Model model, @PathVariable("id") Long id)
            throws RecordNotFoundException {
        champServiceIpml.deleteChampById(id);
        return "redirect:/manage_champ";
    }


    /**Item */


    @RequestMapping(path = "/deleteitem/{id}")
    public String deleteItemById(Model model, @PathVariable("id") Long id)
            throws RecordNotFoundException {
        itemService.deleteItemById(id);
        return "redirect:/Manage_items";
    }
    @RequestMapping(path = {"/edit-item", "/edit-item/{id}"})
    public String editItemById(Model model, @PathVariable("id") Optional<Long> id)
            throws RecordNotFoundException {
        if (id.isPresent()) {
            Item entity = itemService.getItemById(id.get());
            model.addAttribute("items", entity);
        } else {
            model.addAttribute("items", new Item());
        }
        return "Edit-item";
    }

    @RequestMapping(path = {"/additem"})
    public String addItemById(Model model) {
        model.addAttribute("items", new Item());
        return "add-item";
    }

    @RequestMapping(path = "/createitem", method = RequestMethod.POST)
    public String createItem(@RequestParam("file") MultipartFile file, Item item) throws FileStorageException {
        if (file.isEmpty() || file.getOriginalFilename().equals("")) {
            return "redirect:/additem";
        } else {
            String storageLink = fileService.uploadFile(file);

            item.setImage(storageLink);
            itemRepository.save(item);
            itemService.create(item);
        }
        return "redirect:/Manage_items";
    }

    @RequestMapping(path = "/updateitem", method = RequestMethod.POST)
    public String editItem(@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes, Item item) throws FileStorageException {
        if (file.isEmpty() || file.getOriginalFilename().equals("")) {
            Item item1 = item;
            itemRepository.save(item);
        } else {
            String storageLink = fileService.uploadFile(file);
            item.setImage(storageLink);
            itemRepository.save(item);
            itemService.update(item);
        }
        return "redirect:/Manage_items";
    }

    /**Basic Item */
    @RequestMapping(path = "/deletebitem/{id}")
    public String deleteBItemById(Model model, @PathVariable("id") Long id)
            throws RecordNotFoundException {
        itemService.deleteItemById(id);
        return "redirect:/Manage_basicItems";
    }
    @RequestMapping(path = {"/edit-bitem", "/edit-bitem/{id}"})
    public String editBItemById(Model model, @PathVariable("id") Optional<Long> id)
            throws RecordNotFoundException {
        if (id.isPresent()) {
            BasicItem entity = basicItemServiceIpml.getItemById(id.get());
            model.addAttribute("items", entity);
        } else {
            model.addAttribute("items", new BasicItem());
        }
        return "Edit-bitem";
    }

    @RequestMapping(path = {"/addbitem"})
    public String addBItemById(Model model) {
        model.addAttribute("items", new BasicItem());
        return "add-bitem";
    }

    @RequestMapping(path = "/createbitem", method = RequestMethod.POST)
    public String createBItem(@RequestParam("file") MultipartFile file, BasicItem item) throws FileStorageException {
        if (file.isEmpty() || file.getOriginalFilename().equals("")) {
            return "redirect:/addbitem";
        } else {
            String storageLink = fileService.uploadFile(file);

            item.setImage(storageLink);
            basicRepository.save(item);
            basicItemServiceIpml.create(item);
        }
        return "redirect:/Manage_basicItems";
    }

    @RequestMapping(path = "/updatebitem", method = RequestMethod.POST)
    public String editBItem(@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes, BasicItem item) throws FileStorageException {
        if (file.isEmpty() || file.getOriginalFilename().equals("")) {
            BasicItem item1 = item;
            basicRepository.save(item);
        } else {
            String storageLink = fileService.uploadFile(file);
            item.setImage(storageLink);
            basicRepository.save(item);
            basicItemServiceIpml.update(item);
        }
        return "redirect:/Manage_basicItems";
    }




    /**Class */
    @RequestMapping(path = "/deleteclass/{id}")
    public String deleteClassById(Model model, @PathVariable("id") Long id)
            throws RecordNotFoundException {
        classService.deleteItemById(id);
        return "redirect:/manage_class";
    }
    @RequestMapping(path = {"/edit-class", "/edit-class/{id}"})
    public String editClassId(Model model, @PathVariable("id") Optional<Long> id)
            throws RecordNotFoundException {
        if (id.isPresent()) {
            Class entity = classService.getItemById(id.get());
            model.addAttribute("classes", entity);
        } else {
            model.addAttribute("classes", new Class());
        }
        return "Edit-class";
    }

    @RequestMapping(path = {"/addclass"})
    public String addClassById(Model model) {
        model.addAttribute("classes", new Class());
        return "add-class";
    }

    @RequestMapping(path = "/createclass", method = RequestMethod.POST)
    public String createBItem(@RequestParam("file") MultipartFile file, Class item) throws FileStorageException {
        if (file.isEmpty() || file.getOriginalFilename().equals("")) {
            return "redirect:/addclass";
        } else {
            String storageLink = fileService.uploadFile(file);

            item.setImage(storageLink);
            classRepository.save(item);
            classService.create(item);
        }
        return "redirect:/manage_class";
    }

    @RequestMapping(path = "/updateclass", method = RequestMethod.POST)
    public String editClass(@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes, Class item) throws FileStorageException {
        if (file.isEmpty() || file.getOriginalFilename().equals("")) {
            Class item1 = item;
            classRepository.save(item);
        } else {
            String storageLink = fileService.uploadFile(file);
            item.setImage(storageLink);
            classRepository.save(item);
            classService.update(item);
        }
        return "redirect:/manage_class";
    }



    /**Origin */
    @RequestMapping(path = "/deleteorigin/{id}")
    public String deleteOriginById(Model model, @PathVariable("id") Long id)
            throws RecordNotFoundException {
        originService.deleteItemById(id);
        return "redirect:/manage_origin";
    }
    @RequestMapping(path = {"/edit-origin", "/edit-origin/{id}"})
    public String editOriginId(Model model, @PathVariable("id") Optional<Long> id)
            throws RecordNotFoundException {
        if (id.isPresent()) {
            Origin entity = originService.getItemById(id.get());
            model.addAttribute("origins", entity);
        } else {
            model.addAttribute("origins", new Origin());
        }
        return "Edit-origin";
    }

    @RequestMapping(path = {"/addorigin"})
    public String addOriginById(Model model) {
        model.addAttribute("origins", new Origin());
        return "add-origin";
    }

    @RequestMapping(path = "/createorigin", method = RequestMethod.POST)
    public String createOrigin(@RequestParam("file") MultipartFile file, Origin item) throws FileStorageException {
        if (file.isEmpty() || file.getOriginalFilename().equals("")) {
            return "redirect:/addorigin";
        } else {
            String storageLink = fileService.uploadFile(file);

            item.setImage(storageLink);
            originRepository.save(item);
            originService.create(item);
        }
        return "redirect:/manage_origin";
    }

    @RequestMapping(path = "/updateorigin", method = RequestMethod.POST)
    public String editClass(@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes, Origin item) throws FileStorageException {
        if (file.isEmpty() || file.getOriginalFilename().equals("")) {
            Origin item1 = item;
            originRepository.save(item);
        } else {
            String storageLink = fileService.uploadFile(file);
            item.setImage(storageLink);
            originRepository.save(item);
            originService.update(item);
        }
        return "redirect:/manage_origin";
    }



    /** Skill*/
    @RequestMapping(path = "/deleteskill/{id}")
    public String deleteSkillById(Model model, @PathVariable("id") Long id)
            throws RecordNotFoundException {
        skillService.deleteItemById(id);
        return "redirect:/Manage_skill";
    }
    @RequestMapping(path = {"/edit-skill", "/edit-skill/{id}"})
    public String editskillId(Model model, @PathVariable("id") Optional<Long> id)
            throws RecordNotFoundException {
        if (id.isPresent()) {
            Skill entity = skillService.getItemById(id.get());
            model.addAttribute("skills", entity);
        } else {
            model.addAttribute("skills", new Skill());
        }
        return "Edit-skill";
    }

    @RequestMapping(path = {"/addskill"})
    public String addSkillById(Model model) {
        model.addAttribute("skills", new Skill());
        return "add-skill";
    }

    @RequestMapping(path = "/createskill", method = RequestMethod.POST)
    public String createSkill(@RequestParam("file") MultipartFile file, Skill item) throws FileStorageException {
        if (file.isEmpty() || file.getOriginalFilename().equals("")) {
            return "redirect:/addskill";
        } else {
            String storageLink = fileService.uploadFile(file);

            item.setImage(storageLink);
            skillRepository.save(item);
            skillService.create(item);
        }
        return "redirect:/Manage_skill";
    }

    @RequestMapping(path = "/updateskill", method = RequestMethod.POST)
    public String editClass(@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes, Skill item) throws FileStorageException {
        if (file.isEmpty() || file.getOriginalFilename().equals("")) {
            Skill item1 = item;
            skillRepository.save(item);
        } else {
            String storageLink = fileService.uploadFile(file);
            item.setImage(storageLink);
            skillRepository.save(item);
            skillService.update(item);
        }
        return "redirect:/Manage_skill";
    }

}







