package entidad;

public class Clerigo extends Personaje{
	
	private int sabiduria;
	
	public Clerigo(int sabiduria) {
		this.sabiduria = sabiduria;
	}


	public int atacar(Personaje p) {
		System.out.println("Por la ira de mi dios!");
		int dañoArma = getArma().usar();
		int dañoTotal = dañoArma;
		if(getArma() instanceof Rezo) {
			int vidaCurada = (int)(dañoArma * 0.5);
			System.out.println("Me curo!!");
			this.setVida(getVida() + vidaCurada); 
		}
		
		p.setVida(p.getVida() - dañoTotal);
		return dañoArma;
		
	}

}
