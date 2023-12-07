/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.krakedev;

/**
 *
 * @author Oscar
 */
public class TestCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println("MULTIPLICACION: " + calculadora.multiplicar(10, 5));
        System.out.println("DIVISION: " + calculadora.dividir(10, 2));
        System.out.println("PROMEDIO: " + calculadora.promediar(10, 8, 9.5));
        calculadora.mostrarResultado();
    }
}
