package com.krakedev;

public class Mensajeria {
	
	// Atributos privados
	private String nombre;
	private String apodo;
	
	// Método que imprime usando los atributos de la clase
	public void saludar() {
		System.out.println("Hola " + nombre + " Tu apodo es: " + apodo);
	}

	// --- GETTERS Y SETTERS ---
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApodo() {
		return apodo;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}

}