package refactorizacion;

//Esta clase va a hacer las operaciones principales con dos numeros
//tambien podemos refactorizar clases para que se cambie el nombre en todo
//el programa
//para ello boton derecho sobre el fichero de la clase y hacer un refactor ->rename
public class OperacionesDeMatematicas {
	//podemos cambiar el nombre de un metodo y que se me cambie en todo
	//el programa refactorizando el nombre igual que cuando refactorizamos
	//una variable
	public int sumarEntero(int n1, int n2) {
		return n1 + n2;
	}
	
	public int restar(int n1, int n2) {
		return n1 - n2;
	}
	
	public int multiplicar(int n1, int n2) {
		return n1 * n2;
	}
	
	public int dividir(int n1, int n2) {
		return n1 / n2;
	}
}
