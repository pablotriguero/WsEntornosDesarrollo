package junit5.programa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import programa.Jugador;

class TestJugador {

	@Test
	void testDorsal() {
		Jugador j = new Jugador();
		j.ponerDorsal(1);
		
		int resultadoEsperado = 1;
		
		assertEquals(resultadoEsperado, j.getDorsal());
		
		j.ponerDorsal(50);
		
		resultadoEsperado = -1;
		assertEquals(resultadoEsperado, j.getDorsal());
	}
	
	@Test
	void testExpulsado() {
		Jugador j = new Jugador();

		j.setNumeroTarjetasAmarillas(2);
		
		assertTrue(j.estaExpulsado());
		
		j.setNumeroTarjetasAmarillas(0);
		j.setNumeroTarjetasRojas(1);
		
		assertTrue(j.estaExpulsado());
		
		j.setNumeroTarjetasAmarillas(0);
		j.setNumeroTarjetasRojas(0);
		
		assertFalse(j.estaExpulsado());
	}

}
