package entidad;

public class Mago extends Personaje{
	
	private int inteligencia;
	
	public Mago(int inteligencia) {
		this.inteligencia = inteligencia;
	}


	public int atacar(Personaje p) {
		System.out.println("Kamehameha");
		int dañoArma = getArma().usar();
		int dañoTotal = dañoArma;
		if(getArma() instanceof Hechizo) {
			System.out.println("Soy diestro con los hechizos!!");
			dañoTotal += (inteligencia * 2);
		}
		
		p.setVida(p.getVida() - dañoTotal);
		return dañoTotal;
		
	}

}
