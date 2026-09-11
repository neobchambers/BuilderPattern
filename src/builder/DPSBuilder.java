package builder;

public class DPSBuilder extends GameCharacterBuilder {

    @Override
    public GameCharacter build() {
        return character;
    }
    public DPSBuilder() {
        setClass("DPS");
        setArmor("Tough Armor");
        setSkills("Ultimate");
        setWeapon("Enchanted Sword");
    }
}
