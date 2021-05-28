package junit5.programa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import programa.Cociente;

public class TestCociente {
	static Cociente cociente;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		cociente = new Cociente();
	}
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Test correcto");
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	public void testDividirReales() {
		double resultado = cociente.dividirReales(0, 3);
		double rEsperado = 0;
		
		System.out.println("Test con dividendo igual a cero");
		assertEquals(rEsperado, resultado);
		
		resultado = cociente.dividirReales(9.9, 3);
		rEsperado = 3.3;
		System.out.println("Test para división ordinaria de números decimales");
		assertEquals(rEsperado, resultado);
		
	}
	
	@Test
	public void testDividirEnteros() {
		int resultado = cociente.dividirEnteros(0, 3);
		int rEsperado = 0;
		
		System.out.println("Test con dividendo igual a cero");
		assertEquals(rEsperado, resultado);
		
		resultado = cociente.dividirEnteros(9, 3);
		rEsperado = 3;
		System.out.println("Test para división ordinaria de números enteros");
		assertEquals(rEsperado, resultado);
		
	}
	
	@Test
	public void testCalcularInverso() {
		double resultado = cociente.calcularInverso(1);
		double rEsperado = 1;
		
		assertEquals(rEsperado, resultado);
		
		resultado = cociente.calcularInverso(-50);
		rEsperado = -0.02;
		assertEquals(rEsperado, resultado);
		
	}
	
	@Test
	public void testCalcularRaizCuadrada() {
		double resultado = cociente.calcularRaizCuadrada(16);
		double rEsperado = 4;
		
		assertEquals(rEsperado, resultado);
		
		resultado = cociente.calcularRaizCuadrada(0);
		rEsperado = 0;
		assertEquals(rEsperado, resultado);
	}
	
}
