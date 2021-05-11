package net.javaguides.springboot.springsecurity.web;

import net.javaguides.springboot.springsecurity.Exception.RecordNotFoundException;
import net.javaguides.springboot.springsecurity.service.CartServices;
import net.javaguides.springboot.springsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class CartController {

    @Autowired
    private CartServices cartServices;

    @Autowired
    private UserService userService;

    private ArrayList<Cart> cartItems;

    private float Total;

    public CartController(){
        cartItems = new ArrayList<>();

        Customer cus = new Customer(1L, "hieu", "hieu23", "ddd");

        Cart cart1 = new Cart(1L, new Product(1L, "pc", 3.0f, "Hp"), cus, 2);

        Cart cart2 = new Cart(2L, new Product(2L, "laptop", 5.0f, "Asus"), cus, 4);

        Cart cart3 = new Cart(3L, new Product(3L, "pod", 1.1f, "Apple"), cus, 1);

        cartItems.add(cart1);
        cartItems.add(cart2);
        cartItems.add(cart3);

        for (int i = 0; i < cartItems.size(); i++) {
            Total += cartItems.get(i).getSubtotal();
        }
    }

    @GetMapping("/cart")
    public String showShoppingCart(Model model) {

        //User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        model.addAttribute("cartItems", cartItems);

        model.addAttribute("Total", Total);

        return "Cart_page";
    }

    @RequestMapping(value = "/cart/remove/{id}")
    public String removeProductFromCart(Model model, @PathVariable("id") Long id)
        throws RecordNotFoundException {
            //User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
            for (int i = 0; i < cartItems.size(); i++) {
                if (cartItems.get(i).getProduct().getId() == id) {
                    Total -= cartItems.get(i).getSubtotal();
                    cartItems.remove(i);
                }
            }
            return "redirect:/cart";
        }
      @GetMapping("/checkout")
      public String Checkout(Model model){
          model.addAttribute("cartItems", cartItems);

          model.addAttribute("Total", Total);

        return "Checkout";
      }
//    @GetMapping(value ="/cart/update/{pid}/{qty}")
//    public String updateQuantity(@PathVariable("pid") Long pid,
//                                 @PathVariable("qty") int qty){
//        //User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//        //float subtotal = cartServices.updateQuantity(qty, user.getId(), pid);
//        for (int i = 0; i < cartItems.size(); i++) {
//            if (cartItems.get(i).getProduct().getId() == pid) {
//                cartItems.get(i).setQuantity(qty);
//                Total += cartItems.get(i).getSubtotal();
//            }
//        }
//        return "redirect:/cart";
//    }
}

class Product{
    private Long id;

    private String Name;

    private float Price;

    private String Product_Supplier;

    public Product(){}

    public Product(Long id, String Name, float Price, String Product_Supplier){
        this.id = id;
        this.Name = Name;
        this.Price = Price;
        this.Product_Supplier = Product_Supplier;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public String getProduct_Supplier() {
        return Product_Supplier;
    }

    public void setProduct_Supplier(String product_Supplier) {
        Product_Supplier = product_Supplier;


    }
}
class Customer{
    private Long id;

    private String name;

    private String email;

    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Customer(Long id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }
}
class Cart{
    private Long id;

    private Product product;

    private Customer customer;

    private int quantity;

    private float Subtotal;

    public void setId(Long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        updateSubtotal();
    }

    public Long getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void updateSubtotal(){
        Subtotal = this.product.getPrice() * quantity;
    }

    public float getSubtotal(){ return Subtotal; }

    public Cart(Long id, Product product, Customer customer, int quantity) {
        this.id = id;
        this.product = product;
        this.customer = customer;
        this.quantity = quantity;
        this.Subtotal = product.getPrice() * quantity;
    }
}