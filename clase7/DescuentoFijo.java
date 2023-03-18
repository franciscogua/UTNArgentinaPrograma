package clase7;

public class DescuentoFijo implements Descuento {
   
    private double valorDescuento;

    public DescuentoFijo(double valorDescuento) {
        this.valorDescuento = valorDescuento;
    }

    @Override
    public double calcularDescuento(double total) throws ValorCeroException, MontoNegativoException {
        return valorDescuento;
    }
}
