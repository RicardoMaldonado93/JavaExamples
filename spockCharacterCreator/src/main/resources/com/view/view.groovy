package main.resources.com.view


import main.com.interfaces.ICharacterController
import main.resource.com.controller.characterCreatorController
import main.resources.com.enums.EUniverse
import main.resources.com.model.comicCharacter

class view {
	
	static void main(String... args) {
		
		def separator = { a,b -> a*b }
		def cc = characterCreatorController.newInstance()
		
		
		println separator("=",10) + " CREATE NEWS CHARACTERS " + separator("=",10)
		cc.addCharacter(new comicCharacter("Wolwerine","Inmortal", EUniverse.MARVEL))
		cc.addCharacter(new comicCharacter("Spiderman","Web Fluid", EUniverse.MARVEL))
		cc.addCharacter(new comicCharacter("Iron Man","Mark Armor", EUniverse.MARVEL))
		cc.addCharacter(new comicCharacter("Hulk","Strength", EUniverse.MARVEL))
		cc.addCharacter(new comicCharacter("Batman", "Technology", EUniverse.DC))
		cc.addCharacter(new comicCharacter("Superman", "Laser Vision", EUniverse.DC))
		cc.addCharacter(new comicCharacter("Hulk","Strength and Fly", EUniverse.MARVEL))
		
		println "\n"+separator("=",10) + " UPDATE HULK CHARACTER " + separator("=",10)
		cc.updateCharacter(new comicCharacter("Hulk","Strength and Fly", EUniverse.MARVEL))
		
		println "\n"+separator("=",10) + " FIND HULK CHARACTER " + separator("=",10)
		println cc.findCharacter("hulk")
		
		println "\n"+separator("=",10) + " DELETE HULK CHARACTER " + separator("=",10)
		cc.deleteCharacter("hulk")
		
		println "\n"+separator("=",20) + " CREATED CHARACTERS " + separator("=",20)
		cc.seeAllCharacters()
		
		
		println "\n"+separator("=",25) + " DC WORLD " + separator("=",25)
		cc.seeCharactersByUniverse(EUniverse.DC)
	
		println "\n"+separator("=",25) + " MARVEL WORLD " + separator("=",25)
		cc.seeCharactersByUniverse(EUniverse.MARVEL)
	}
}

