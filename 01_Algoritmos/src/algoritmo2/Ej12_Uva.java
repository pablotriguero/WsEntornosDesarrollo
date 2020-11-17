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
		
		System.out.println("Introduce tamaño de uva");
		String tamaño = sc.nextLine();
		
		String tipoA = "Tinta";
		String tipoB = "Blanca";
		String tamaño1 = "Pequeña";
		String tamaño2 = "Grande";
		double resultado = -1;
		
		if (tipo.equalsIgnoreCase(tipoA) && tamaño.equalsIgnoreCase(tamaño1)) {
			resultado = cant * (PRECIO_INI + 0.20);
		} else if (tipo.equalsIgnoreCase(tipoA) && tamaño.equalsIgnoreCase(tamaño2)) {
			resultado = cant * (PRECIO_INI + 0.30);
		} else if (tipo.equalsIgnoreCase(tipoB) && tamaño.equalsIgnoreCase(tamaño1)) {
			resultado = cant *  (PRECIO_INI - 0.30);
		} else if (tipo.equalsIgnoreCase(tipoB) && tamaño.equalsIgnoreCase(tamaño2)) {
			resultado = cant *  (PRECIO_INI - 0.50);			
		} else {
			System.out.println("No se ha podido calcular el precio de venta");
		}
		
		if(resultado != -1) {
			System.out.println("Este es el precio de la uva " + tipoA + " de " + tamaño1 + " tamaño: " + resultado);
		}
		
		sc.close();

	}

}