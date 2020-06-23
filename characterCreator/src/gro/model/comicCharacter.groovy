package gro.model;

import gro.model.EUniverse

public class comicCharacter {

	String name
	EUniverse universe
	String power
	String weakness
	
	comicCharacter() {}
	
	comicCharacter(	name, universe, power, weakness) {
		this.name = name
		this.universe = universe
		this.power = power
		this.weakness = weakness
	}

	@Override
	public String toString() {
		return "comicCharacter [name= ${name} , universe= ${universe}, power= ${power}, weakness= ${weakness} ]";
	}
	
	
	

}
