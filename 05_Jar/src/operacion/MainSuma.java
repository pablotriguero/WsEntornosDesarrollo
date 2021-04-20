package operacion;

public class MainSuma {

	public static void main(String[] args) {
		
		Suma s = new Suma();
		
		int resultado = s.sumar(1,2,3,4,5);
		System.out.println(resultado);
		
		resultado = s.sumar(2,3);
		System.out.println(resultado);
		
		resultado = s.sumar();
		System.out.println(resultado);
		
		resultado = s.sumar(2,3,5,6,56,34,23,45,666);
		System.out.println(resultado);
	}

}
