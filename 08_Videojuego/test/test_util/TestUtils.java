package test_util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import util.NumerosAleatorios;
import util.NumerosEnteros;

class TestUtils {

	@Test
	void test() {
		int numeroAleatorio = NumerosAleatorios.calcular(5, 5);
		
		int resultadoEsperado = 5;
		assertEquals(resultadoEsperado, numeroAleatorio);
	}
	
	@Test
	void testComparar() {
		int resultadoObtenido = NumerosEnteros.comparar(5, 3);
		int resultadoEsperado = -2;
		
		//assertEquals(resultadoEsperado, resultadoObtenido);
		
		//Probamos que no sea positivo, para este caso en vez de
		//un assert ponemos una condicion y fallamos cuando sea
		//mayor que cero. Es mejor esto que un assert en este caso
		//ya que me permite valorar un rango.
		if(resultadoObtenido >= 0) {
			fail();
		}
		
		resultadoObtenido = NumerosEnteros.comparar(5, 5);
		//Probamos que sea igual a 0
		if(resultadoObtenido != 0) {
			fail();
		}
		
		//Probamos que no sea negativo
		resultadoObtenido = NumerosEnteros.comparar(3, 5);
		if(resultadoObtenido <= 0) {
			fail();
		}
		
	}
	
	@Test
	void testCadena() {
		NumerosEnteros ne = new NumerosEnteros();
		
		String cadena = "pepe";
		
		int valorObtenido = ne.numeroCaracteres(cadena);
		int valorEsperado = 4;
		
		assertEquals(valorEsperado, valorObtenido);
		
		valorObtenido = ne.numeroCaracteres(null);
		valorEsperado = -1;
		
		assertEquals(valorEsperado, valorObtenido);		
	}

}
