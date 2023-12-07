/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.krakedev;

/**
 *
 * @author Oscar
 */
public class TestAuto {

    public static void main(String[] args) {
        Auto auto1 = new Auto("Toyota", 2013, 15000.75f);
        Auto auto2 = new Auto("Chevrolet", 2016, 20000.50f);
        System.out.println("\t\t\tDATOS DE LOS AUTOS");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("\t\t"+auto1.getMarca()+"\n\t\t"+auto1.getAnio()+"\n\t\t"+auto1.getPrecio());
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("\t\t"+auto2.getMarca()+"\n\t\t"+auto2.getAnio()+"\n\t\t"+auto2.getPrecio());
    }
}
