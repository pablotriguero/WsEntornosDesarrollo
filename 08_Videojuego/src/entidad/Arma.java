package entidad;

public abstract class Arma {
	private String tipo;
	private int dañoMaximo;
	private int dañoMinimo;
	private Personaje personaje;
	
	/**
	 * Numero entre el 0 y el 100
	 */
	private int porcentajeCritico;
	
	/**
	 * El metodo usar debera de calcular el daño del arma basandose
	 * en sus atributos
	 * @return el daño del arma
	 */
	public abstract int usar();
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getDañoMaximo() {
		return dañoMaximo;
	}
	public void setDañoMaximo(int dañoMaximo) {
		this.dañoMaximo = dañoMaximo;
	}
	public int getDañoMinimo() {
		return dañoMinimo;
	}
	public void setDañoMinimo(int dañoMinimo) {
		this.dañoMinimo = dañoMinimo;
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
