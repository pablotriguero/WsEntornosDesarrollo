package entidad;

public class Guerrero extends Personaje{
	
	private int fuerza;
	
	public Guerrero(int fuerza) {
		this.fuerza = fuerza;
	}

	public int atacar(Personaje p) {
		System.out.println("Argggggggg");
		int da�oArma = getArma().usar();
		int da�oTotal = da�oArma;
		if(getArma() instanceof Espada || getArma() instanceof Hacha) {
			System.out.println("Soy diestro con las espadas y hachas!!");
			da�oTotal += fuerza;
		}
		
		p.setVida(p.getVida() - da�oTotal);
		return da�oTotal;
		
	}

}
