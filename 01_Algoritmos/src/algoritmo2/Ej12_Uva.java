package algoritmo2;

import java.util.Scanner;

public class Ej12_Uva {
	
	static final double PRECIO_INI = 0.85 ;

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce la cantidad de uva (Kg)");
		double cant = Double.parseDouble(sc.nextLine());
	
		System.out.println("Introduce tipo de uva");
		System.out.println("Tinta o Blanco");
		String tipo = sc.nextLine();
		
		System.out.println("Introduce tama�o de uva");
		String tama�o = sc.nextLine();
		
		String tipoA = "Tinta";
		String tipoB = "Blanca";
		String tama�o1 = "Peque�a";
		String tama�o2 = "Grande";
		double resultado = -1;
		
		if (tipo.equalsIgnoreCase(tipoA) && tama�o.equalsIgnoreCase(tama�o1)) {
			resultado = cant * (PRECIO_INI + 0.20);
		} else if (tipo.equalsIgnoreCase(tipoA) && tama�o.equalsIgnoreCase(tama�o2)) {
			resultado = cant * (PRECIO_INI + 0.30);
		} else if (tipo.equalsIgnoreCase(tipoB) && tama�o.equalsIgnoreCase(tama�o1)) {
			resultado = cant *  (PRECIO_INI - 0.30);
		} else if (tipo.equalsIgnoreCase(tipoB) && tama�o.equalsIgnoreCase(tama�o2)) {
			resultado = cant *  (PRECIO_INI - 0.50);			
		} else {
			System.out.println("No se ha podido calcular el precio de venta");
		}
		
		if(resultado != -1) {
			System.out.println("Este es el precio de la uva " + tipoA + " de " + tama�o1 + " tama�o: " + resultado);
		}
		
		sc.close();

	}

}