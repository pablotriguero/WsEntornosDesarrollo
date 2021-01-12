package refactorizacion;

import java.util.Scanner;

public class MainMatematicas {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero1 = sc.nextInt();
		int numero2 = sc.nextInt();
		
		//lo primero que tenemos que hacer es crear el objeto Matematicas
		//crear una instancia de la clase matematicas
		OperacionesDeMatematicas matematicas = new OperacionesDeMatematicas();
		int resultado = matematicas.sumarEntero(numero1, numero2);
		
		System.out.println(resultado);
		
		resultado = matematicas.restar(numero1, numero2);
		
		System.out.println(resultado);
	}
}
