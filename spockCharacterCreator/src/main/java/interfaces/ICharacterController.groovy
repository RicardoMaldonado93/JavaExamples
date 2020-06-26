package main.java.interfaces;

import main.java.com.enums.EUniverse
import main.java.com.model.comicCharacter

interface ICharacterController {
	
	void addCharacter( comicCharacter character )
	void deleteCharacter( String name )
	Object findCharacter( String name )
	void updateCharacter( comicCharacter character )
	Integer seeCharactersByUniverse( EUniverse universe )
	Integer seeAllCharacters()
	
}
