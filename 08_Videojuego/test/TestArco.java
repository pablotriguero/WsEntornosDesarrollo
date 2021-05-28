import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import entidad.Arco;
import entidad.Guerrero;

class TestArco {

	@Test
	void test() {
		Arco arco = new Arco();
		Guerrero g1 = new Guerrero(5);
		g1.setNombre("Legolas");
		arco.setPersonaje(g1);
		
		arco.setPorcentajeCritico(100);
		arco.setDañoMaximo(10);
		arco.setDañoMinimo(10);
		
		int resultadoEsperado = 15;
		int resultadoObtenido = arco.usar();
		assertEquals(resultadoEsperado, resultadoObtenido);
		
		arco.setPorcentajeCritico(0);
		
		resultadoEsperado = 10;
		resultadoObtenido = arco.usar();
		assertEquals(resultadoEsperado, resultadoObtenido);
	}

}
