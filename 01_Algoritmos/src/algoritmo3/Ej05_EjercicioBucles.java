package algoritmo3;

import java.util.Scanner;

public class Ej05_EjercicioBucles {
	public static void main(String[] args) {
		//EJ 5
		//Escribir un programa que imprima todos los números pares 
		//entre dos números que se le pidan al usuario.
			
		Scanner sc=new Scanner(System.in);
				
		int num1,num2;
		
		System.out.println("Introduce el número 1:");
		num1=Integer.parseInt(sc.nextLine());
		
		System.out.println("Introduce el número 2:");
		num2=Integer.parseInt(sc.nextLine());
		
		int menor = num1;
		int mayor = num2;
		
		if (num1 > num2) {
			menor = num2;
			mayor = num1;			
		}
				
		for (int i = menor; i < mayor; i++) {
			if (i % 2 == 0) {
				System.out.println("" + i);
			}
		}		
		
		sc.close();
	}
}
