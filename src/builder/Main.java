package builder;

public class Main {
    public static void main(String[] args){
        //DPS build
        DPSBuilder dpsBuilder = new DPSBuilder();
        CharacterDirector dpsdirector = new CharacterDirector(dpsBuilder);
        GameCharacter dps = dpsdirector.buildCharacter("Steve", 10);
        System.out.println("DPS Character:");
        dps.showInfo();
        System.out.println();
        //Healer build
        HealerBuilder healerBuilder = new HealerBuilder();
        CharacterDirector healerdirector = new CharacterDirector(healerBuilder);
        GameCharacter healer = healerdirector.buildCharacter("Leloush", 67);
        System.out.println("Healer Builder");
        healer.showInfo();
    }
}
