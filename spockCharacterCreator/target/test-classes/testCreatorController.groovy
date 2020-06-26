package test.resources

import main.resources.com.controller.characterCreatorController
import main.resources.com.enums.EUniverse
import main.resources.com.model.comicCharacter
import spock.lang.Specification

class testCreatorController extends Specification{
	def controller = characterCreatorController.newInstance()
	
	def setup() {
		def separator = {a,b -> a*b}
		println  separator("*",70)
	}
	def "Verificamos que se instancie el controller"(){
		expect:
			assert controller != null 
		
		println "~ Fin prueba instancia controller ~"
	}
	
	def "Se verifica que se agregue un personaje"(){
		controller.addCharacter(new comicCharacter("wolwerine","inmortal",EUniverse.MARVEL))
		
		expect:
			assert controller._charactersCreated.size() == 0
			
		println "~ Fin prueba agregar personaje ~"
	}
	
	def "Se verifica que se elimine un personaje"(){
		controller.addCharacter(new comicCharacter("wolwerine","inmortal",EUniverse.MARVEL))
		controller.deleteCharacter("wolwerine")
		expect:
			assert controller._charactersCreated.size() == 0
	}
	
	def "Se verifica que se actualice un personaje"(){
		controller.addCharacter(new comicCharacter("wolwerine","inmortal",EUniverse.MARVEL))
		controller.updateCharacter(new comicCharacter("wolwerine", "Adamantium claws", EUniverse.MARVEL))
		
		expect:
			assert controller.findCharacter("wolwerine")._power == "Adamantium claws"
	}
	def "Se verifica que muestre los personajes de un universo"(){
		controller.addCharacter(new comicCharacter("wolwerine","inmortal",EUniverse.MARVEL))
		controller.addCharacter(new comicCharacter("Batman", "Technology", EUniverse.DC))
		controller.addCharacter(new comicCharacter("Superman", "Laser Vision", EUniverse.DC))
		
		expect:
			assert controller.seeCharactersByUniverse(EUniverse.DC) == 2
	}
	def "Se verifica que muestre todos los personajes"(){
		controller.addCharacter(new comicCharacter("wolwerine","inmortal",EUniverse.MARVEL))
		controller.addCharacter(new comicCharacter("Batman", "Technology", EUniverse.DC))
		controller.addCharacter(new comicCharacter("Superman", "Laser Vision", EUniverse.DC))
		
		expect:
			assert controller.seeAllCharacters() == 3
	}
}
