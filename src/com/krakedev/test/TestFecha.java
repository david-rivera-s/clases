package com.krakedev.test;

import com.krakedev.Fecha;

public class TestFecha {

	public static void main(String[] args) {
		
		// Instanciamos usando el constructor con parámetros (dia, mes, anio)
		Fecha f1 = new Fecha(1, 4, 2026);
		
		System.out.println("Año: "+f1.getAnio());
		System.out.println("Mes: "+f1.getMes());
		System.out.println("Día: "+f1.getDia());

	}

}