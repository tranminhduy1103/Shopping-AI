package net.javaguides.springboot.springsecurity.Entity.OfficeDevices;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "Id"))
public class Scanner {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String Sub_Office;

    private Long Quantities;

    private String Connection_gate;

    private String Color;

    private String File_size;

    private String Default_file;

    private String Velocity;

    private String Resolution;

    public Scanner() {
    }

    public Scanner(Long id, String sub_Office, Long quantities, String resolution, String velocity, String default_file, String file_size, String color, String connection_gate) {
        Id = id;
        Sub_Office = sub_Office;
        Quantities = quantities;
        Resolution = resolution;
        Velocity = velocity;
        Default_file = default_file;
        File_size = file_size;
        Color = color;
        Connection_gate = connection_gate;
    }


    public String getSub_Office() {
        return this.Sub_Office;
    }
    public void setSub_Office(String Sub_Office) {
        this.Sub_Office = Sub_Office;
    }

    public Long getQuantities() {
        return this.Quantities;
    }
    public void setQuantities(Long Quantities) {
        this.Quantities = Quantities;
    }

    public String getResolution() {
        return this.Resolution;
    }
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    public String getVelocity() {
        return this.Velocity;
    }
    public void setVelocity(String Velocity) {
        this.Velocity = Velocity;
    }

    public String getDefault_file() {
        return this.Default_file;
    }
    public void setDefault_file(String Default_file) {
        this.Default_file = Default_file;
    }

    public String getFile_size() {
        return this.File_size;
    }
    public void setFile_size(String File_size) {
        this.File_size = File_size;
    }

    public String getColor() {
    return this.Color;
    }
    public void setColor(String Color) {
    this.Color = Color;
    }

    public String getConnection_gate() {
    return this.Connection_gate;
    }
    public void setConnection_gate(String Connection_gate) {
    this.Connection_gate = Connection_gate;
    }

}
