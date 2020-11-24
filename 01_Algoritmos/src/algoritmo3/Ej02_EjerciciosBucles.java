package algoritmo3;

import java.util.Scanner;

/*
 * //Algoritmo que pida números hasta que se introduzca un cero. Debe imprimir la suma
// y la media de todos los números introducidos.
 */
public class Ej02_EjerciciosBucles {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int contador = 1;
		int numBucle;
		int sumaNumBucle = 0;
		int mediaNumBucle = 0;
		do {
			System.out.println("Introuce el numero " + contador);
			numBucle = Integer.parseInt(sc.nextLine());

			sumaNumBucle = sumaNumBucle + numBucle;

			mediaNumBucle = sumaNumBucle / contador;

			++contador;
		} while (numBucle != 0);

		System.out.println("La suma de los números es " + sumaNumBucle + " y la media " + mediaNumBucle);
		sc.close();

	}

}
