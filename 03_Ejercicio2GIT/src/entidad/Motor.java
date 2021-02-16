package entidad;

public class Motor {
	private int id;
	private String tipoMotor;
	private int potencia;
		
	public Motor() {
		super();
	}
	public Motor(int id, String tipoMotor, int potencia) {
		super();
		this.id = id;
		this.tipoMotor = tipoMotor;
		this.potencia = potencia;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTipoMotor() {
		return tipoMotor;
	}
	public void setTipoMotor(String tipoMotor) {
		this.tipoMotor = tipoMotor;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	
}
