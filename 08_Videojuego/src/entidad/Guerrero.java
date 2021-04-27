package entidad;

public class Guerrero extends Personaje{
	
	private int fuerza;
	
	public Guerrero(int fuerza) {
		this.fuerza = fuerza;
	}

	public int atacar(Personaje p) {
		System.out.println("Argggggggg");
		int dañoArma = getArma().usar();
		int dañoTotal = dañoArma;
		if(getArma() instanceof Espada || getArma() instanceof Hacha) {
			System.out.println("Soy diestro con las espadas y hachas!!");
			dañoTotal += fuerza;
		}
		
		p.setVida(p.getVida() - dañoTotal);
		return dañoTotal;
		
	}

}
