/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salonDeClases;
import java.util.Scanner;

/**
 *
 * @author Jesus
 */
public class InstitutoCarmenTijeras {
    public static void main(String[] args) {
        int n = 0;
        int opcion = 1;
        Scanner sc = new Scanner(System.in);
        String nombreAsignatura, nombreProfesor;
        double porcentajeAprobados, porcentajeSuspensos;
        int cantidadAlumnos, horasSemanales;
        
        //Toma de datos
        System.out.println("*          Base de Datos. 2023               *");
        System.out.println("*               Softonic.                    *");
        System.out.println("Indiquenos cúantos módulos tiene su instituto: ");
        n = sc.nextInt();
        Curso [] curso = new Curso[n];
        //
        //Insertar los datos de los cursos en nuestro array "curso" 
        for(int i = 0; i<curso.length;i++){
            System.out.println(" -- Toma de datos del módulo " + (i+1) + "--");
            System.out.println("Indíquenos el nombre de su módulo: ");
            nombreAsignatura = sc.next();
            
            System.out.println("¿Quien es el profesor/a de este módulo?");
            nombreProfesor = sc.next();
            
            System.out.println("¿Cúantos alumnos pertenecen a este módulo?");
            cantidadAlumnos = sc.nextInt();
            
            System.out.println("¿Cúal es la carga de horas semanales de este módulo?");
            horasSemanales = sc.nextInt();
            
            System.out.println("¿Cúal es el porcentaje de aprobados de este módulo");
            porcentajeAprobados = sc.nextDouble();
            
            System.out.println("¿Cúal es el porcentaje de suspensos de este módulo?");
            porcentajeSuspensos = sc.nextDouble();
            
            curso[i] = new Curso(nombreAsignatura, nombreProfesor, cantidadAlumnos, horasSemanales, porcentajeAprobados, porcentajeSuspensos);
        }
       
        while(opcion != 0){
            imprimeMenu();
            opcion = sc.nextInt();
            switch(opcion){
                case 0:
                    break;
                case 1:
                    mostrarArray(curso);
                    break;
                case 2:
                    nombreProfesores(curso);
                    break;
            }
        }
        System.out.println("Gracias por usar nuestra base de datos.");
        
    }
    
    public static void imprimeMenu(){
        System.out.println("***************************************************************");
        System.out.println("*                   1.Listado Completo                        *");
        System.out.println("*          2.Listado de los Nombres de los Profesores         *");
        System.out.println("*              3.Listado de la cantidad de Alumnos            *");
        System.out.println("*      4.Listado de la Cantidad de Alumnos de los módulos     *");
        System.out.println("*    5.Listado de la Carga Horaria Semanal de los módulos     *");
        System.out.println("*     6.Listado de Porcentaje de Aprobados de los módulos     *");
        System.out.println("*     7.Listado de Porcentaje de Suspendos de los módulos     *");
        System.out.println("*            8.Listado de los ID's de los módulos             *");
        System.out.println("*                       0.Salir                               *");
        System.out.println("***************************************************************");
        System.out.println("*                   Elige una opción:                         *");
    }
    
        public static void mostrarArray(Curso[] array){
        for(int i = 0 ; i < array.length; i++){
            System.out.println("Módulo " + (i+1) + ": " + array[i].getNombreAsignatura());
            System.out.println("Profesor designado del módulo " + array[i].getNombreAsignatura() + ": " + array[i].getNombreProfesor());
            System.out.println("El módulo " + array[i].getNombreAsignatura() + " tiene " + array[i].getCantidadAlumnos() + " alumnos");
            System.out.println("El módulo " + array[i].getNombreAsignatura() + " tiene " + array[i].getHorasSemanales() + " horas semanales.");
            System.out.println("El módulo " + array[i].getNombreAsignatura() + " tiene un porcentaje "
                    + "de aprobados del " + array[i].getPorcentajeAprobados() + "%");
            System.out.println("El módulo " + array[i].getNombreAsignatura() + " tiene un porcentaje "
                    + "de suspensos del " + array[i].getPorcentajeSuspensos()+ "%");
            System.out.println("ID del módulo " + array[i].getNombreAsignatura() + ": " + array[i].getIdCurso());
            System.out.println();
        }
    }
        
        public static void nombreProfesores(Curso [] array){
            for(int i = 0 ; i < array.length; i++){
                System.out.println("Profesor/a " + array[i].getNombreProfesor() + " pertenece al módulo " + array[i].getNombreAsignatura());
            }
            System.out.println();
        }
}
