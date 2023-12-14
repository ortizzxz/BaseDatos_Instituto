
package salonDeClases;

/**
 * Base de D - Determinada Asignatura con el nombre del prof, de los alumnos, cantidad
 * de alumnos, las notas de los alumnos - % de suspensos y de aprobados.
 * @author Jesus
 */
public class Curso {
    private int idCurso = 0;
    private int cantidadCursos=0;
    private String nombreAsignatura;
    private String nombreProfesor;
    private int cantidadAlumnos;
    private int horasSemanales;
    private double porcentajeSuspensos;
    private double porcentajeAprobados;
    private static int siguienteCurso = 0;
    
    Curso(String nombreAsignatura, String nombreProfesor, int cantidadAlumnos,
            int horasSemanales, double porcentajeAprobados, double porcentajeSuspensos){
            this.nombreAsignatura = nombreAsignatura; 
            this.nombreProfesor = nombreProfesor;
            this.cantidadAlumnos = cantidadAlumnos;
            this.horasSemanales = horasSemanales;
            this.porcentajeAprobados = porcentajeAprobados; 
            this.porcentajeSuspensos = porcentajeSuspensos;
            this.idCurso = Curso.siguienteCurso;
            siguienteCurso++;
    }
    
    public String getNombreAsignatura(){
        return this.nombreAsignatura;
    }
    
    public String getNombreProfesor(){
        return this.nombreProfesor;
    }
    
    public int getCantidadAlumnos(){
        return this.cantidadAlumnos;
    }
    
    public int getHorasSemanales(){
        return this.horasSemanales;
    }
    
    public double getPorcentajeAprobados(){
        return this.porcentajeAprobados;
    }
    
    public double getPorcentajeSuspensos(){
        return this.porcentajeSuspensos;
    }
    
    public int getIdCurso(){
        return this.idCurso;
    }
    
    /*   */
    public void setNombreAsignatura(String nombreAsignatura){
        this.nombreAsignatura = nombreAsignatura;
    }
    
    public void setNombreProfesor(String nombreProfesor){
        this.nombreProfesor = nombreProfesor;
    }
    
    public void setCantidadAlumnos(int cantidadAlumnos){
        this.cantidadAlumnos = cantidadAlumnos;
    }
    
    public void setHorasSemanales(int horasSemanales){
        this.horasSemanales = horasSemanales;
    }
    
    public void setPorcentajeAprobados(double porcentajeAprobados){
        this.porcentajeAprobados = porcentajeAprobados;
    }
    
    public void setPorcentajeSuspensos(double porcentajeSuspensos){
        this.porcentajeSuspensos = porcentajeSuspensos;
    }
    
    
}
