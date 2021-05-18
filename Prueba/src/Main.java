
public class Main {
	
	public static String s1 = "";
	
	public String nombre;
	
	public static void main(String[] args) {
		
		{
			Videojuego v = new Videojuego();
			v.setNombre("LOL");
		}
		
		System.out.println("hola");
		//System.err.println(v.);
		
		Main.s1 = "felix";
		
		Main main = new Main();
		main.saludar();
		
		Main.saludar2();
		
		int i = 5;
		int j = 5;
		
		if(i == j) {
			System.out.println("Son iguales los numeros");
		}
		
		Videojuego v1 = new Videojuego();
		v1.setNombre("LOL");
		Videojuego v2 = new Videojuego();
		v2.setNombre("LOL");
		
		if (v1 == v2) {
			System.out.println("SOn iguales los objetos?");
		}
		
		v1 = v2;
		
		if (v1 == v2) {
			System.out.println("SOn iguales los objetos? Ahora si");
		}
		
		String c1 = "Felix";
		String c2 = "Felix";
		
		if(c1 == c2) {
			System.out.println("Son iguales c1 y c2");
		}
		
		String c3 = new String("Felix");
		String c4 = new String("Felix");
		
		if(c3 == c4) {
			System.out.println("Son iguales c3 y c4");
		}
		
		
		String c5 = "Pepe";
		
		c5 = c5 + " otro valor";
		System.out.println(c5);
		
		saludar2();
		
	}
	
	public void saludar() {
		System.out.println("Hola nens");
	}
	
	public static void saludar2() {
		System.out.println("Hola chicos!!");
	}
}
