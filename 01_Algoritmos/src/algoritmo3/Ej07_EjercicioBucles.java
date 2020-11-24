package algoritmo3;

import java.util.Scanner;

public class Ej07_EjercicioBucles {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el número base");//3
		int base = Integer.parseInt(sc.nextLine());
		
		System.out.println("Introduzca el número exponente");//4
		int exp = Integer.parseInt(sc.nextLine());
		
		int i = 0;
		int resultado = 1;
		
		do {
			i++;
			resultado = resultado * base;//acumulador		
		} while (i < exp);
		
		System.out.println("El resultado es " + resultado);		
		sc.close();		
	}


	
}
