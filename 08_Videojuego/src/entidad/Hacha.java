package entidad;

import util.NumerosAleatorios;

public class Hacha extends Arma{
	@Override
	public int usar() {
		System.out.println("Plank");
		int daño = NumerosAleatorios.calcular(getDañoMinimo(), getDañoMaximo());
		int aleatorioCritico = NumerosAleatorios.calcular(1, 100);
		if(aleatorioCritico < getPorcentajeCritico()) {
			System.out.println(getPersonaje().getNombre() + " ha hecho un critico!!");
			
			daño *= 3;
		}
		return daño;
	}

}
