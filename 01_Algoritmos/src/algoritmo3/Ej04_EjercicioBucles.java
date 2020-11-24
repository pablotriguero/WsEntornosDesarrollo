package algoritmo3;

import java.util.Scanner;

public class Ej04_EjercicioBucles {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("cantidad de números");
		int cantidad = Integer.parseInt(sc.nextLine());
		
		int contMayores = 0;
		int contMenores = 0;
		int cont0 = 0;
		
		for(int i = 0; i< cantidad; i++) {
			System.out.println("Introduce un número");
			int num = Integer.parseInt(sc.nextLine());
			
			if (num < 0) {
				contMenores++;
			}
			
			if (num > 0) {
				contMayores++;
			}
			if (num == 0) {
				cont0++;
			}
		}
		
		System.out.println("numeros mayores que 0: "+ contMayores);
		System.out.println("numeros menores que 0: "+ contMenores);
		System.out.println("numeros iguales que 0: "+ cont0);
		
		sc.close();
	}
}
