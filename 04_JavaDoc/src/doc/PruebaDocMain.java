package doc;

import java.util.Date;

public class PruebaDocMain {

	public static void main(String[] args) {
		
		String cadena = "Steve Rogers";
		System.out.println(cadena);
		System.out.println(cadena.toLowerCase());
		
		
		PruebaDoc pd = new PruebaDoc();
		//Si pasamos el raton por encima del metodo nos dara la información
		//en java doc. Hay que tener claro que javadoc sirve para que
		//la gente que use nuestras clases sepa como usarlas sin necesidad
		//de entender el codigo
		pd.metodoDos(34, new Date());
		pd.metodoTres("texto");
		
		cadena = "Esto es un string";
		cadena.length();
		cadena.substring(0, 8);
	}

}
