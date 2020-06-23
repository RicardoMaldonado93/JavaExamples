package groovyExample.view

import groovyExample.controller.CharacterController
import groovyExample.model.EUniverse
import groovyExample.model.comicCharacter


class view {
	static void main(String... args) {
		

		def multiplicador = {a,b -> a * b}
		def sum = {a, b -> a + b}
		CharacterController cc = CharacterController.instance

		def magneto = new comicCharacter()
		magneto.name = "Magneto"
		magneto.universe = EUniverse.Marvel
		magneto.power = "Magnetism"
		magneto.weakness = "Stubbornness"
		
		cc.addCharacter(new comicCharacter("Wolwerine", EUniverse.Marvel, "Inmortal", "Adamantium Infection"));
		cc.addCharacter(new comicCharacter("Iron Man", EUniverse.Marvel, "Mark Armor", "Heart Issues"));
		cc.addCharacter(new comicCharacter("Superman", EUniverse.DC, "SuperHuman strength", "Kryptonine"));
		cc.addCharacter(new comicCharacter("Joker", EUniverse.DC, "Emotional manipulator", "Batman"));
		cc.addCharacter(new comicCharacter("DeadPool", EUniverse.Marvel, "Inmortal", "Kittens"));
		cc.addCharacter(new comicCharacter("Thor", EUniverse.Marvel , "Mjölnir", "Loki"));
		
		cc.addCharacter(magneto)

		println multiplicador("=", 70)
		cc.allCharacterInUniverse(EUniverse.DC);
		
		println multiplicador("=", 70)
		cc.allCharacterInUniverse(EUniverse.Marvel);
		
		println multiplicador("=", 70)
		cc.characterProperties("iron man");
		println multiplicador("=", 70)
	
		println cc.deleteCharacter("joker")
		println cc.findCharacter("joker")
		println cc.deleteCharacter("joker")
		println multiplicador("=", 70)

		println cc.findCharacter("wolwerine")
		println cc.findCharacter("loki")
		
		println multiplicador("=", 70)
		cc.updateCharacter(new comicCharacter("thor", EUniverse.Marvel, "Lightning ", "Food"));
		cc.characterProperties("thor");
		
		println multiplicador("=", 70)
		cc.characterProperties("joker");
		
		println multiplicador("=", 70)
		cc.allCharacter()
	}
}
