/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.krakedev;

/**
 *
 * @author Oscar
 */
public class TestCuadrado {
    public static void main(String[] args) {
        Cuadrado cuadrado1 = new Cuadrado(4);
        Cuadrado cuadrado2 = new Cuadrado(5);
        Cuadrado cuadrado3 = new Cuadrado(6);
        System.out.println("El  area es: " + cuadrado1.calcularArea() + cuadrado1.calcularPerimetro());
        System.out.println("El  area es: " + cuadrado2.calcularArea() + cuadrado2.calcularPerimetro());
        System.out.println("El  area es: " + cuadrado3.calcularArea() + cuadrado3.calcularPerimetro());
    }
}
