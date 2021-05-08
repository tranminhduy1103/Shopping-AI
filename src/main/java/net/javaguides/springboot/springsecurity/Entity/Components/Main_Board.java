package net.javaguides.springboot.springsecurity.Entity.Components;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "Id"))
public class Main_Board {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;


    @NotEmpty
    @Column(nullable = false)
    private String Sub_Component;

    private String ChipSet;

    private String Socket;

    private String Size;

    private String RAM_SlotMax;

    private String RAM_Support;

    private String Max_MemorySupply;

    private String Storage;

    private String RAM_SlotType;

    private String Gate;

    private String PCI;

    private String numberUSB_Gate;

    private String LAN;

    private String Sound;
    private String Quantities;

    public Main_Board(Long id, String sub_Component, String chipSet, String socket, String size, String RAM_SlotMax, String RAM_Support, String max_MemorySupply, String storage, String RAM_slotType, String gate, String PCI, String numberUSBGate, String LAN, String sound, String quantities) {
        Id = id;
        Sub_Component = sub_Component;
        ChipSet = chipSet;
        Socket = socket;
        Size = size;
        this.RAM_SlotMax = RAM_SlotMax;
        this.RAM_Support = RAM_Support;
        Max_MemorySupply = max_MemorySupply;
        Storage = storage;
        this.RAM_SlotType = RAM_slotType;
        Gate = gate;
        this.PCI = PCI;
        this.numberUSB_Gate = numberUSBGate;
        this.LAN = LAN;
        Sound = sound;
        Quantities = quantities;
    }

    public Main_Board() {
    }

    public String getQuatities() {
        return Quantities;
    }

    public void setQuatities(String quatities) {
        Quantities = quatities;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getSub_Component() {
        return Sub_Component;
    }

    public void setSub_Component(String sub_Component) {
        Sub_Component = sub_Component;
    }

    public String getChipSet() {
        return ChipSet;
    }

    public void setChipSet(String chipSet) {
        ChipSet = chipSet;
    }

    public String getSocket() {
        return Socket;
    }

    public void setSocket(String socket) {
        Socket = socket;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }

    public String getRAM_SlotMax() {
        return RAM_SlotMax;
    }

    public void setRAM_SlotMax(String RAM_SlotMax) {
        this.RAM_SlotMax = RAM_SlotMax;
    }

    public String getRAM_Support() {
        return RAM_Support;
    }

    public void setRAM_Support(String RAM_Support) {
        this.RAM_Support = RAM_Support;
    }

    public String getMax_MemorySupply() {
        return Max_MemorySupply;
    }

    public void setMax_MemorySupply(String max_MemorySupply) {
        Max_MemorySupply = max_MemorySupply;
    }

    public String getStorage() {
        return Storage;
    }

    public void setStorage(String storage) {
        Storage = storage;
    }

    public String getRAM_SlotType() {
        return RAM_SlotType;
    }

    public void setRAM_SlotType(String RAM_SlotType) {
        this.RAM_SlotType = RAM_SlotType;
    }

    public String getGate() {
        return Gate;
    }

    public void setGate(String gate) {
        Gate = gate;
    }

    public String getPCI() {
        return PCI;
    }

    public void setPCI(String PCI) {
        this.PCI = PCI;
    }

    public String getNumberUSB_Gate() {
        return numberUSB_Gate;
    }

    public void setNumberUSB_Gate(String numberUSB_Gate) {
        this.numberUSB_Gate = numberUSB_Gate;
    }

    public String getLAN() {
        return LAN;
    }

    public void setLAN(String LAN) {
        this.LAN = LAN;
    }

    public String getSound() {
        return Sound;
    }

    public void setSound(String sound) {
        Sound = sound;
    }
}
