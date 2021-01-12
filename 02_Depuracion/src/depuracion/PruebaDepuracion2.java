package depuracion;

public class PruebaDepuracion2 {
	
	//vamos a ver como podemos trabajar con variables
	public static void main(String[] args) {
		//Es buena costumbre, siempre inicializar las variables un número
		int numero = 0;
		//ponemos aquí un punto de interupción
		//y podemos observa en la parte de variables a la derecha
		//los valores que van tomando
		numero++;
		numero += 5;
		numero *= 4;
		numero--;
		
		String cadena = "Harry Potter";
		//podemos cambiar el valor de las variables en tiempo de ejecucion
		//sin tener que tocar el codigo. Solamente se cambiará para esa
		//ejecución del programa. Podemos cambiar el valor donde vemos
		//el valor de la variables
		System.out.println(cadena);
		
		//podemos poner sysos para ver los valores pero es mejor
		//depurar el codigo para ver el valor de las variables
		//System.out.println(numero);
		if(numero > 100) {
			System.out.println("El numero es mayor que 100");
		}
		
		//preguntamos si es par o impar
		if(numero % 2 == 0) {
			System.out.println("es par");
		}		
	}

}
