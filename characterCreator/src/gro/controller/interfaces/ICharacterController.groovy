package gro.controller.interfaces

import gro.model.EUniverse
import gro.model.comicCharacter

public interface ICharacterController {
	
	/**
	public void addCharacter(comicCharacter character);
	public void deleteCharacter(String name);
	public void updateCharacter(comicCharacter character);
	public comicCharacter findCharacter(String name);
	public void characterProperties( String name);
	public void allCharacterInUniverse(EUniverse universe);

	 */
	
	void addCharacter(comicCharacter character)
	String deleteCharacter(String name)
	void updateCharacter(comicCharacter character)
	Object findCharacter(String name)
	void characterProperties(String name)
	void allCharacterInUniverse(EUniverse universe)
	
}
