package depuracion;

public class PruebaDepuracion4 {

	//Breakpoints condicionales, cuando queremos que un breakpoint
	//se ejecute bajo una condicion
	public static void main(String[] args) {
		
		System.out.println("Imprimiendo todos los numeros enteros hasta el 100");

		//imaginemonos que solo nos interesa que se pare el programa
		//en modo depuraci�n cuando la iteracion del bucle vaya por
		//el n�mero 90. Tenemos que pulsar boton derecho sobre el punto
		//de interupci�n y elegir "breakpoint" properties. Elegiremos
		//la opcion "conditional" y dentro de la caja de texto pondremos
		//la condicion (i==90)
		for(int i = 0; i <= 100; i++) {
			System.out.println("Numero: " + i);
		}
		//tambien podemos ver todos los puntos de ruptura que tenemos
		//en nuestra aplicacion en la pesta�a "breakpoints" que esta
		//al lado de la pesta�a de "Variables"
	}

}
