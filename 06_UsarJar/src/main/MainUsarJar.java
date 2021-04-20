package main;

import operacion.Suma;

public class MainUsarJar {

	public static void main(String[] args) {
		Suma s = new Suma();
		
		int resultado = s.sumar(2,3,4,5,6,7,9);
		System.out.println(resultado);

	}

}
