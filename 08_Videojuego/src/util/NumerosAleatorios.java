package util;

import java.util.concurrent.ThreadLocalRandom;

public class NumerosAleatorios {
	
	public static int calcular(int n1, int n2) {
		int randomNum = ThreadLocalRandom.current().nextInt(n1, n2 + 1);
		return randomNum;
	}
}
