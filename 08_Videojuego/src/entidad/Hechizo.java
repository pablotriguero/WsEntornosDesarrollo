package entidad;

import util.NumerosAleatorios;

public class Hechizo extends Arma{
	@Override
	public int usar() {
		System.out.println("alacazam!");
		int daño = NumerosAleatorios.calcular(getDañoMinimo(), getDañoMaximo());
		int aleatorioCritico = NumerosAleatorios.calcular(1, 100);
		if(aleatorioCritico < getPorcentajeCritico()) {
			System.out.println(getPersonaje().getNombre() + " ha hecho un critico!!");
			daño *= 2.5;
		}
		return daño;
	}

}
