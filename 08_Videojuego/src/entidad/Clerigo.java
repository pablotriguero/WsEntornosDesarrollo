package entidad;

public class Clerigo extends Personaje{
	
	private int sabiduria;
	
	public Clerigo(int sabiduria) {
		this.sabiduria = sabiduria;
	}


	public int atacar(Personaje p) {
		System.out.println("Por la ira de mi dios!");
		int da�oArma = getArma().usar();
		int da�oTotal = da�oArma;
		if(getArma() instanceof Rezo) {
			int vidaCurada = (int)(da�oArma * 0.5);
			System.out.println("Me curo!!");
			this.setVida(getVida() + vidaCurada); 
		}
		
		p.setVida(p.getVida() - da�oTotal);
		return da�oArma;
		
	}

}
