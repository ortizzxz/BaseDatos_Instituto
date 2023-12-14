/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p_e_03;

/**
 *
 * @author Jesus
 */
public class pruebaCoche {
    public static void main(String[] args) {
        Coche Urus;
        Urus = new Coche("Lamborghini", "Urus", 2024);
        
        System.out.println(Urus.getMarca() + " " + Urus.getModelo() + " " + Urus.getYear());
        
        Urus.recorre(20000);
        System.out.println(Urus.getKm());
        Urus.resetKm();
        System.out.println(Urus.getKm() + " " + Urus.getKmTotal());
        Urus.recorre(15000);
        Urus.resetKm();
        Urus.recorre(10000);
        Urus.recorre(25000);
        Urus.recorre(30000);
        
        
        System.out.println(Urus.getnRevison());
    }
}
