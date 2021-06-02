package programa;

public class Jugador {
	private int dorsal;
	private int numeroTarjetasAmarillas;
	private int numeroTarjetasRojas;

	/**
	 * Metodo que establece el atributo dorsal del jugador en base
	 * al parametro de entrada. Pondra de dorsal el valor del parametro
	 * de entrada cuando el valor este entre 1 y 30, en caso contrario
	 * lo establecer a -1
	 * @param dorsal
	 */
	public void ponerDorsal(int dorsal) {
		if(dorsal >= 1 && dorsal <= 30) {
			this.dorsal = dorsal;
		}else {
			this.dorsal = -1;
		}
	}
	

	/**
	 * Metodo que devuelve un booleano sobre si el jugador esta 
	 * expulsado. 
	 * @return devolvemos true cuando el numero de 
	 * tarjetas amarillas sea 2 o cuando el numero de tarjetas
	 * rojas sea 1, false en caso contrario
	 */
	public boolean estaExpulsado() {
		boolean expulsado = false;				
		if(numeroTarjetasAmarillas == 2) {
			expulsado = true;
		}		
		if(numeroTarjetasRojas == 1) {
			expulsado = true;
		}		
		return expulsado;
	}	
	
	//Suponer que estan los getter y setters creados
	
	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public int getNumeroTarjetasAmarillas() {
		return numeroTarjetasAmarillas;
	}

	public void setNumeroTarjetasAmarillas(int numeroTarjetasAmarillas) {
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
	}

	public int getNumeroTarjetasRojas() {
		return numeroTarjetasRojas;
	}

	public void setNumeroTarjetasRojas(int numeroTarjetasRojas) {
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	}
}
