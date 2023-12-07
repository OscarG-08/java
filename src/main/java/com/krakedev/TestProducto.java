/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.krakedev;

/**
 *
 * @author Oscar
 */
public class TestProducto {
    public static void main(String[] args) {
        Producto productoA = new Producto("Paracetamol", "Medicamento de venta libre para aliviar el dolor", 3.50f, 100);
        Producto productoB = new Producto("Ibuprofeno", "Medicamento antiinflamatorio para aliviar el dolor", 5.00f, 50);
        Producto productoC = new Producto("Amoxicilina","Antibiotico para una serie de infecciones bacterianas" , 10.00f, 30);
        System.out.println("\t\t\tDATOS DE LOS AUTOS");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("\t"+productoA.getNombre()+"\n\t"+productoA.getDescripcion()+"\n\t"+productoA.getPrecio()+"\n\t"+productoA.getStockActual());
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("\t"+productoB.getNombre()+"\n\t"+productoB.getDescripcion()+"\n\t"+productoB.getPrecio()+"\n\t"+productoB.getStockActual());
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("\t"+productoC.getNombre()+"\n\t"+productoC.getDescripcion()+"\n\t"+productoC.getPrecio()+"\n\t"+productoC.getStockActual());
    }
}
