package main.com.interfaces;

import main.com.enums.EUniverse
import main.com.model.comicCharacter;

interface ICharacterController {
	
	void addCharacter( comicCharacter character )
	void deleteCharacter( String name )
	Object findCharacter( String name )
	void updateCharacter( comicCharacter character )
	void seeCharactersByUniverse( EUniverse universe )
	void seeAllCharacters()
	
}
