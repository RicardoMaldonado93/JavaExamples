package main.com.view


import main.com.controller.characterCreatorController
import main.com.enums.EUniverse
import main.com.interfaces.ICharacterController
import main.com.model.comicCharacter

class view {
	
	static void main(String... args) {
		
		def cc = characterCreatorController.newInstance()
		
		cc.addCharacter(new comicCharacter("Wolwerine","Inmortal", EUniverse.MARVEL))
		cc.addCharacter(new comicCharacter("Spiderman","Web Fluid", EUniverse.MARVEL))
		cc.addCharacter(new comicCharacter("Iron Man","Mark Armor", EUniverse.MARVEL))
		cc.addCharacter(new comicCharacter("Hulk","Strength", EUniverse.MARVEL))

		cc.addCharacter(new comicCharacter("Hulk","Strength and Fly", EUniverse.MARVEL))
		cc.updateCharacter(new comicCharacter("Hulk","Strength and Fly", EUniverse.MARVEL))
		println cc.findCharacter("hulk")
		cc.deleteCharacter("hulk")
		
		cc.seeAllCharacters()
		
		cc.addCharacter(new comicCharacter("Batman", "Technology", EUniverse.DC))
		cc.addCharacter(new comicCharacter("Superman", "Laser Vision", EUniverse.DC))
		
		cc.seeCharactersByUniverse(EUniverse.DC)
	}
}

