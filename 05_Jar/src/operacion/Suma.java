package operacion;

public class Suma {
	
	//Podemos crear metodos un numero indeterminado de argumentos
	public int sumar(int... numeros) {
		//ahora trabajaremos con "numeros" como si fuera un array
		int resultado = 0;
		for(int i : numeros) {
			resultado += i;
		}
		return resultado;
	}
}
