package net.javaguides.springboot.springsecurity.model;

import javax.persistence.*;


@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "Name"))
public class Champ{

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    private String name;
    private int Cost;
    private String Image;
    private String Categorize;
    private String Origin;
    private String Categorize1;
    private String Origin1;
    private String Health;
    private String Mana;
    private String Damage;
    private String Dps;
    private String Armor;
    private String MR;
    private double Speed;
    private String Skill_name;
    private String Re_item1;
    private String Re_item2;
    private String Re_item3;
    @Column(length=1000)
    private String story;

    public Champ(){}
    public Champ(long id, String name, int cost, String image, String categorize, String origin, String categorize1, String origin1, String health, String mana, String damage, String dps, String armor, String MR, double speed, String skill_name, String re_item1, String re_item2, String re_item3, String story) {
        Id = id;
        this.name = name;
        Cost = cost;
        Image = image;
        Categorize = categorize;
        Origin = origin;
        Categorize1 = categorize1;
        Origin1 = origin1;
        Health = health;
        Mana = mana;
        Damage = damage;
        Dps = dps;
        Armor = armor;
        this.MR = MR;
        Speed = speed;
        Skill_name = skill_name;
        Re_item1 = re_item1;
        Re_item2 = re_item2;
        Re_item3 = re_item3;
        this.story = story;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return Cost;
    }

    public void setCost(int cost) {
        Cost = cost;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getCategorize() {
        return Categorize;
    }

    public void setCategorize(String categorize) {
        Categorize = categorize;
    }

    public String getOrigin() {
        return Origin;
    }

    public void setOrigin(String origin) {
        Origin = origin;
    }

    public String getCategorize1() {
        return Categorize1;
    }

    public void setCategorize1(String categorize1) {
        Categorize1 = categorize1;
    }

    public String getOrigin1() {
        return Origin1;
    }

    public void setOrigin1(String origin1) {
        Origin1 = origin1;
    }

    public String getHealth() {
        return Health;
    }

    public void setHealth(String health) {
        Health = health;
    }

    public String getMana() {
        return Mana;
    }

    public void setMana(String mana) {
        Mana = mana;
    }

    public String getDamage() {
        return Damage;
    }

    public void setDamage(String damage) {
        Damage = damage;
    }

    public String getDps() {
        return Dps;
    }

    public void setDps(String dps) {
        Dps = dps;
    }

    public String getArmor() {
        return Armor;
    }

    public void setArmor(String armor) {
        Armor = armor;
    }

    public String getMR() {
        return MR;
    }

    public void setMR(String MR) {
        this.MR = MR;
    }

    public double getSpeed() {
        return Speed;
    }

    public void setSpeed(double speed) {
        Speed = speed;
    }

    public String getSkill_name() {
        return Skill_name;
    }

    public void setSkill_name(String skill_name) {
        Skill_name = skill_name;
    }

    public String getRe_item1() {
        return Re_item1;
    }

    public void setRe_item1(String re_item1) {
        Re_item1 = re_item1;
    }

    public String getRe_item2() {
        return Re_item2;
    }

    public void setRe_item2(String re_item2) {
        Re_item2 = re_item2;
    }

    public String getRe_item3() {
        return Re_item3;
    }

    public void setRe_item3(String re_item3) {
        Re_item3 = re_item3;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }
}
