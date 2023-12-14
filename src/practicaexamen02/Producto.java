/*
Clase Producto
Atributos de clase: nextSerialNumber: Atributo que indica el siguiente numero 
                                      de la serie de un producto
Atributos de objeto: Nombre - s, numeroSerie - i, Descripcion -s, Precio - d;

Constructores: - Completo (Sin número de serie)
               - Solo el nombre y precio.

Metodos: Getter y Setter de todos los atributos de objetos. -// menos el setter del numero de serie. 
         Getter del atributo de clase.
         "Double Descuento (int Porcentaje)" - Este metodo devuelve el precio final
         del producto despues de aplicarle el descuento que se pasa como parametro.

Comentarios: nextSerialNumber - se inicializa a 0. 
             Cada vez que se crea un objeto se asigna este valor a "numeroSerie"
             y se incrementa en 1. 
*/
package practicaexamen02;

public class Producto {
    //Atributos de objeto
    private String nombre;
    private String descripcion;
    private int numeroSerie;
    private double precio;
    // atributos de clase 
    private static int nextSerialNumber = 0;
    //
    //Constructor completo
    public Producto(String nombre, String descripcion, double precio){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.numeroSerie = Producto.nextSerialNumber;
        nextSerialNumber++;

    }
    //Constructor solo nombre y precio 
    public Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
        this.numeroSerie = Producto.nextSerialNumber;
        nextSerialNumber++;
    }
    //
    public String getNombre(){
        return this.nombre;
    }
    public int getNumeroSerie(){
        return this.numeroSerie;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
    public double getPrecio(){
        return this.precio;
    }
    public int getNextSerialNumber(){
        return (this.numeroSerie+1);
    }
    //
    //
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
    public double descuento(int porcentaje){
        return this.precio - (this.precio * (double)porcentaje/100);
    }
}
