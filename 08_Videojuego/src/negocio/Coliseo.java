package negocio;

import java.util.Scanner;

import entidad.Personaje;
import util.NumerosAleatorios;

public class Coliseo {
	private Personaje p1;
	private Personaje p2;
	private Scanner sc;
	
	public Coliseo(Personaje p1, Personaje p2) {
		this.p1 = p1;
		this.p2 = p2;
		sc = new Scanner(System.in);
	}
	
	public Personaje empezarCombate() {
		
		boolean combateAcabado = false;
		Personaje pGanador = null;
		int turno = 1;
		
		Personaje pInicial = null;
		Personaje pFinal = null;
		
		int numeroAleatorio = NumerosAleatorios.calcular(1, 2);
		if(numeroAleatorio == 1) {
			pInicial = p1;
			pFinal = p2;
		}else {
			pInicial = p2;
			pFinal = p1;
		}
		System.out.println("Empezamos el combate a muerte!!!!");
		System.out.println("Personaje inicial: " + pInicial);
		System.out.println("Personaje final: " + pFinal);
		do {
			System.out.println("Turno: " + turno++);
			
			//Esto es el polimorfismo en java, se ejecutara el metodo 
			//atacar del objeto al que estemos apuntando!! Ojo ojo!!
			//Poca broma!!.
			int daño = pInicial.atacar(pFinal);
			System.out.println(pInicial.getNombre() + " hace " + daño);
			
			if(pFinal.getVida() <= 0) {
				combateAcabado = true;
				pGanador = pInicial;
			}else {
				daño = pFinal.atacar(pInicial);
				System.out.println(pFinal.getNombre() + " hace " + daño);
				
				if(pInicial.getVida() <= 0) {
					combateAcabado = true;
					pGanador = pFinal;
				}
			}
			System.out.println(pInicial.getNombre() + " tiene " + pInicial.getVida());
			System.out.println(pFinal.getNombre() + " tiene " + pFinal.getVida());
			System.out.println("Pulse enter para continuar");
			sc.nextLine();
		}while(!combateAcabado);
		
		return pGanador;
	}

}
