package groovyExample.controller

import groovyExample.controller.interfaces.ICharacterController
import groovyExample.model.EUniverse
import groovyExample.model.comicCharacter

import java.awt.Event

@Singleton
class CharacterController implements ICharacterController {

	List<comicCharacter> _comicCharacters = new ArrayList();
	
	@Override
	void addCharacter(comicCharacter character) {
		this._comicCharacters << character
		println "${character.name} has been added successfully :D"
	}

	@Override
	String deleteCharacter(String name) {
		def characterFound = this._comicCharacters.find { it.getName().equalsIgnoreCase(name) }
		return this._comicCharacters.remove(characterFound)? "${name} has been deleted :D" : "${name} has not been deleted :O"
	}

	@Override
	void updateCharacter(comicCharacter character) {
		def update = false
		this._comicCharacters.each { 
										if(it.getName().equalsIgnoreCase(character.name)) {
											it.power = character.power
											it.universe = character.universe
											it.weakness = character.weakness
											update = true
										}
									}
									
		println update ? "${character.name} has been updated :D" : "${character.name} hasn't been updated :'("
	}

	@Override
	Object findCharacter(String name) {
		return  this._comicCharacters.find { it.getName().equalsIgnoreCase(name) } ?: "${name} not found :'("
	}

	@Override
	void characterProperties(String name) {
		println this._comicCharacters.find { it.getName().equalsIgnoreCase(name) } ?: "ouch ${name} not found X("
	}

	@Override
	void allCharacterInUniverse(EUniverse universe) {
		this._comicCharacters.each { if(it.universe == universe) println it.name }
		
	}
	void allCharacter() {
		this._comicCharacters.each { println it.name }
		
	}
	
	
}
