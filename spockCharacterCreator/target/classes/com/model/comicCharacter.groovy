package main.resources.com.model;

import main.resources.com.enums.EUniverse

class comicCharacter {
	private String _name
	private String _power
	private EUniverse _universe
	
	comicCharacter(String name, String power, EUniverse universe) {
		this._name = name
		this._power = power
		this._universe = universe
	}
	
	@Override
	String toString() {
		return "~ name: ${_name}, power: ${_power}, universe: ${_universe} ~"
	}
	
	
	
}
