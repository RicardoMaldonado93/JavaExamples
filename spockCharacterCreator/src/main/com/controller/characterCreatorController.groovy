package main.com.controller

import main.com.enums.EUniverse
import main.com.interfaces.ICharacterController
import main.com.model.comicCharacter

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
	public void seeCharactersByUniverse(EUniverse universe) {
		def separator = { a,b -> a*b }
		println separator("=",80)
		this._charactersCreated.each{ it -> if(it._universe == universe) { println it}}	
		println separator("=",80)
	}

	@Override
	public void seeAllCharacters() {
		def separator = { a,b -> a*b }
		println separator("=",80)
		this._charactersCreated.each { it -> println it }
		println separator("=",80)
	}
	

}
