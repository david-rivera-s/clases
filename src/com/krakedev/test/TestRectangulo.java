package com.krakedev.test;

import com.krakedev.Rectangulo;

public class TestRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangulo r1 = new Rectangulo(0,0);
		
		// Asignamos valores usando los setters
		r1.setAltura(5);
		r1.setBase(4);
		
		int resultadoArea;
		resultadoArea = r1.calcularArea();
		System.out.println("Resultado: " + resultadoArea);
		
		Rectangulo r2 = new Rectangulo(5,5);
		int resultadoArea2;
		
		// Asignamos valores usando los setters para el segundo rectángulo
		r2.setAltura(8);
		r2.setBase(2);
		
		resultadoArea2 = r2.calcularArea();
		System.out.println("Resultado rectángulo 2: " + resultadoArea2);
		
	}

}