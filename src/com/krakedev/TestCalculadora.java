package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {

		Calculadora c1 = new Calculadora();
		
		double r1;
		
		r1 = c1.sumar(4, 2);
		
		System.out.println("Resultado Suma: " + r1);
		
		int r2 = c1.restar(-4, -2);
		
		System.out.println("Resultado Resta: " + r2);

		
	}

}
