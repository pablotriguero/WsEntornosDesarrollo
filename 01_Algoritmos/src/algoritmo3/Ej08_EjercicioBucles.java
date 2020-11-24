package algoritmo3;

public class Ej08_EjercicioBucles {
	public static void main(String[] args) {
		int resultado = 0;		
		//El primer for lleva el contador de numero de la tabla a calcular
		for (int i=1; i<=1000; i++) {
			System.out.println("TABLA DEL "+ i);
			for (int j=0; j<=10; j++) {
				resultado = i * j;
				System.out.println(i +" x "+ j +"= "+ resultado);
			}
		}
	}
}
