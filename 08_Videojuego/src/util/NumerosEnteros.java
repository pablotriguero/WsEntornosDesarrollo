package util;

/**
 * Clase que hace distintas operaciones con numeros enteros
 * 
 * @author vened
 *
 */
public class NumerosEnteros {

	/**
	 * Metodo que comparara los dos numeros pasados por parametros
	 * y decide cual es el mayor de los 2
	 * @param n1 el primer numero a comparor
	 * @param n2 el segundo numero a comparar
	 * @return devolvemos un numero negativo en caso de que n1 sea mayor
	 * que n2, devolvermos un numero positivo en caso de que n2 sea mayor
	 * que n1 y devolvemos 0 en caso de que sean iguales.
	 */
	public static int comparar(int n1, int n2) {
		return n2 - n1;
	}
	
	/**
	 * Metodo que devuelve el numero de cararteres de un String
	 * @param s1 el string a calcular el numero de caracteres
	 * @return el numero de caracteres del string. En caso de que el 
	 * parametro s1 sea nulo, se devolvera -1
	 */
	public int numeroCaracteres(String s1) {
		if(s1 == null) {
			return -1;
		}
		return s1.length();
	}
}
