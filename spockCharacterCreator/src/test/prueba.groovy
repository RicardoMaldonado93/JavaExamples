package test

import main.com.model.comicCharacter
import org.junit.experimental.categories.Category

import spock.lang.Specification

@Category(comicCharacter.class)
class prueba extends Specification {
	
	def "algo para probar"(){
		given:
			def cc
		when:
			cc = new comicCharacter()
		then:
			assert comicCharacter.isInstance(cc)
	}
}
