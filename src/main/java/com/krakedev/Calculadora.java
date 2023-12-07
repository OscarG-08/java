/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.krakedev;

import java.text.DecimalFormat;

/**
 *
 * @author Oscar
 */
public class Calculadora {
    public double multiplicar(double valor1, double valor2){
        return valor1*valor2;
    }
    public double dividir(double dividendo, double divisor){
        if (divisor == 0) {
            return 0;
        }
        DecimalFormat df = new DecimalFormat("#.##");
        String resultado = df.format(dividendo/divisor);
        return Double.valueOf(resultado);
    }
    
}
