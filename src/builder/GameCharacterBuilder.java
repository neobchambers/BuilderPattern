package builder;

public abstract class GameCharacterBuilder {
    protected GameCharacter character = new GameCharacter();
    public GameCharacterBuilder setName(String name){
        character.setName(name);
        return this;
    }
    public GameCharacterBuilder setClass(String Class){
        character.setClass(Class);
        return this;
    }
    public GameCharacterBuilder setWeapon(String weapon){
        character.setWeapon(weapon);
        return this;
    }
    public GameCharacterBuilder setArmor(String armor){
        character.setArmor(armor);
        return this;
    }
    public GameCharacterBuilder setLevel(int level){
        character.setLevel(level);
        return this;
    }
    public GameCharacterBuilder setSkills(String skills){
        character.setSkills(skills);
        return this;
    }
    public abstract GameCharacter build();
}
