package clase7;

public class DescuentoPorcentaje implements Descuento {
    
    private double porcentajeDescuento;

    public DescuentoPorcentaje(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public double calcularDescuento(double total) throws ValorCeroException, MontoNegativoException {
        return total * (porcentajeDescuento/100);
    }
}
