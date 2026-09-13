# BuilderPattern - Game character
This project exist for the sole purpose of demonstrating the Builder design pattern in Java.
The function of this project is to create specific game characters while using different builder. The same GameCharacter product can have 2 types of representation.
This concludes: DPSBuilder and HealerBuilder.

Structure: 
- `GameCharacter` - Product class that represents a game character.
- `GameCharacterBuilder` - abstract Builder class that defines the construction steps.
- `DPSBuilder` - creates a DPS character with its own equipment and skills.
- `HealerBuilder` - creates a Healer character with its own equipment and skills.
- `CharacterDirector` - controls the construction process.
- `Main` - demonstrates how the builders are used.

How it works:
The Director receives a builder and uses it to set the character's name and level.
The Concrete Builder provides the specific class, weapon, armor, and skills.

For example, a DPS character is created with:
- Class: DPS
- Weapon: Enchanted Sword
- Armor: Tough Armor
- Skills: Ultimate

A Healer character is created with:
- Class: Healer
- Weapon: Staff
- Armor: Light Armor
- Skills: Healing

Fluent API:
public GameCharacter buildCharacter(String name, int level){
return builder
.setName(name)
.setLevel(level)
.build();
}
Each setter returns the builder itself, allowing several construction steps to be chained together.

How to run this program:
Open Main.java
Run the main method
