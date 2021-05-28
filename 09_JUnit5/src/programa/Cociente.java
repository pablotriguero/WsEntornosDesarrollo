package programa;

/**
 * 
 * @author Andrea Bernal
 * @since 09/03/2021
 * 
 * Esta clase realiza 4 operaciones básicas con números enteros y reales. Forma parte del programa CalculatorPro.
 *
 */

public class Cociente {
	/**
	 * El método dividirReales realiza la división de dos números reales:
	 * Puede dar excepción si lo que se introduce no es un número
	 * @param num1 será el primer número introducido y representa el dividendo
	 * @param num2 será el segundo número introducido y representa el divisor
	 * @return resultado de dividir num1 entre num2
	 */

	public double dividirReales (double num1, double num2) {
		double resultado = 0;

		if (num2 == 0) {
			System.out.println("No se puede dividir entre 0.");
		} else {
			resultado = num1 / num2;
		}

		return resultado;
	}

	/**
	 * El método dividirEnteros realiza la operación básica de división entre dos números enteros
	 * Puede dar excepción si lo que se introduce no es un número
	 * @param num1 representa el dividendo
	 * @param num2 representa el divisor
	 * @return resultado de dividir num1 entre num2
	 */

	public int dividirEnteros(int num1, int num2) {
		int resultado = 0;

		if (num2 == 0) {
			System.out.println("No se puede dividir entre 0.");
		} else {
			resultado = num1 / num2;
		}

		return resultado;
	}
	
	/**
	 * El método calcularInverso recibe un número real cualquiera y devuelve su inverso. 
	 * El inverso de un número es el resultado de dividir 1 entre el número.
	 * Puede dar excepción si lo que se introduce no es un número
	 * @param num es el número introducido y representa un número real
	 * @return inverso del número introducido como parámetro.
	 */

	public double calcularInverso(double num) {
		double inverso = 0;

		if (num == 0) {
			System.out.println("El inverso de 0 no existe.");
		} else {
			inverso = 1 / num;
		}

		return inverso;
	}

	/**
	 * El método calcularRaizCuadrada realiza la operación de raíz cuadrada de un número real introducido por teclado.
	 * Puede dar excepción si lo que se introduce no es un número
	 * @param num representa un número real
	 * @return resultado de hacer la raíz cuadrada del número introducido.
	 */
	
	public double calcularRaizCuadrada(double num) {
		double raizCuadrada = 0;

		if (num < 0) {
			System.out.println("La raíz de un número negativo no existe.");
		} else {
			raizCuadrada = Math.sqrt(num);
		}

		return raizCuadrada;
	}
}
