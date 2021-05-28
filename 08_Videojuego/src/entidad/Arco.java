package entidad;

import util.NumerosAleatorios;

public class Arco extends Arma{
	
	/**
	 * 
	 * El método usar sirve para mostrar características del arma "Arco" que extiende de la clase Arma.
	 * El método imprime "Fiuuu", que nos indica el sonido que produce el arma al dispararse
	 * 1º variable: danio de tipo entero, en la que calcula un número aleatorio, con el método calcular, el cual es estático y previamente escrito en otra clase, NumerosAleatorios,
	 * y tiene dos parámetros, descritos en su clase padre, Arma.
	 * 2º variable: aleatorioCritico de tipo entero, que calcula otro número aleatorio, por medio, del método calcular, descrito anteriormente, entre los números 1 y 100.
	 * 
	 * Hay dos opciones:
	 * Opción 1:
	 * Si, el aleatorioCritico es menor que el porcentajeCritico del arma de la clase Arma, entonces que obtenga y muestre el nombre del 
	 * personaje de la clase Arma, además de un mensaje (Ha hecho un critico). Si es esta opción, al número obtenido en danio se le multiplica 1.5.
	 * 
	 * Opción 2:
	 * Si el aleatorioCritico NO es menor, es decir, que es mayor que getPorcentajeCritico, 
	 * devuelve danio, sin aplicar cambios en él.
	 * 
	 * @return danio, devuelve el daño final del arma.
	 */
	@Override
	public int usar() {
		System.out.println("Fiuuu");
		int daño = NumerosAleatorios.calcular(getDañoMinimo(), getDañoMaximo());
		int aleatorioCritico = NumerosAleatorios.calcular(1, 100);
		if(aleatorioCritico < getPorcentajeCritico()) {
			System.out.println(getPersonaje().getNombre() + " ha hecho un critico!!");
			daño *= 1.5;
		}
		return daño;
	}

}
