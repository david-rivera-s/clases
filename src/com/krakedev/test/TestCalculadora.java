package com.krakedev.test;

import com.krakedev.Calculadora;

public class TestCalculadora {

    public static void main(String[] args) {

        Calculadora c1 = new Calculadora(0.0);
        
        // Usamos el método sumar normal
        double r1 = c1.sumar(4, 2);
        System.out.println("Resultado Suma: " + r1);
        
        // Consultamos ese mismo resultado usando el getter del atributo
        System.out.println("Consultando mediante el getter: " + c1.getResultado());
        
        // Asignamos un valor a la fuerza usando el setter
        c1.setResultado(77);
        System.out.println("Nuevo valor modificado con setter: " + c1.getResultado());
        
        // Usamos el método restar normal
        double r2 = c1.restar(-4, -2);
        System.out.println("Resultado Resta: " + r2);
        
        // Consultamos ese mismo resultado usando el getter del atributo
        System.out.println("Consultando mediante el getter: " + c1.getResultado());
        
        // Asignamos un valor a la fuerza usando el setter
        c1.setResultado(-100);
        System.out.println("Nuevo valor modificado con setter: " + c1.getResultado());
    }

}