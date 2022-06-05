package net.javaguides.springboot.springsecurity.web;

import net.javaguides.springboot.springsecurity.Entity.Laptop.Laptop;
import net.javaguides.springboot.springsecurity.Entity.User;
import net.javaguides.springboot.springsecurity.Entity.Image.Image;
import net.javaguides.springboot.springsecurity.Exception.FileStorageException;
import net.javaguides.springboot.springsecurity.Exception.RecordNotFoundException;
import net.javaguides.springboot.springsecurity.repository.ImageRepository;
import net.javaguides.springboot.springsecurity.repository.LaptopRepository;
import net.javaguides.springboot.springsecurity.repository.PCRepository;
import net.javaguides.springboot.springsecurity.repository.UserRepository;
import net.javaguides.springboot.springsecurity.service.ImageService;
import net.javaguides.springboot.springsecurity.service.LaptopService;
import net.javaguides.springboot.springsecurity.service.LaptopServiceImpl;
import net.javaguides.springboot.springsecurity.service.UserServiceImpl;
import net.javaguides.springboot.springsecurity.upload.FileService;
import net.javaguides.springboot.springsecurity.upload.MyUploadForm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;

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
    @Autowired
    ImageService imageService;


    @GetMapping("/")
    public String root(Model model) {
        return "redirect:/Login_form";
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
        return "redirect:/listofuser";
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
    //==========Add-update-delete-laptop=============// 
    @GetMapping("/Manage_laptop")
    public String manaChamp(Model model) {
        model.addAttribute("Images", imageRepository.findAll());
        model.addAttribute("Laptops", laptopRepository.findAll());
        return "Manage_Laptop";
    }
    
   
    @GetMapping("/viewListLaptop")
    public String viewListLaptop(Model model) {
    	model.addAttribute("listLaptops", laptopService.getAllLaptop());
    	return"viewListLaptop";
    }
    
    @GetMapping("/newLaptopForm")
    public String AddNewLaptopForm(HttpServletRequest request, Model model) {
    	Laptop laptop = new Laptop();
    	Image  imageLaptop  = new Image();
    	model.addAttribute("laptop",laptop);
    	model.addAttribute("imageLaptop", imageLaptop);
    	
    	String imageId= request.getParameter("imageId");
    	imageLaptop.setImageID(imageId);
    	imageLaptop.setType(request.getParameter("typeLaptop"));
    	
    	return"newLaptopForm";
    }
    
    @PostMapping("/saveLaptop")
    public String saveLaptop(@ModelAttribute("laptop") Laptop laptop,@ModelAttribute("imageLaptop") Image imageLaptop ){
    	//save laptop to the dataBase
    	laptopService.saveLaptop(laptop);
    	//save image laptop to the dataBase
    	imageService.saveImage(imageLaptop);
    	return"redirect:/Manage_laptop";
    }
    @PostMapping("/saveUpdateLaptop")
    public String saveUpdateLaptop(@ModelAttribute("laptop") Laptop laptop){
    	//save laptop to the dataBase
    	laptopService.saveLaptop(laptop);
    	//save image laptop to the dataBase
    	return"redirect:/Manage_laptop";
    }
    @PostMapping("/saveUpdateImageLaptop")
    public String saveImageLaptop(@ModelAttribute("imageLaptop") Image imageLaptop ){
    	//save image laptop to the dataBase
    	imageService.saveImage(imageLaptop);
    	return"updateImageLaptopForm";
    }
    @RequestMapping("/updateLaptopForm/{id}")
    public String updateLaptop(@PathVariable(value = "id") long id,Model model) {
    	//get Laptop form service
    	Laptop laptop = laptopService.getLaptopById(id);
    	System.out.println("laptop id: "+laptop.getId());
    	System.out.println("ID: "+laptop.getImageID());
    	Image imageLaptop = imageService.getImageByImageId(laptop.getImageID());
    	model.addAttribute("laptop", laptop);
    	model.addAttribute("imageLaptop",imageLaptop);
    	return"updateLaptopForm";
    }
    
    @RequestMapping("/updateImageLaptopForm/{imageId}")
    public String updateImageLaptop(@PathVariable(value = "imageId") String imageId, Model model) {
    	
    	//get image laptop by foreign key: imageId 
    	Image imageLaptop = imageService.getImageByImageId(imageId);
    	
    	//System.out.println("id:"+imageLaptop.getId());
    	model.addAttribute("imageLaptop", imageLaptop);
    	
    	return"updateImageLaptopForm";
    }
    @RequestMapping("/deleteLaptop/{id}")
    public String deleteLaptop(@PathVariable(value = "id") long id) {
    	
    	Laptop laptop= laptopService.getLaptopById(id);
    	Image  image= imageService.getImageByImageId(laptop.getImageID());
    	System.out.println("Id laptop: "+id);
    	System.out.println("Id image: "+laptop.getImageID());
    	// call delete Laptop image method
    	this.imageService.deleteImageById(image.getId());
    	//this.imageService.deleteImageByImageId(laptop.getImageID());
    	
    	// call delete Laptop method
    	this.laptopService.deleteLaptopById(id);
    	
    	return "redirect:/Manage_laptop";
    }
    
    //====================================upload image file===================================================//
    @RequestMapping(value="/updateImageByUploadFile/{imageId}", method = RequestMethod.GET)
    public String updateImageLaptopByUploadFile(@PathVariable(value = "imageId") String imageId, Model model,
    		HttpServletRequest request, MyUploadForm myUploadForm) {
    	
    	Image imageLaptop = imageService.getImageByImageId(imageId);
    	System.out.println("id:"+imageLaptop.getId());
    	model.addAttribute("imageLaptop", imageLaptop);
    	
    	return"updateImageByUploadFile";
    }
    
    @PostMapping("/saveByUploadFile")
    public String saveImageLaptopByUploadFile(@ModelAttribute("imageLaptop") Image imageLaptop,  Model model,
    		HttpServletRequest request, MyUploadForm myUploadForm) {
    	return this.doUploadFile(request, model, myUploadForm, imageLaptop);
    }
    
    private String doUploadFile(HttpServletRequest request, Model model, //
			MyUploadForm myUploadForm, Image image ) {
    	
    	System.out.println("id in doupload:"+ image.getImageID());
		String description = myUploadForm.getDescription();
		System.out.println("Description: " + description);

		// folder for upload file.
		String uploadRootPath = request.getServletContext().getRealPath("upload");
		System.out.println("uploadRootPath=" + uploadRootPath);

		File uploadRootDir = new File(uploadRootPath);
		// create origin folder upload if it not exist.
		if (!uploadRootDir.exists()) {
			uploadRootDir.mkdirs();
		}
		MultipartFile[] fileDatas = myUploadForm.getFileDatas();
		// 
		List<File> uploadedFiles = new ArrayList<File>();
		List<String> failedFiles = new ArrayList<String>();

		for (MultipartFile fileData : fileDatas) {

			// get original file name
			String name = fileData.getOriginalFilename();
			System.out.println("File Name = " + name);

			if (name != null && name.length() > 0) {
				try {
					// create file in Tomcat Server.
					File serverFile = new File(uploadRootDir.getAbsolutePath() + File.separator + name);

					BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
					stream.write(fileData.getBytes());
					stream.close();
					// 
					uploadedFiles.add(serverFile);
					System.out.println("Write file: " + serverFile);
				} catch (Exception e) {
					System.out.println("Error Write file: " + name);
					failedFiles.add(name);
				}
			}
		}
		image.setImage1(uploadedFiles.get(0).getPath());
		image.setImage2(uploadedFiles.get(1).getPath());
		image.setImage3(uploadedFiles.get(2).getPath());
		image.setImage4(uploadedFiles.get(3).getPath());
		image.setImage5(uploadedFiles.get(4).getPath());
		image.setImage6(uploadedFiles.get(5).getPath());
		image.setImage7(uploadedFiles.get(6).getPath());
		imageService.saveImage(image);
		model.addAttribute("description", description);
		return"updateImageByUploadFile";
	}
    
    
}








