package net.javaguides.springboot.springsecurity.Entity;

import net.javaguides.springboot.springsecurity.Entity.Laptop.Laptop;

import javax.persistence.*;


@Entity
@Table(name = "cart_item")
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn( name = "laptop_id")
    private Laptop laptop;

    @ManyToOne
    @JoinColumn(name = "User_id")
    private User user;

    private int quantity;

    public void setId(Long id) {
        this.id = id;
    }

//    public void setPcs(PCs pcs) {
//        this.pcs = pcs;
//    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

//    public PCs getPcs() {
//        return pcs;
//    }

    public User getUser() {
        return user;
    }

    public int getQuantity() {
        return quantity;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    @Transient
    public float getSubtotal(){
        return this.laptop.getPrice() * quantity;
    }
}
