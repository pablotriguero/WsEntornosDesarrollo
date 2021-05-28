package programa;
/**
* 
* Clase Suma , contiene atributos y metodos para realizar
* las siguientes  operaciones matemáticas de una  suma , utilizando como
* base la suma de dos o tres variables con su correspondiente resultado
*.
* 
* Esta clase tendrá los siguientes métodos:
* Suma de dos números reales.
* Suma de dos números enteros.
* Suma de tres números reales.
* 
* Y un metodo que nos retorne el acumulado, que es la suma de todos los numeros.
* 
* 
* @autor Rafaela Barrena 
* @version 1.0
* @desde 06/06/2021
* */


public class Suma {
	/**
	 * Este atributo representa el valor acumulado numerico decimal
	 */
	private double acumulado;
		
	/**
	 * Metodo que realiza la Suma de dos numeros reales
	 * 
	 * @param num1 representa un numero decimal y el primer numero a sumar
	 * @param num2 representa un numero decimal y el segundo numero a sumar
	 * 
	 * @return el valor obtenido de la suma de dos numeros.
	 * 
	 */
		
	public double suma2NumerosReales(double num1, double num2) {
		double suma = 0;
		suma = num1 + num2;
		return suma;
	}
	
	/**
	 * Metodo que realiza la Suma de dos numeros entero
	 * 
	 * @param num1 representa un numero entero y el primer numero a sumar
	 * @param num2 representa un numero entero y el segundo numero a sumar
	 *   
	 * @return el valor obtenido de la suma de dos numeros.
	 *
	 */

	public int suma2NumerosEnteros(int num1, int num2) {
		int suma = 0;

		suma = num1 + num2;
		return suma;
	}

	
	/**
	 * Metodo que realiza la Suma de tres numeros reales
	 * 
	 * @param num1 representa un numero decimal y el primer numero a sumar
	 * @param num2 representa un numero decimal y el segundo numero a sumar
	 * @param num3 representa un numero decimal y el tercer numero a sumar
	 * 
	 * @return el valor obtenido de la suma de los tres numeros.
	 *
	 */
	public double suma3NumerosReales(double num1, double num2, double num3) {
		
		double suma;
		suma = num1 + num2 + num3;
		return suma;

	}
	
	/**
	 * Metodo que guarda el valor pasado por parametro de manera acumulada
	 * en el atributo "acumulado"
	 * 
	 * @param numero, el numero que queremos sumar y acumular
	 */
	public void sumaAcumulada(int numero) {
		acumulado += numero;
	}
	
	/**
	 * Metodo que  devuelve el valor acumulado de los numeros sumados.
	 * 
	 * @return  el valor acumulado obtenido de las sumas.
	 *
	 *
	 */
	public double getAcumulado() {
		return acumulado;
	}

	
}

