public class Alumno {

    // el nombre completo del alumno
    private String nombre;
    // el numero de matricula
    private String numeroMatricula;
    // la edad del alumno
    private int edad;

    /**
     * Crea un alumno nuevo
     */
    public Alumno(String nombreCompleto, String numeroMatriculaAlumno, int edadAlumno) {
        nombre = nombreCompleto;
        if (nombreCompleto.length() < 3){
            System.out.println("Error: el nombre debe tener mas de tres caracteres");
        }
        numeroMatricula = numeroMatriculaAlumno;
        if (numeroMatriculaAlumno.length() < 4){
            System.out.println("Error: el numero de matricula debe tener cuatro caracteres");
        }
        edad = edadAlumno;

    }

    /**
     * Devuelve el nombre completo del alumno
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Cambia el nombre del alumno
     */
    public void cambiarnombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }

    /**
     * Imprime por pantalla los detalles del alumno
     */
    public void imprimeDetalles() {
        System.out.println(nombre + " (" + numeroMatricula + ") - " + edad + " a?os");
    }

    /**
     * Devuelve el nombre de usuario que el alumno debe configurar
     * en su cuenta de Github en formato de 7 caracateres
     */
    public String getNombreUsuarioGithub() {
        String nombreEstudiante = "";
        String matriculaEstudiante = "";

        if (nombre.length()>= 3 ){
            nombreEstudiante = nombre.substring(0,3); 
        }
        else {
            nombreEstudiante = nombre.substring(0, nombre.length()); 
        }

        if (numeroMatricula.length() <= 4){
            matriculaEstudiante =  numeroMatricula.substring(0,numeroMatricula.length());  
        }
        else {
            matriculaEstudiante = numeroMatricula.substring(0,4); 
        }

        return nombreEstudiante + matriculaEstudiante;
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public int getEdad() {
        return edad;
    }
    
    public String getDatos(){
        return nombre + "(" +numeroMatricula+ ")" + "-" + edad + "a?os";
    }
}

