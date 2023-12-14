package practicaexamen02;

import java.util.Scanner;

/**
 *
 * @author Jesus
 */
public class PruebaProducto {
    public static void main(String[] args) {
        Producto [] array = new Producto[1];
        String nombre;
        double precio;
        int descuento, index;
        String opcion="";
        Scanner sc = new Scanner(System.in);
        //
        System.out.println("Programa que crea productos: ");
        //
        for(int i = 0; i<array.length;i++){
            System.out.println("Producto " + (i+1));
            System.out.println("-------");
            System.out.print("Nombre: ");
            nombre = sc.next();
            System.out.print("Introduce precio: ");
            precio = sc.nextDouble();
            array[i] = new Producto(nombre,precio);
        }
        
        while(opcion != "0"){
            imprimeMenu();
            opcion = sc.next();
            switch(opcion){
                case "0":
                    break;
                case "1":
                    mostrarArray(array);
                    break;
                case "2":
                    
                    System.out.println("Indica el número de artículo: ");
                    index = sc.nextInt();
                    System.out.println("Indica el tipo de descuento: ");
                    aplicaDescuento(array[index], sc.nextInt());
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }
        
    }
    
    public static void imprimeMenu(){
        System.out.println("*******************");
        System.out.println("*    1.Listado    *");
        System.out.println("*   2.Descuento   *");
        System.out.println("*     0.Salir     *");
        System.out.println("*******************");
        System.out.println("\nElige una opción");
}
    
    public static void mostrarArray(Producto[] array){
        for(Producto p : array){
            System.out.println("Número de Serie: " + p.getNumeroSerie());
            System.out.println("Nombre: " + p.getNombre());
            System.out.println("Precio: " + p.getPrecio());
        }
    }
    
    public static void aplicaDescuento(Producto p, int descuento){
        System.out.println("El producto " + p.getNombre()+
                " tiene de precio original " + p.getPrecio() + "€");
        System.out.println("Al aplicarle un descuento del " + descuento + "%"+
                " se queda en " + p.descuento(descuento));
    }
    
}
