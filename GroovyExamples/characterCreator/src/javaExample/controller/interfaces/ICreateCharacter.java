package javaExample.controller.interfaces;

import java.util.List;
import java.util.stream.Stream;

import javaExample.model.EUniverse;
import javaExample.model.comicCharacter;

public interface ICreateCharacter {
	
	public void addCharacter(comicCharacter character);
	public void deleteCharacter(String name);
	public void updateCharacter(comicCharacter character);
	public comicCharacter findCharacter(String name);
	public void characterProperties( String name);
	public void allCharacterInUniverse(EUniverse universe);

}
