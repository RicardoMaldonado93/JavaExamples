package javaExample.view;

import java.util.List;

import javaExample.controller.characterCreatorController;
import javaExample.model.EUniverse;
import javaExample.model.comicCharacter;
public class view {

	public static void main(String[] args) {
		
		characterCreatorController cc = characterCreatorController.instance();
		
		//Agregamos los Personajes
		cc.addCharacter(new comicCharacter("Wolwerine", EUniverse.Marvel, "Inmortal", "Adamantium Infection"));
		cc.addCharacter(new comicCharacter("Iron Man", EUniverse.Marvel, "Mark Armor", "Heart Issues"));
		cc.addCharacter(new comicCharacter("Superman", EUniverse.DC, "SuperHuman strength", "Kryptonine"));
		cc.addCharacter(new comicCharacter("Joker", EUniverse.DC, "Emotional manipulator", "Batman"));
		cc.addCharacter(new comicCharacter("DeadPool", EUniverse.Marvel, "Inmortal", "Kittens"));
		cc.addCharacter(new comicCharacter("Thor", EUniverse.Marvel , "Mjölnir", "Loki"));
		cc.allCharacterInUniverse(EUniverse.DC);
		cc.allCharacterInUniverse(EUniverse.Marvel);
		
		System.out.println("====================");
		cc.characterProperties("iron man");
		System.out.println("====================");
		
		cc.deleteCharacter("joker");
		
		System.out.println("====================");
		
		System.out.println(cc.findCharacter("wolwerine"));
		
		System.out.println("====================");
		
		cc.updateCharacter(new comicCharacter("thor", EUniverse.Marvel, "Lightning ", "Food"));
		cc.characterProperties("thor");
	
	}

}
