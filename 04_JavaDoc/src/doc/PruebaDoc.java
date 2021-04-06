package doc;
import java.util.Date;

/**
 * Para crear documentaci�n de una clase tenemos que poner "/**" y pulsar
 * enter sobre la clase
 * 
 * Ejemplo de creaci�n de documentaci�n para Javadoc.<br/>
 * Podemos incluir etiquetas <b>HTML para enriquecer el texto</b>.
 * 
 * Aqui deberia ir una descripci�n de lo que hace la clase
 * 
 * Basicamanete cuando documentamos una clase hay que documentar varias partes:
 * 1) La propia clase ** 
 * 2) Atributos o campos 
 * 3) Los metodos. Normalmente los getter y setter no se documentan **
 * 4) Los constructores
 * 
 * La idea es dar a enterder que hace la clase, que representan los atributos y
 * que hacen los metodos
 * 
 * En java doc tenemos adem�s anotaciones, para que, cuando generemos
 * la documentaci�n o la veamos mediante un IDE como eclipse este
 * mejor representada. Podemos poner "@" y luego pulsar ctrl+spacio para 
 * ver las anotaciones disponibles
 * 
 * @author Nombre del autor.
 * @version 1.0
 * @since 25-10-2018.
 *
 */
public class PruebaDoc {
	// PROPIEDADES DE CLASE
	/**
	 * Aqui iria una descripci�n de lo que representa esta propiedad
	 */
	private String texto;
	/**
	 * Valor numerico entero.
	 */
	private Integer numero;

	// ZONA DE CONSTRUCTORES
	/**
	 * Comentario de metodo simple. Podriamos add informaci�n sobre este constructor
	 */
	public PruebaDoc() {

	}

	// ZONA DE LOGICA
	/**
	 * Dentro de los metodos al menos hay que comentar lo siguiente:
	 * 
	 * 1) Lo que hace el m�todo
	 * 2) Los parametros de entrada y lo que prepresentan
	 * 3) El parametro de salida y lo que reprenta
	 * 4) Si arroja alguna excepci�n, cuando ocurre
	 * 
	 * Como este metodo, no tiene parametros de entrada ni de 
	 * salida, simplemente deberiamos aportar una descripci�n lo que
	 * hace este m�todo
	 */
	public void metodoUno() {
		//Dento del metodo prod�an ir los comentarios
		// COMENTARIO DE LINEA, ESTOS COMENTARIOS NO SON DE JAVADOC
		// SEGUNDA LINEA DE COMENTARIO
		/*
		 * COMENTARIOS DE VARIAS LINEAS, NO CONFUNDIR CON JAVADOC
		 */

	}

	/**
	 * Aqui ir�a una descripci�n del metodo, pero como adem�s tenemos parametros
	 * de entrada y de salida, deberiamos crear anotaciones que representen y
	 * expliquen los parametros de entrada y los parametros de salida
	 * 
	 * @param numero
	 *            Valor numerico del entero y su funcion es... (lo que sea)
	 * @param fecha
	 *            Valor fecha de nacimiento de la persona (por ejemplo...)
	 * @return Cadena devuelta calculada despues de... (lo que sea)
	 */
	public String metodoDos(Integer numero, Date fecha) {

		return null;
	}

	/**
	 * Aqui ir�a una descripci�n del metodo y sus parametros de entrada y de salida
	 * pero como adem�s tenemos una excepci�n tambien podemos anotarla para explicar
	 * cuando se arroja dicha excepcion
	 * 
	 * @param texto
	 *            Valor texto.
	 * @return Valor numerico.
	 * 
	 * @throws Exception
	 *             Excepcion dada. {@link Exception#getLocalizedMessage()}
	 */
	public Integer metodoTres(String texto) throws RuntimeException {

		return null;
	}

}