package net.javaguides.springboot.springsecurity.Entity.SoundDevices;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "Id"))
public class EH_Phone {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String Sub_sound;

    public EH_Phone() {
    }

    public EH_Phone(Long id, String sub_sound) {
        Id = id;
        Sub_sound = sub_sound;
    }
    public Long getId() {
        return this.Id;
    }
    public void setId(Long Id) {
        this.Id = Id;
    }

    public String getSub_sound() {
        return this.Sub_sound;
    }
    public void setSub_sound(String Sub_sound) {
        this.Sub_sound = Sub_sound;
    }
}
