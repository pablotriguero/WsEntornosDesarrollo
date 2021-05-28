/**
 * 
 */
package junit5.programa;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import programa.Suma;

/**
 * @author Rafaela Barrena
 *
 */
class SumaTest {

	private static final int NUM_ENTERO_2 = 3;
	private static final int NUM_ENTERO_1 = 2;
	private static final double NUM_REAL_1 = 2.5;
	
	Suma suma;

	@BeforeAll
	static void antesDeTodo() {
		System.out.println(" Comienzan mis pruebas");
	}
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		suma = new Suma();
	}

	/**
	 * Comprobar el metodo de dos numeros reales de la Clase suma
	 */
	@Test
	void suma2NumerosRealesTest() {

		double resultado = suma.suma2NumerosReales(NUM_REAL_1, NUM_REAL_1);
		assertEquals(resultado, 5);
		
		resultado = suma.suma2NumerosReales(3, 5);
		assertNotEquals(resultado, 10);

	}

	/**
	 * Comprobar el metodo de dos numeros Enteros de la Clase suma
	 */

	@Test
	void suma2NumerosEnterosTest() {
		int resultadoEnteros = suma.suma2NumerosEnteros(NUM_ENTERO_1, NUM_ENTERO_2);
		assertEquals(resultadoEnteros, 5);
	}

	/**
	 * Comprobar el metodo de Tres numeros Reales de la Clase suma
	 */

	@Test
	void suma3NumerosRealesTest() {
		double resultadoTresReales = suma.suma3NumerosReales(1.5, 3.3, 7.9);
		assertEquals(resultadoTresReales, 12.7);
		assertNotNull(resultadoTresReales, "No es nulo");
	}

	/**
	 * Comprobar el metodo Acumuladonunca es Nulo
	 */

	@Test
	void testAcumulado() {
		double valorEsperado = 0;
		double valorObtenido = suma.getAcumulado();
		
		assertEquals(valorEsperado, valorObtenido);
		
		suma.sumaAcumulada(5);
		
		valorEsperado = 5;
		valorObtenido = suma.getAcumulado();
		
		assertEquals(valorEsperado, valorObtenido);
		
		suma.sumaAcumulada(7);
		
		valorEsperado = 12;
		valorObtenido = suma.getAcumulado();
		
		assertEquals(valorEsperado, valorObtenido);
	}

	/**
	 * Comprobar el tiempo maximo para que se Ejecute el Test en ms.
	 */

	@Test
	@Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
	public void timeTest() throws InterruptedException {

		double resultado = suma.suma2NumerosReales(2.5, 2.5);

		Thread.sleep(50);
		// Si se demora más de 100ms no se ejecuta más codigo
		// se parará la ejecución

		System.out.println("Fin del Test");
	}

}
