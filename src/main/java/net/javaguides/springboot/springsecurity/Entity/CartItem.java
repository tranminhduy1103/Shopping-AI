package net.javaguides.springboot.springsecurity.Entity;

import javax.persistence.*;


@Entity
@Table(name = "cart_item")
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn( name = "PC_id")
    private PCs pcs;

    @ManyToOne
    @JoinColumn(name = "User_id")
    private User user;

    private int quantity;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPcs(PCs pcs) {
        this.pcs = pcs;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Integer getId() {
        return id;
    }

    public PCs getPcs() {
        return pcs;
    }

    public User getUser() {
        return user;
    }

    public int getQuantity() {
        return quantity;
    }
}
