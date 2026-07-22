package com.krakedev;

public class VehiculoTest {

	public static void main(String[] args) {

		Vehiculo v;
		
		v = new Vehiculo ();

		System.out.println("======= Vehículo 1 Creado ========");
		
		System.out.println("Año: " + v.anio);
		System.out.println("Marca: " + v.marca);
		System.out.println("Modelo: " + v.modelo);
		
		System.out.println("======= Vehículo 1 Valores Asignados ========");
		
		v.anio = "2012";
		v.marca = "Chevrolet";
		v.modelo = "nuevo";
		
		System.out.println("Año: " + v.anio);
		System.out.println("Marca: " + v.marca);
		System.out.println("Modelo: " + v.modelo);
		
		System.out.println("======= Vehículo 2 Creado ========");

		Vehiculo v2 = new Vehiculo();
		
		System.out.println("Año: " + v2.anio);
		System.out.println("Marca: " + v2.marca);
		System.out.println("Modelo: " + v2.modelo);
		
		System.out.println("======= Vehículo 2 Valores Asignados ========");
		
		v2.anio = "2020";
		v2.marca = "Toyota";
		v2.modelo = "Runner";
		
		System.out.println("Año: " + v2.anio);
		System.out.println("Marca: " + v2.marca);
		System.out.println("Modelo: " + v2.modelo);
				
		
	}

}
