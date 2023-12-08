/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.krakedev;

/**
 *
 * @author Oscar
 */
public class Cuadrado {
    private double lado;
    private double area;
    private double perimetro;

    public Cuadrado(double lado) {
        this.lado = lado;
    }
    
    public double calcularArea(){
        this.area = Math.pow(this.lado, 2);
        return area;
    }
    public double calcularPerimetro(){
        this.perimetro = this.lado * 4;
        return perimetro;
    }
}
