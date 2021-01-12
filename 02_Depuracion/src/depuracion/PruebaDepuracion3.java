package depuracion;

import java.util.Scanner;

public class PruebaDepuracion3 {

	//Vamos a probar a hacer un error en tiempo de ejecución
	//haciendo un programa que divida dos numeros
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el numerador");
		int numerador = sc.nextInt();
		System.out.println("Introduzca el denominador");
		int denominador = sc.nextInt();
		
		//si el denominador es "0" daria un error en tiempo de ejecución
		//ya que no se puede dividir por "0"
		int resultado = 0;
		if(denominador != 0) {
			 resultado = numerador / denominador;
			 System.out.println("El resultado es: " + resultado);
		}else {
			System.out.println("No se puede dividir un número por 0");
		}	
		
		sc.close();
	}

}
