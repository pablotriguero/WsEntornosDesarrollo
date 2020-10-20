package algoritmo1;

import java.util.Scanner;

public class CalcularRadioPerimetro {
	
	public static void main(String[] args) {
		//Definir las variables
		double radio = 0;
		double area = 0;
		double perimetro;
		//Definir las constantes (van en upper snake case)
		final double NUMERO_PI = 3.1416;
		
		//Para pedir datos al usuario usaremos la clase Scanner
		Scanner sc = new Scanner(System.in);
		//mostramos por pantalla
		System.out.println("Introduzca el radio: ");
		//recojemos el valor
		radio = sc.nextDouble();
		
		//Calcular el perimetro y el radio
		perimetro = NUMERO_PI * 2 * radio;
		area = NUMERO_PI * radio * radio;
		//esta manera es equivalente a la de arriba
		area = Math.PI * Math.pow(radio, 2);
		
		System.out.println("El perimetro es: " + perimetro);
		System.out.println("El area es: " + area);
		
		sc.close();
	}
}
