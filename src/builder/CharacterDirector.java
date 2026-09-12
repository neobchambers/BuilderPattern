package builder;

public class CharacterDirector {
    private GameCharacterBuilder builder;
    public CharacterDirector(GameCharacterBuilder builder){
        this.builder = builder;
    }
    public GameCharacter buildCharacter(String name, int level){
        builder.setName(name);
        builder.setLevel(level);

        return builder.build();
    }
}
