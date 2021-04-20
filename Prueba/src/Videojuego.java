
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
	

	
}
