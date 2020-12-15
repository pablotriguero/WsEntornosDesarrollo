package depuracion;

public class PruebaDepuracion1 {
	public static void main(String[] args) {
		System.out.println("Esto es una prueba de depuración");
		System.out.println("Va a aprender los comandos basicos para depurar");
		System.out.println("Para depuerara el codigo debes de ejecutar el codigo en modo depuración");
		System.out.println("Para ello boton derecho sobre la app y debug as...");
		System.out.println("En este modo la aplicacion se parara cuando en cuentre un punto de interupción");
		System.out.println("Para poner un punto de interupción doble click sobre el número de la linea que queremos");
		System.out.println("Deberá de aparecer un punto azul");
		
		System.out.println("Podemos para nuestro programa pulsando el cuadrado rojo");
		System.out.println("Podemos cambiar de perspectiva pulsando los iconos de arriba a la derecha");
		
		System.out.println("Una vez que le programa se haya parado, podemos hacer que continue");
		System.out.println("Para ello usaremos los comandos de la pestaña 'RUN'");
		
		System.out.println("Con resume o f8 continuaremos hasta el siguiente punto de interrupción");
		System.out.println("Pongo aqui otro punto de interrupción");
		
		System.out.println("Podemos tambien ir viendo linea a linea por donde va pasando el programa");
		System.out.println("Es decir, ir ejecutando paso a paso el programa");
		System.out.println("Para ello usaremos la opción 'Step over' o F6");
		System.out.println("De esta menera recorreremos linea a linea");
		
		System.out.println("Tambien esta la opción 'Step into' o F5 que sirve para meterse dentro de los métodos");
		System.out.println("Otro punto de interupción");
		System.out.println("Si pulsamos F6 pasaremos por encima del metodo al ejecutar");
		System.out.println("Si pulsamos F5 nos meteremos dentro del método");
		imprimirLineasPorPantalla();
		System.out.println("Esto es depues de la llamada al metodo");
		
	}
	
	public static void imprimirLineasPorPantalla() {
		System.out.println("Esto sería una linea");
		System.out.println("Esto sería otra linea");
		System.out.println("Esto sería otra linea más");
		otraFuncion();
	}
	
	public static void otraFuncion() {
		//mas codigo
	}
	
}
