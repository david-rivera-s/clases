package com.krakedev.test;

import com.krakedev.Mensajeria;

public class TestMensajeria {

	public static void main(String[] args) {
		
		Mensajeria m1 = new Mensajeria();
		
		// Asignamos los valores usando los setters
		m1.setNombre("Messi");
		m1.setApodo("La Pulga");
		
		// Llamamos al saludo
		m1.saludar();
		
		// Modificamos los valores usando los setters
		m1.setNombre("Cristiano");
		m1.setApodo("El Bicho");
		
		// Consultamos individualmente con los getters
		System.out.println("Nombre consultado con getter: " + m1.getNombre());
		System.out.println("Apodo consultado con getter: " + m1.getApodo());
		
		// Llamamos al saludo
		m1.saludar();

	}

}