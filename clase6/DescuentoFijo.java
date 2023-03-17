package clase6;

public class DescuentoFijo implements Descuento {
   
    private double valorDescuento;

    public DescuentoFijo(double valorDescuento) {
        this.valorDescuento = valorDescuento;
    }

    @Override
    public double calcularDescuento(double precio) {
        return valorDescuento;
    }
}
