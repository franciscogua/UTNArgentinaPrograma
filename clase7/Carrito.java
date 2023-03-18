package clase7;

import java.util.ArrayList;

public class Carrito {

    //Atributos
    private ArrayList<Producto> compra;
    private Persona persona;
    private Descuento descuento;

    //Constructor
    public Carrito(Persona persona) {

        this.persona = persona;
        this.compra = new ArrayList<Producto>();
    }

    //Métodos
    public Persona getPersona() {
        return persona;
    }
    public void addProducto(Producto producto) {
        compra.add(producto);
    }

    public void setDescuento(Descuento descuento) {
        this.descuento = descuento;

    }
    public double calcularTotal() throws ValorCeroException, MontoNegativoException {
        double total = 0;
        System.out.println("\nCarrito de " + persona.getNombreCompleto() + ":");
        for (Producto producto : compra){
            System.out.println(producto.getNombre() + " - $" + producto.getPrecio());
            total += producto.getPrecio();
        }

        if (descuento != null) {
            double valorDescuento = 0;
            try {
            valorDescuento = descuento.calcularDescuento(total);
            } catch(ValorCeroException e) {
                throw e;
            } catch(MontoNegativoException e) {
                throw e;
            }

            if(total == 0) {
                throw new ValorCeroException();
            }
            
            System.out.println("\nDescuento - $" + valorDescuento);
            total -= valorDescuento;

            if (total - valorDescuento < 0) {
                throw new MontoNegativoException();
            }
            
        }

        System.out.println("\nTotal: $" + total + "\n");
        return total;
    }
}


