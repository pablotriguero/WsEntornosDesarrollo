package junit5.programa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import programa.ClaseMagica;

class TestCasaMagica {

	@Test
	void test() {
		ClaseMagica cm = new ClaseMagica();
		String resultadoEsperado = "LUNES";
		String resultado = cm.metodo(1);
		
		assertEquals(resultadoEsperado, resultado);
		
		resultadoEsperado = "MARTES";
		resultado = cm.metodo(2);
		
		assertEquals(resultadoEsperado, resultado);
		
		resultado = cm.metodo(3);
		
		assertNull(resultado);
	}

}
