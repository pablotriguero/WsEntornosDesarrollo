package exament1;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean correcto = true;
		//Blucle
		do {
			System.out.println("introduzca un numero entre el 1 y el 12");
			String numero = sc.nextLine();
		
			correcto = true;
			
			switch (numero) {
				case "1":
					System.out.println("31");
					break;
				case "2":
					System.out.println("28 o 29");
					break;
				case "3":
					System.out.println("31");
					break;
				case "4":
					System.out.println("30");
					break;
				case "5":
					System.out.println("31");
					break;
				case "6":
					System.out.println("30");
					break;
				case "7":
					System.out.println("31");
					break;
				case "8":
					System.out.println("31");
					break;
				case "9":
					System.out.println("30");
					break;
				case "10":
					System.out.println("31");
					break;
				case "11":
					System.out.println("30");
					break;
				case "12":
					System.out.println("31");
					break;
				default:
					correcto = false;
					System.out.println("El mes introducido no es valido");
					break;
			}
		}while(!correcto);
		//fin bucle
	}
}
