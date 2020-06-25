package test.groovy

import org.junit.experimental.categories.Category
import spock.lang.Specification
import test.resource.comicCharacter

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
