package clase6;

public class Main {
    public static void main(String[] args){

        Persona persona1 = new Persona ("Francisco", "Guarino", 23);
        Carrito carrito = new Carrito (persona1);
        Producto prod1 = new Producto ("Jabón en polvo", 40);
        Producto prod2 = new Producto ("Esponjas", 10);
        Producto prod3 = new Producto ("Chocolates", 100);

        carrito.addProducto(prod1);
        carrito.addProducto(prod2);
        carrito.addProducto(prod3);

        Descuento descuentoPorcentajeConTope = new DescuentoPorcentajeConTope(50, 50);
        carrito.setDescuento(descuentoPorcentajeConTope);

        carrito.calcularTotal();
    }
}
