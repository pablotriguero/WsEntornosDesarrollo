package entidad;

import util.NumerosAleatorios;

public class Arco extends Arma{
	
	/**
	 * 
	 * El m�todo usar sirve para mostrar caracter�sticas del arma "Arco" que extiende de la clase Arma.
	 * El m�todo imprime "Fiuuu", que nos indica el sonido que produce el arma al dispararse
	 * 1� variable: danio de tipo entero, en la que calcula un n�mero aleatorio, con el m�todo calcular, el cual es est�tico y previamente escrito en otra clase, NumerosAleatorios,
	 * y tiene dos par�metros, descritos en su clase padre, Arma.
	 * 2� variable: aleatorioCritico de tipo entero, que calcula otro n�mero aleatorio, por medio, del m�todo calcular, descrito anteriormente, entre los n�meros 1 y 100.
	 * 
	 * Hay dos opciones:
	 * Opci�n 1:
	 * Si, el aleatorioCritico es menor que el porcentajeCritico del arma de la clase Arma, entonces que obtenga y muestre el nombre del 
	 * personaje de la clase Arma, adem�s de un mensaje (Ha hecho un critico). Si es esta opci�n, al n�mero obtenido en danio se le multiplica 1.5.
	 * 
	 * Opci�n 2:
	 * Si el aleatorioCritico NO es menor, es decir, que es mayor que getPorcentajeCritico, 
	 * devuelve danio, sin aplicar cambios en �l.
	 * 
	 * @return danio, devuelve el da�o final del arma.
	 */
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
