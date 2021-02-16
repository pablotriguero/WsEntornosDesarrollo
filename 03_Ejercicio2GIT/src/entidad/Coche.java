package entidad;

//Estructura JavaBean o POJO, atributos privados y getters y setters publicos
//Tambien tiene que tener el constructor por defecto o constructor vacio
public class Coche {
	private int id;
	private String matricula;
	private String marca;
	private String modelo;
	private int km;
	private Motor motor;
		
	public Coche() {
		super();
	}
	

	public Coche(int id, String matricula, String marca, String modelo
			,Motor motor, int km) {
		super();
		this.id = id;
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.km = km;
		this.motor = motor;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}
	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	
	
	
}
