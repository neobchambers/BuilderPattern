package builder;

public class Main {
    public static void main(String[] args){
        //DPS build
        DPSBuilder dpsBuilder = new DPSBuilder();
        CharacterDirector dpsdirector = new CharacterDirector(dpsBuilder);
        GameCharacter dps = dpsdirector.buildCharacter("Steve", 10);

        //Healer build
        HealerBuilder healerBuilder = new HealerBuilder();
        CharacterDirector healerdirector = new CharacterDirector(healerBuilder);
        GameCharacter healer = healerdirector.buildCharacter("Leloush", 67);
    }
}
