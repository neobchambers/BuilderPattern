package builder;

public class GameCharacter {
    private String name;
    private String сlass;
    private String weapon;
    private String armor;
    private int level;
    private String skills;

    public void setName(String name){
        this.name = name;
    }
    public void setClass(String сlass){
        this.сlass = сlass;
    }
    public void setWeapon(String weapon){
        this.weapon = weapon;
    }
    public void setArmor(String armor){
        this.armor = armor;
    }
    public void setLevel(int level){
        this.level = level;
    }
    public void setSkills(String skills){
        this.skills = skills;
    }
    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Class: " + сlass);
        System.out.println("Weapon: " + weapon);
        System.out.println("Armor: " + armor);
        System.out.println("Level: " + level);
        System.out.println("Skills: " + skills);
    }
}
