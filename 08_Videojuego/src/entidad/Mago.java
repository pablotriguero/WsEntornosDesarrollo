package entidad;

public class Mago extends Personaje{
	
	private int inteligencia;
	
	public Mago(int inteligencia) {
		this.inteligencia = inteligencia;
	}


	public int atacar(Personaje p) {
		System.out.println("Kamehameha");
		int da�oArma = getArma().usar();
		int da�oTotal = da�oArma;
		if(getArma() instanceof Hechizo) {
			System.out.println("Soy diestro con los hechizos!!");
			da�oTotal += (inteligencia * 2);
		}
		
		p.setVida(p.getVida() - da�oTotal);
		return da�oTotal;
		
	}

}
