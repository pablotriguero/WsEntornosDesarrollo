package programa;

/**
 * Clase que implementa un metodo
 * @author vened
 * @since 02/06
 * @version 1.0
 *
 */
public class ClaseMagica{
	/**
	 * Metodo que devuelve "LUNES", "MARTES" o null en funcion del parametro 
	 * de entrada
	 * @param a el parametro de entrada en entero
	 * @return "LUNES" en caso de el que parametro de entrada valga 1
	 * "MARTES" en caso de que el parametro de entrada valga 2
	 * en cualquier otro caso devolvemos null
	 */
	public String metodo(int a){
		if(a == 1){
			return "LUNES";
		}else if( a== 2){
			return "MARTES";
		}
		return null;
	}
}
