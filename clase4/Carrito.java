package clase4;

public class Carrito {

    //Atributos
    private Producto[] compra;
    private Persona persona;
    private int cantidadProductos;

    //Constructor
    public Carrito(Persona persona){

        this.persona = persona;
        this.compra = new Producto[3];
        this.cantidadProductos = 0;
    }

    //Métodos
    public Persona getPersona(){
        return persona;
    }
    public void addProducto(Producto producto){
        if(cantidadProductos < 3){
            compra[cantidadProductos] = producto;
            cantidadProductos++;
        } else{
            System.out.println("El carrito esta lleno!");
        }
    }
    public double calcularTotal(){
        double total = 0;
        System.out.println("Carrito de " + persona.getNombreCompleto() + ":");
        for (int i = 0; i < cantidadProductos; i++){
            Producto producto = compra[i];
            System.out.println(producto.getNombre() + " - $" + producto.getPrecio());
            total += producto.getPrecio();
        }
        System.out.println("Total: $" + total);
        return total;
    }
}


