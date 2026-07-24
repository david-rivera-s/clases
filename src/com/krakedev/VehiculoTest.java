package com.krakedev;

public class VehiculoTest {

	public static void main(String[] args) {

		Vehiculo v;
		
		v = new Vehiculo();

		System.out.println("======= Vehículo 1 Creado ========");
		
		System.out.println("Año: " + v.getAnio());
		System.out.println("Marca: " + v.getMarca());
		System.out.println("Modelo: " + v.getModelo());
		
		System.out.println("======= Vehículo 1 Valores Asignados ========");
		
		v.setAnio("2012");
		v.setMarca("Chevrolet");
		v.setModelo("nuevo");
		
		System.out.println("Año: " + v.getAnio());
		System.out.println("Marca: " + v.getMarca());
		System.out.println("Modelo: " + v.getModelo());
		
		System.out.println("======= Vehículo 2 Creado ========");

		Vehiculo v2 = new Vehiculo();
		
		System.out.println("Año: " + v2.getAnio());
		System.out.println("Marca: " + v2.getMarca());
		System.out.println("Modelo: " + v2.getModelo());
		
		System.out.println("======= Vehículo 2 Valores Asignados ========");
		
		v2.setAnio("2020");
		v2.setMarca("Toyota");
		v2.setModelo("Runner");
		
		System.out.println("Año: " + v2.getAnio());
		System.out.println("Marca: " + v2.getMarca());
		System.out.println("Modelo: " + v2.getModelo());
		
		System.out.println("======= Vehículo 3 Creado con PARAMETRO ========");

		Vehiculo v3 = new Vehiculo("Renault");
		
		System.out.println("Año: " + v3.getAnio());
		System.out.println("Marca: " + v3.getMarca());
		System.out.println("Modelo: " + v3.getModelo());
		
		System.out.println("======= Vehículo 4 Creado con PARAMETRO ========");

		Vehiculo v4 = new Vehiculo("VW", "Amarok", "2026");
		
		System.out.println("Año: " + v4.getAnio());
		System.out.println("Marca: " + v4.getMarca());
		System.out.println("Modelo: " + v4.getModelo());
		
				
	}

}