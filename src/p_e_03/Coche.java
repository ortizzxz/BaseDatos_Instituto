/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p_e_03;

/**
 * Constante de clase: REVISION_KM = 30000;
 * Clase que determina las caracteristicas de un coche 
 * Marca - s
 * Modelo - s
 * Year - i
 * km - d
 * kmTotal - d
 * Constructores: Constructor con parametros: Marca, modelo, year (Resto: 0:)
 * Metodos: Getter de todos los parametros 
 *        recorre(Kilometros) No devuelve nada, añade los Kms
 *        que se pasa como parametro a atributos km y kmTotales
 *        resetKm() Funcion que no devuelve nada y establece el valor de Km a 0
 * Cada vez que se usa el metodo recorre se comprueba si se han superado los kms de 
 * revision si es asi se imprime el siguiente mensaje: "Su coche necesita una revisión"
 *
 * Extra: controla el número de revisiones por cada 30000 kms. 
 * @author Jesus
 */
public class Coche {
    public static final int REVISION_KM = 30000;
    private String marca;
    private String modelo;
    private int year;
    private double km;
    private double kmTotal;
    private int nRevision = 0;
    
    Coche(String marca, String modelo, int year){
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;        
        this.km = 0;
        this.kmTotal = 0;
    }

    public int getREVISION_KM() {
        return REVISION_KM;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getYear() {
        return year;
    }

    public double getKm() {
        return km;
    }

    public double getKmTotal() {
        return kmTotal;
    }

    public int getnRevison() {
        return nRevision;
    }
    
    public void recorre(double kilometros){
        this.km += kilometros;
        this.kmTotal += kilometros;
        
        nRevision = (int) (kmTotal / REVISION_KM);
        if(nRevision > 0){
            System.out.println("Su coche necesita una revisión. Nº " + nRevision);
            resetKm();
        }
    }
    
    public void resetKm(){
        this.km = 0;
    }
    
}
