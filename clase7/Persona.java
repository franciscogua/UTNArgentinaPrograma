package clase7;

public class Persona {
    
    //Atributos
    private String nombre;
    private String apellido;
    private int edad;

    //Constructor
    public Persona (String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    //Métodos
    public String getNombreCompleto() {
        return this.nombre + " " + this.apellido;
    }
    public String getEdad() {
        return "Edad: "+ this.edad;
    }
}
