package algoritmo3;

import java.util.Scanner;

public class Ej06_EjercicioBucles {
	public static void main(String[] args) {
		Scanner scc = new Scanner(System.in);
		System.out.println("Introduce un numero para la tabla de multiplicar");
		int numero = scc.nextInt();

		int contador = 1;
		while(contador <= 10) {
			int resultado = contador * numero;
			System.out.println(numero + " x " + contador + " = " + resultado);
			contador++;
		}
		scc.close();
	}
}
