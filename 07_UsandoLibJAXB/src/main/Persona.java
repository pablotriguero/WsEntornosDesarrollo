package main;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Persona {
	private int id;
	private String nombre;
	private int edad;
	private double peso;
	
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	/*
	 * Para sobreescribir un metodo en java, tenemos que crear un metodo en la
	 * clase hija que tenga la misma FIRMA que el metodo padre.
	 * 
	 * La FIRMA de un metodo consta de los siguientes 3 casos
	 * 1- El nombre del metodo
	 * 2- El numero de parametros de entrada de un metodo
	 * 3- El tipo de los parametros de entrada del metodo
	 * 
	 * La anotacion @Override es una anotacion de CONTROL, es decir,
	 * NO SIRVE PARA SOBREESCRIR, sirve unica y exclusivamente para asegurarnos
	 * en tiempo de compilación de que realmente estamos sobrescribiendo
	 * un metodo del padre, y no nos hemos equivocado con la firma del metodo
	 */
	
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + "]";
	}
	

}
