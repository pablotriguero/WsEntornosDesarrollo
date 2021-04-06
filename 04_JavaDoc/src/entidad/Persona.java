package entidad;

/**
 * 
 * Esta clase representaria una persona con sus atributos y metodos. Esta clase
 * esta destinada a almacenar objetos persona que creen los usuario
 * 
 * @author Felix de Pablo Lobo
 * @version 1.0
 *
 */
public class Persona {
	/**
	 * Este atributo representa el nombre de la persona
	 */
	private String nombre;
	
	/**
	 * Representa la direccion de la persona que es un objeto de tipo Direccion
	 * 
	 * @see Direccion
	 */
	private Direccion direccion;
	
	/**
	 * La fecha de nacimiento de la persona con formato dd/mm/yyyy
	 * Ej: 25/12/2021
	 */
	private String fechaNacimiento;

	//No hace falta documentar los getter y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
}
