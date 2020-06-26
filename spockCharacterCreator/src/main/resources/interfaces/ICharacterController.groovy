package main.resources.interfaces;

import main.resources.com.enums.EUniverse
import main.resources.com.model.comicCharacter

interface ICharacterController {
	
	void addCharacter( comicCharacter character )
	void deleteCharacter( String name )
	Object findCharacter( String name )
	void updateCharacter( comicCharacter character )
	Integer seeCharactersByUniverse( EUniverse universe )
	Integer seeAllCharacters()
	
}
