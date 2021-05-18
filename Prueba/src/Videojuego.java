
public class Videojuego {
	private int id;
	private String nombre;
	
	public int numeroVideojuegos;
	
	public static String compañia;
	
	public Videojuego() {
		Main.s1 = "pepe";
		Main.saludar2();
		
		Main main = new Main();
		main.saludar();
		main.nombre = "Pepe";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void metodoDinamico1() {
		
	}
	
	public void metodoDinamico2() {
		metodoDinamico1();
		metodoEstatico();
	}
	
	public static void metodoEstatico() {
		
		
	}
	
	public static void metodoEstatico2() {
		metodoEstatico();
		Videojuego v = new Videojuego();
		v.metodoDinamico1();
	}
	
	public static void metodoEstatico3(Videojuego v1) {
		v1.metodoDinamico1();
	}
}
