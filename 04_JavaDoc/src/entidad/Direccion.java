package entidad;

/**
 * La direccion de la persona asociada
 * 
 * @author Felix de Pablo Lobo
 * @since 06-05-2021
 *
 */
public class Direccion {
	/**
	 * Representa el tipo de via donde vive, por ejemplo, calle, avenida
	 */
	private String tipoVia;
	
	/**
	 * Representa el nombre de la via donde vive, por ejemplo, Gran Via
	 */
	private String nombreVia;
	
	/**
	 * Representa la ciduda donde vive
	 */
	private String ciudad;
	
	//No hace falta comentar normalmente los getter y setters
	public String getTipoVia() {
		return tipoVia;
	}
	public void setTipoVia(String tipoVia) {
		this.tipoVia = tipoVia;
	}
	public String getNombreVia() {
		return nombreVia;
	}
	public void setNombreVia(String nombreVia) {
		this.nombreVia = nombreVia;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	
}
