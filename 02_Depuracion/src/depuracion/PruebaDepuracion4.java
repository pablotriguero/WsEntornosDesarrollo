package depuracion;

public class PruebaDepuracion4 {

	//Breakpoints condicionales, cuando queremos que un breakpoint
	//se ejecute bajo una condicion
	public static void main(String[] args) {
		
		System.out.println("Imprimiendo todos los numeros enteros hasta el 100");

		//imaginemonos que solo nos interesa que se pare el programa
		//en modo depuración cuando la iteracion del bucle vaya por
		//el número 90. Tenemos que pulsar boton derecho sobre el punto
		//de interupción y elegir "breakpoint" properties. Elegiremos
		//la opcion "conditional" y dentro de la caja de texto pondremos
		//la condicion (i==90)
		for(int i = 0; i <= 100; i++) {
			System.out.println("Numero: " + i);
		}
		//tambien podemos ver todos los puntos de ruptura que tenemos
		//en nuestra aplicacion en la pestaña "breakpoints" que esta
		//al lado de la pestaña de "Variables"
	}

}
