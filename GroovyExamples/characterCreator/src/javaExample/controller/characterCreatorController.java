package javaExample.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javaExample.controller.interfaces.ICreateCharacter;
import javaExample.model.EUniverse;
import javaExample.model.comicCharacter;

public class characterCreatorController implements ICreateCharacter {
	private List<comicCharacter> _characters;
	public static characterCreatorController cc;
	
	private characterCreatorController(){
		this._characters = new ArrayList<>();
	}
	
	/**
	 * Crea la instancia del characterController, en caso de estar instanciada retorna la misma (Singleton), para poder acceder a los metodos
	 * @return Retorna la instancia creada.
	 */
	public static characterCreatorController instance() {
		if(characterCreatorController.cc == null)
			characterCreatorController.cc = new characterCreatorController();
		return characterCreatorController.cc;
	}

	/**
	 * Agrega un nuevo personaje a la lista.
	 * @param character Personaje para agregar a la lista.
	 */
	@Override
	public void addCharacter(comicCharacter character) {
		this._characters.add(character);
		System.out.println(character.getName() +" has been added successfully :)");
	}

	/**
	 * Borra un personaje de lista.
	 * @param name Nombre del personaje a borrar.
	 */
	@Override
	public void deleteCharacter(String name) {
		comicCharacter cc = this.findCharacter(name);
		
		if(this._characters.contains(cc)) {
			this._characters.remove(cc);
			System.out.println(name +" has been deleted succesfully :(");
		}
		
	}
	
	/**
	 * Busca un personaje en la lista.
	 * @param name Nombre del personaje a buscar.
	 * @return En caso de encontrarlo retorna un personaje, de lo contrario retorna null.
	 */
	@Override
	public comicCharacter findCharacter(String name) {
		return this._characters.stream().filter( c -> c.getName().equalsIgnoreCase(name))
								 .findAny()
								 .orElse(null);
	}
	
	/**
	 * Muestra las caracteristicas de dicho personaje.
	 * @param name Nombre del personaje
	 */
	@Override
	public void characterProperties(String name) {
		System.out.println(this.findCharacter(name));
	}

	/**
	 * Muestra todos los personajes de dicho universo.
	 * @param Universo a buscar.
	 * @return Muestra un listado de todos los personajes en el universo.
	 * 
	 */
	@Override
	public void allCharacterInUniverse(EUniverse universe) {
		System.out.println("::::::::::::::::: " + universe +" Universe :::::::::::::::::");
		this._characters.stream().filter( cc -> cc.getUniverse() == universe).forEach(cc -> System.out.println(cc.getName()));
		System.out.println("\n");
	}

	@Override
	public void updateCharacter(comicCharacter character) {
		if(this.findCharacter(character.getName()) != null) {
			this._characters.stream().filter( cc -> cc.getName().equalsIgnoreCase(character.getName()))
									 .forEach(cc -> {
										 cc.setPower(character.getPower());
										 cc.setUniverse(character.getUniverse());
										 cc.setWeakness(character.getWeakness());
									 });
									
			
			System.out.println(character.getName() +" has been updated succesfully ;)");
		}
		else {
			System.out.println(character.getName() + " has no been found :O");
		}
	}
	


}
