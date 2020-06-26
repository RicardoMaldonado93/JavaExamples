package main.java.com.controller

import main.java.com.enums.EUniverse
import main.java.com.model.comicCharacter
import main.java.interfaces.ICharacterController

@Singleton(strict = false)
class characterCreatorController implements ICharacterController {
	private List<comicCharacter> _charactersCreated
	
	private characterCreatorController() {
		this._charactersCreated = new ArrayList();
	}

	@Override
	public void addCharacter(comicCharacter character) {
		def val = this.findCharacter(character._name)
		if(!val) {
			this._charactersCreated << character
			println "${character._name} has been created!"
		}
		else
			println "${character._name} hasn\'t been created"
	}

	@Override
	public void deleteCharacter(String name) {
		def deleteElem = this.findCharacter(name)
		if(deleteElem) {
			this._charactersCreated.remove(deleteElem)
			println "${name} has been deleted"
		}			
		else
			println "${name} hasn't been delete"
	}

	@Override
	public Object findCharacter(String name) {
		return this._charactersCreated.find { it._name.equalsIgnoreCase(name) }
	}

	@Override
	public void updateCharacter(comicCharacter character) {
		if(this.findCharacter(character._name)) {
			def recovery = this._charactersCreated.find { it._name.equalsIgnoreCase(character._name) }
			recovery._power = character._power
			recovery._universe = character._universe
			println "${character._name} has been updated"
		}
		else
			println "${character._name} hasn't been update"
	}

	@Override
	public Integer seeCharactersByUniverse(EUniverse universe) {
		return this._charactersCreated.findAll{ it -> it._universe == universe }.each { println it }.size()
	}

	@Override
	public Integer seeAllCharacters() {
		return this._charactersCreated.each { println it }.size()
	}
	

}
