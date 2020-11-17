package algoritmo2;

import java.util.Scanner;

public class Ej09_EjercicioCondicionales {

	public static void main(String[] args) {
		//pedir los numeros por pantalla
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca x1, y1 y r1");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double r1 = sc.nextDouble();
		
		System.out.println("Introduzca x2, y2 y r2");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double r2 = sc.nextDouble();
		
		double restaX = x2 - x1;
		double cuadradoRestaX = Math.pow(restaX, 2);
		
		double restaY = y2 - y1;
		double cuadradoRestaY = Math.pow(restaY, 2);
		
		double sumaCuadrados = cuadradoRestaX + cuadradoRestaY;
		double distancia = Math.sqrt(sumaCuadrados);
		System.out.println("La distancia entre las dos circunferencias es : " + distancia);
		
		double sumaRadios = r1 + r2;
		double restaRadios = r2 - r1;
		
		//sacado a partir de http://maralboran.org/wikipedia/index.php/Plantilla:Posici%C3%B3n_circ-circ
		if(distancia > sumaRadios) {
			System.out.println("Las dos circunferencias son exteriores");
		}else if(distancia == sumaRadios) {
			System.out.println("Las dos circunferencias son tangentes exteriores");
		}else if(distancia == 0) {
			System.out.println("Las dos circunferencias son concentricas");
		}else if(distancia < sumaRadios) {
			System.out.println("Las dos circunferencias son secantes");
		}else if(distancia == restaRadios) {
			System.out.println("Las dos circunferencias son tangentes interiores");
		}else {
			System.out.println("Las dos circunferencias son interiores");
		}
	}

}
