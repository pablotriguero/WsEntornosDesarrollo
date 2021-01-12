package refactorizacion;

public class ClaseRefactorizar {
	public static void main(String[] args) {
		//imaginemonos que quiero cambiar el nombre de la variable, porque
		//ya no me gusta, o no lo veo apropiado. 
		//para ello podemos cambiarlo a mano (todas las variables) o 
		//podemos refactorizar el nombre de la variable
		//Seleccionamos el nombre de la variable  boton derecho -> refactor
		//-> rename
		int numeroEntero = 0;
		
		numeroEntero += 1;
		
		System.out.println(numeroEntero);
		
		numeroEntero = numeroEntero * 8;
		
		System.out.println(numeroEntero);
		
		numeroEntero = numeroEntero / 2;
		
		System.out.println(numeroEntero);
		
		numeroEntero -= 5;
		
		System.out.println(numeroEntero);
	}
}
