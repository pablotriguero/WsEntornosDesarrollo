
public class Jugador {
	private int dorsal;
	private int numeroTarjetasAmarillas;
	private int numeroTarjetasRojas;
	//Suponer que estan los getter y setters creados
	
	public void ponerDorsal(int dorsal) {
		if(dorsal >= 1 && dorsal <= 30) {
			this.dorsal = dorsal;
		}else {
			this.dorsal = -1;
		}
	}
	
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
}
