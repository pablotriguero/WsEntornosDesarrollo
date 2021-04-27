package entidad;

import util.NumerosAleatorios;

public class Arco extends Arma{
	@Override
	public int usar() {
		System.out.println("Fiuuu");
		int da�o = NumerosAleatorios.calcular(getDa�oMinimo(), getDa�oMaximo());
		int aleatorioCritico = NumerosAleatorios.calcular(1, 100);
		if(aleatorioCritico < getPorcentajeCritico()) {
			System.out.println(getPersonaje().getNombre() + " ha hecho un critico!!");
			da�o *= 1.5;
		}
		return da�o;
	}

}
