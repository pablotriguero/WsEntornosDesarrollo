package algoritmo3;

import java.util.Random;
import java.util.Scanner;

/*
 * // EJ 3 
//Crea una aplicación que permita adivinar un número. La aplicación 
 genera un 
// número aleatorio del 1 al 20. A continuación va pidiendo números y va 
// respondiendo si el número a adivinar es mayor o menor que el introducido,
// a demás de los intentos que te quedan (tienes 5 intentos para acertarlo). 
// El programa termina cuando se acierta el número (además te dice en cuantos 
//intentos lo has acertado), si se llega al limite de intentos te muestra el 
//número que había generado.
 */
public class Ej03_EjercicioBucles {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numeroAleatorio = 0;
		int intento = 1;
		
		Random rd = new Random();
		numeroAleatorio = rd.nextInt(50 + 1);
		
		boolean continuar = true;
		System.out.println("Bienvenido a nuestra aplicacion de descubrir numeros!");
		//Este bucle ira pidiendo numeros hasta que haya acabado la partida
		do {
			System.out.println("Intento numero: " + intento);
			System.out.println("Escriba el numero: ");
			int numeroUsuario = sc.nextInt();
			
			if(numeroUsuario == numeroAleatorio) {
				System.out.println("Has acertado el numero: " + numeroAleatorio);
				break;
			} else if(numeroUsuario < numeroAleatorio) {
				System.out.println("El numero que has introducio es menor");
			} else {
				System.out.println("El numero que has introducido es mayor");
			}
			
			intento++;
			if(intento == 6) {
				System.out.println("Has acabado con el numero de intentos :( :(");
				System.out.println("El numero a adivinar era: " + numeroAleatorio);
				continuar = false;
			}
		}while(continuar);
		
		System.out.println("Fin del programa");
	}

}
