package entidad;

/**
 * Esto seria un comentario java doc, que sirve para documetar, y empiezan por "/**"
 * Podemos documentar principalmente clases, atributos y métodos
 * 
 * Aqui iria una descripcion de lo que hace clase, con todo el nivel de detalle que se precise
 * 
 * En javadoc podemos poner anotaciones o etiquetas, cuya función es la de separar o 
 * remarcar ciertas partes de la documentación
 * 
 * Esta anotacion representará el autor que ha hecho esta clase
 * @author Felix de Pablo Lobo
 * 
 * Esta anotacion representaria la version
 * @version 1.0
 *
 *///acaban asi los java doc :)
public class Principal {

	public static void main(String[] args) {
		//esto es un comentario de una linea y la función es clarificar el codigo para
		//otros programadores
		/*
		 * esto seria un comentario de varias lineas
		 * otra linea
		 * otra mas
		 * 
		 */
		Persona p1 = new Persona();
		Direccion d1 = new Direccion();
		p1.setDireccion(d1);
		
		p1.setNombre("Son Goku");
		p1.getDireccion().setCiudad("Namek");
		p1.setFechaNacimiento("05/04/1985");
		
		Matematicas m = new Matematicas();
		
		m.sumar(2, 5);
		m.restar(5, 6);
	}

}
