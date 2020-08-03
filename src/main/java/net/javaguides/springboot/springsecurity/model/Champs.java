package net.javaguides.springboot.springsecurity.model;


import javax.persistence.*;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "Name"))
public class Champs {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;

    private String Name;
    private int Cost;
    private String Image;
    private String Categorize_I;

    private String Origin_I;

    private String Categorize;
    private String Origin;
    private String Health;
    private String Mana;
    private String Damage;
    private String Dps;
    private String Armor;
    private String MR;
    private double Speed;
    private String Skill;
    private String Skill_Des;
    private String Skill_Dame;
    private String Re_item1;
    private String Re_item2;
    private String Re_item3;


    public Champs(long id, String name, int cost, String image, String categorize_I, String origin_I, String categorize, String origin, String health, String mana, String damage, String dps, String armor, String MR, double speed, String skill, String skill_Des, String skill_Dame, String re_item1, String re_item2, String re_item3) {
        Id = id;
        Name = name;
        Cost = cost;
        Image = image;
        Categorize_I = categorize_I;
        Origin_I = origin_I;
        Categorize = categorize;
        Origin = origin;
        Health = health;
        Mana = mana;
        Damage = damage;
        Dps = dps;
        Armor = armor;
        this.MR = MR;
        Speed = speed;
        Skill = skill;
        Skill_Des = skill_Des;
        Skill_Dame = skill_Dame;
        Re_item1 = re_item1;
        Re_item2 = re_item2;
        Re_item3 = re_item3;
    }

    public String getDps() {
        return Dps;
    }

    public void setDps(String dps) {
        Dps = dps;
    }


    public String getSkill_Des() {
        return Skill_Des;
    }

    public void setSkill_Des(String skill_Des) {
        Skill_Des = skill_Des;
    }

    public String getSkill_Dame() {
        return Skill_Dame;
    }

    public void setSkill_Dame(String skill_Dame) {
        Skill_Dame = skill_Dame;
    }

    public String getCategorize_I() {
        return Categorize_I;
    }

    public void setCategorize_I(String categorize_I) {
        Categorize_I = categorize_I;
    }

    public String getOrigin_I() {
        return Origin_I;
    }

    public void setOrigin_I(String origin_I) {
        Origin_I = origin_I;
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

    public Champs() {
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



    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getCost() {
        return Cost;
    }

    public void setCost(int cost) {
        Cost = cost;
    }



    public String getOrigin() {
        return Origin;
    }

    public void setOrigin(String origin) {
        Origin = origin;
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

    public String getSkill() {
        return Skill;
    }

    public void setSkill(String skill) {
        Skill = skill;
    }


}
