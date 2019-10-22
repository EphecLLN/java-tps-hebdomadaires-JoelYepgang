package tp3;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ExerciceTDDTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testEstPair() {
		ExerciceTDD monInstance= new ExerciceTDD();
		assertTrue(monInstance.estPair(4));
		assertFalse(monInstance.estPair(3));
		assertEquals(false,monInstance.estPair(1));
		assertEquals(true,monInstance.estPair(2));
	}

	@Test
	void testPerimetreCarree() {
		ExerciceTDD monInstance = new ExerciceTDD();
		assertEquals(16, monInstance.perimetreCarree(4));
		assertEquals(4,monInstance.perimetreCarree(1));
		
		
	}

	@Test
	void testContientCaractere() {
		ExerciceTDD monInstance = new ExerciceTDD();
		assertTrue(monInstance.contientCaractere('a'));
		/*assertTrue(monInstance.contientCaractere('d'));
		assertFalse(monInstance.contientCaractere('x'));
		assertFalse(monInstance.contientCaractere('z'));*/
	}

}
