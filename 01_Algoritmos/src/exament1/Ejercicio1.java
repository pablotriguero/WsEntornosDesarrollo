package exament1;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String passwordCorrecto = "1234";
		String nombreCorrecto = "harry";
		
		boolean correcto = false;
		//Todo esto van en el bucle
		do {
			String nombre = sc.nextLine();
			String password = sc.nextLine();		
			
			if(password.equals(passwordCorrecto) && nombre.equals(nombreCorrecto)) {
				System.out.println("Ha entrado en el sistema");
				correcto = true;
			}else {
				System.out.println("La contraseña no coincide!!");
			}
		}while(!correcto);
		//fin de bucle
	}
}
