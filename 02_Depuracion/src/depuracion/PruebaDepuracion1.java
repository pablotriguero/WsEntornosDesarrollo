package depuracion;

public class PruebaDepuracion1 {
	public static void main(String[] args) {
		System.out.println("Esto es una prueba de depuraci�n");
		System.out.println("Va a aprender los comandos basicos para depurar");
		System.out.println("Para depuerara el codigo debes de ejecutar el codigo en modo depuraci�n");
		System.out.println("Para ello boton derecho sobre la app y debug as...");
		System.out.println("En este modo la aplicacion se parara cuando en cuentre un punto de interupci�n");
		System.out.println("Para poner un punto de interupci�n doble click sobre el n�mero de la linea que queremos");
		System.out.println("Deber� de aparecer un punto azul");
		
		System.out.println("Podemos para nuestro programa pulsando el cuadrado rojo");
		System.out.println("Podemos cambiar de perspectiva pulsando los iconos de arriba a la derecha");
		
		System.out.println("Una vez que le programa se haya parado, podemos hacer que continue");
		System.out.println("Para ello usaremos los comandos de la pesta�a 'RUN'");
		
		System.out.println("Con resume o f8 continuaremos hasta el siguiente punto de interrupci�n");
		System.out.println("Pongo aqui otro punto de interrupci�n");
		
		System.out.println("Podemos tambien ir viendo linea a linea por donde va pasando el programa");
		System.out.println("Es decir, ir ejecutando paso a paso el programa");
		System.out.println("Para ello usaremos la opci�n 'Step over' o F6");
		System.out.println("De esta menera recorreremos linea a linea");
		
		System.out.println("Tambien esta la opci�n 'Step into' o F5 que sirve para meterse dentro de los m�todos");
		System.out.println("Otro punto de interupci�n");
		System.out.println("Si pulsamos F6 pasaremos por encima del metodo al ejecutar");
		System.out.println("Si pulsamos F5 nos meteremos dentro del m�todo");
		imprimirLineasPorPantalla();
		System.out.println("Esto es depues de la llamada al metodo");
		
	}
	
	public static void imprimirLineasPorPantalla() {
		System.out.println("Esto ser�a una linea");
		System.out.println("Esto ser�a otra linea");
		System.out.println("Esto ser�a otra linea m�s");
		otraFuncion();
	}
	
	public static void otraFuncion() {
		//mas codigo
	}
	
}
