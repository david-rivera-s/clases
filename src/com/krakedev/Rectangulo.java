package com.krakedev;

public class Rectangulo {
	
	// Atributos privados
	private int base;
	private int altura;
	
	// Método para calcular el área
	public int calcularArea() {
		int area = base * altura;
		return area;
	}

	// Getters y Setters
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

}