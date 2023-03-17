package clase6;

public class Carrito {

    //Atributos
    private Producto[] compra;
    private Persona persona;
    private int cantidadProductos;
    private Descuento descuento;

    //Constructor
    public Carrito(Persona persona) {

        this.persona = persona;
        this.compra = new Producto[3];
        this.cantidadProductos = 0;
    }

    //Métodos
    public Persona getPersona() {
        return persona;
    }
    public void addProducto(Producto producto) {
        if(cantidadProductos < 3){
            compra[cantidadProductos] = producto;
            cantidadProductos++;
        } else{
            System.out.println("El carrito esta lleno!");
        }
    }

    public void setDescuento(Descuento descuento) {
        this.descuento = descuento;

    }
    public double calcularTotal() {
        double total = 0;
        System.out.println("Carrito de " + persona.getNombreCompleto() + ":");
        for (int i = 0; i < cantidadProductos; i++){
            Producto producto = compra[i];
            System.out.println(producto.getNombre() + " - $" + producto.getPrecio());
            total += producto.getPrecio();
        }

        if (descuento != null) {
            double valorDescuento = descuento.calcularDescuento(total);
            System.out.println("\nDescuento - $" + valorDescuento);
            total -= valorDescuento;
        }

        System.out.println("\nTotal: $" + total);
        return total;
    }
}


