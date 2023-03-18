package clase7;

public class Main {
    public static void main(String[] args) {

        //Personas
        Persona persona1 = new Persona ("Francisco", "Guarino", 23);
        Persona persona2 = new Persona ("Laura", "Crespo", 56);
        //Carritos
        Carrito carrito1 = new Carrito (persona1);
        Carrito carrito2 = new Carrito (persona2);
        //Productos
        Producto prod1 = new Producto ("Jabón en polvo", 40);
        Producto prod2 = new Producto ("Esponjas", 10);
        Producto prod3 = new Producto ("Chocolates", 100);
        Producto prod4 = new Producto ("Muestra gratis Shampoo", 0);

        carrito1.addProducto(prod1);
        carrito1.addProducto(prod2);
        carrito1.addProducto(prod3);
        
        carrito2.addProducto(prod4);

        Descuento descuentoFijo = new DescuentoFijo(200);
        carrito1.setDescuento(descuentoFijo);
        Descuento descuentoPorcentaje = new DescuentoPorcentaje(50);
        carrito2.setDescuento(descuentoPorcentaje);

        try {
            carrito1.calcularTotal();
        } catch(ValorCeroException e) {
            System.out.println("Error: " + e.getMessage());
        } catch(MontoNegativoException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        try{
        carrito2.calcularTotal();
        } catch(ValorCeroException e) {
            System.out.println("Error: " + e.getMessage());
        } catch(MontoNegativoException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
