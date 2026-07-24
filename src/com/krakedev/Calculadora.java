package com.krakedev;

public class Calculadora {
    
    // Atributo privado para guardar un estado (el resultado)
    private double resultado;

    // Constructor con parámetros (el constructor por defecto ya no existe)
    public Calculadora(double resultado) {
        this.resultado = resultado;
    }

    // Métodos para operar (guarda el valor en el atributo)
    public double sumar(int a, int b) {
        resultado = a + b;
        return resultado;
    }
    
    public double restar(int a, int b) {
        resultado = a - b;
        return resultado;
    }

    // --- GETTER Y SETTER ---
    
    // Getter para leer el valor del atributo resultado
    public double getResultado() {
        return resultado;
    }

    // Setter para modificar o asignar el resultado manualmente desde afuera
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}