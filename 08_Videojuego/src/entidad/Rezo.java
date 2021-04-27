package entidad;

import util.NumerosAleatorios;

public class Rezo extends Arma{
	@Override
	public int usar() {
		System.out.println("padre nuestro!");
		int daño = NumerosAleatorios.calcular(getDañoMinimo(), getDañoMaximo());
		int aleatorioCritico = NumerosAleatorios.calcular(1, 100);
		if(aleatorioCritico < getPorcentajeCritico()) {
			System.out.println(getPersonaje().getNombre() + " ha hecho un critico!!");
			daño *= 1.5;
		}
		return daño;
	}

}
