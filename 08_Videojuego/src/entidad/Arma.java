package entidad;

public abstract class Arma {
	private String tipo;
	private int da�oMaximo;
	private int da�oMinimo;
	private Personaje personaje;
	
	/**
	 * Numero entre el 0 y el 100
	 */
	private int porcentajeCritico;
	
	/**
	 * El metodo usar debera de calcular el da�o del arma basandose
	 * en sus atributos
	 * @return el da�o del arma
	 */
	public abstract int usar();
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getDa�oMaximo() {
		return da�oMaximo;
	}
	public void setDa�oMaximo(int da�oMaximo) {
		this.da�oMaximo = da�oMaximo;
	}
	public int getDa�oMinimo() {
		return da�oMinimo;
	}
	public void setDa�oMinimo(int da�oMinimo) {
		this.da�oMinimo = da�oMinimo;
	}
	public int getPorcentajeCritico() {
		return porcentajeCritico;
	}
	public void setPorcentajeCritico(int porcentajeCritico) {
		this.porcentajeCritico = porcentajeCritico;
	}

	public Personaje getPersonaje() {
		return personaje;
	}

	public void setPersonaje(Personaje personaje) {
		this.personaje = personaje;
	}
	
	
}
