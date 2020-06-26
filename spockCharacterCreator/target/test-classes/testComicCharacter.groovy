package test.resources

import main.com.enums.EUniverse
import main.com.model.comicCharacter
import org.junit.experimental.categories.Category

import spock.lang.Specification

@Category(comicCharacter.class)
class testComicCharacter extends Specification {
	def cc = new comicCharacter("Wolwerine", "Inmortal", EUniverse.MARVEL)
	
	def "Comprobamos que se instancie el objeto"(){
		expect:
			assert comicCharacter.isInstance(cc)
	}
	
	def "Comprobamos las propiedades ya instanciadas"(){
		expect:
			assert cc._name == "Wolwerine"
			assert cc._power == "Inmortal"
			assert cc._universe == EUniverse.MARVEL
	}
	
	def "Comprobamos los Setters"(){
			cc._name = "Hulk"
			cc._power = "Strength"
			cc._universe = EUniverse.MARVEL
			
		expect:
			assert cc._name == "Hulk"
			assert cc._power == "Strength"
			assert cc._universe == EUniverse.MARVEL
	}
}
