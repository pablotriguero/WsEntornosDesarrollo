package main;

import entidad.Arco;
import entidad.Guerrero;
import entidad.Hacha;
import entidad.Hechizo;
import entidad.Mago;
import entidad.Personaje;
import negocio.Coliseo;

public class MainVideojuego {

	public static void main(String[] args) {
		Mago mago = new Mago(10);
		mago.setNombre("Gandalf el Gris");
		mago.setVida(200);
		
		Guerrero guerrero = new Guerrero(14);
		guerrero.setNombre("Gimli");
		guerrero.setVida(300);
		
		Arco arco = new Arco();
		arco.setDa�oMinimo(5);
		arco.setDa�oMaximo(10);
		arco.setPorcentajeCritico(20);
		
		Hacha hacha = new Hacha();
		hacha.setDa�oMinimo(10);
		hacha.setDa�oMaximo(20);
		hacha.setPorcentajeCritico(15);
		
		Hechizo bolaDeFuego = new Hechizo();
		bolaDeFuego.setDa�oMaximo(20);
		bolaDeFuego.setDa�oMinimo(5);
		bolaDeFuego.setPorcentajeCritico(10);
		
		mago.setArma(bolaDeFuego);
		guerrero.setArma(hacha);
		
		bolaDeFuego.setPersonaje(mago);
		hacha.setPersonaje(guerrero);
		
		Coliseo coliseo = new Coliseo(mago, guerrero);
		Personaje pGanador = coliseo.empezarCombate();
		
		System.out.println("HA GANADO" + pGanador.getNombre());

	}

}
