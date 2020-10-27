package algoritmo2;

import java.util.Scanner;

public class Condicionales {
	public static void main(String[] args) {
		//Normalmente la ejecución de un codigo empieza cuando
		//empieza el  main, y acaba cuando acaba el main
		//y se ejecuta de manera secuencial linea a linea
		//sin excepcion
		
		//Pero es posible que haya casos en los que determinadas partes
		//del codigo no queramos ejecutarlas por que nuestro algoritmo
		//no lo requiera.
		
		//Es en este punto cuando entran los condicionales, son
		//estructuras de control que hacen que una o varias lineas
		//de codigo no se ejecuten
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca su nombre: ");
		String nombre = sc.nextLine();
		
		//ojo, en java los string se comparan con un metodo
		//que se llama equals
		if(nombre.equals("") ) {//en caso de que sea vacio
			System.out.println("No se quien eres 😭");
		}else {//en caso contrario
			System.out.println("Bienvenido " + nombre);
		}
		
		System.out.println("Introduzca dos numeros para dividir");
		int numero1 = sc.nextInt();
		int numero2 = sc.nextInt();
		if(numero2 != 0) {
			int resultado = numero1/numero2;
			System.out.println(resultado);
		}else {
			System.out.println("No admitimos denominadores igual a 0");
		}
		
		sc.nextLine();
		System.out.println("Introduzca el dia de la semana:" );
		String diaSemana = sc.nextLine();
		System.out.println("Felix día " + diaSemana);
		//equalsIgnoreCase compara sin tener en cuenta las mayusculas
		//y las minusculas
		if(diaSemana.equalsIgnoreCase("lunes")) {
			System.out.println("Odio los lunes ☹");
		}
		
		//podemos valorar varios casos con el if, por ejemplo.
		//pedir un mes numerido y que me escriba el mes en string
		System.out.println("Escriba el mes en numero");
		int mes = sc.nextInt();
		if(mes == 1) {
			System.out.println("Estamos en ENERO");
		}else if(mes == 2) {
			System.out.println("Estamos en FEBRERO");
		}else if(mes == 3) {
			System.out.println("Estamos en MARZO");
		}else if(mes == 4) {
			System.out.println("Estamos en ABRIL");
		}else if(mes == 5) {
			System.out.println("Estamos en MAYO");
		}else if(mes == 6) {
			System.out.println("Estamos en JUNIO");
		}else if(mes == 7) {
			System.out.println("Estamos en JULIO");
		}else if(mes == 8) {
			System.out.println("Estamos en AGOSTO");
		}else if(mes == 9) {
			System.out.println("Estamos en SEPTIEMBRE");
		}else if(mes == 10) {
			System.out.println("Estamos en OCTUBRE");
		}else if(mes == 11) {
			System.out.println("Estamos en NOVIEMBRE");
		}else if(mes == 12) {
			System.out.println("Estamos en DICIEMBRE");
		}else {//podemos hacer que si NO coincide con nada de lo de arriba
			System.out.println("El mes introducido no lo reconozco ☹");
		}		
		
	}
}
