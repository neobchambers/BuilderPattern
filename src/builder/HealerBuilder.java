package builder;

public class HealerBuilder extends GameCharacterBuilder {
    @Override
    public GameCharacter build() {
        return character;
    }
    public HealerBuilder(){
        setClass("Healer");
        setArmor("light Armor");
        setSkills("Healing");
        setWeapon("Staff");

    }
}
