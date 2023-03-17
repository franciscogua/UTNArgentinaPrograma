package clase6;

public class Producto {
    
    //Atributos
    private String nombre;
    private double precioUnitario;

    //Constructor
    public Producto (String nombre, double precioUnitario){
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
    }

    //Métodos
    public String getNombre(){
        return this.nombre;
    }
    public double getPrecio(){
        return precioUnitario;
    }
}
