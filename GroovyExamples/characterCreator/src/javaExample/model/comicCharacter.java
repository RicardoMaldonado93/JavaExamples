
package javaExample.model;

public class comicCharacter {
	private String name;
	private EUniverse universe;
	private String power;
	private String weakness;
	
	public comicCharacter(String name, EUniverse universe , String power, String weakness){
		this.name = name;
		this.universe = universe;
		this.power = power;
		this.weakness = weakness;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EUniverse getUniverse() {
		return universe;
	}

	public void setUniverse(EUniverse universe) {
		this.universe = universe;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public String getWeakness() {
		return weakness;
	}

	public void setWeakness(String weakness) {
		this.weakness = weakness;
	}

	@Override
	public String toString() {
		return "comicCharacter [name: " + name + ", universe: " + universe + ", power: " + power + ", weakness: " + weakness + "]";
	}
	
	
}
