package clase7;

public class DescuentoPorcentajeConTope implements Descuento {
    
    private double porcentajeDescuento;
    private double topeDescuento;

    public DescuentoPorcentajeConTope(double porcentaje, double tope) {
        this.porcentajeDescuento = porcentaje;
        this.topeDescuento = tope;
    }

    public double calcularDescuento(double total) throws ValorCeroException, MontoNegativoException{
        double descuento = total * porcentajeDescuento / 100;
        if (descuento > topeDescuento) {
            return topeDescuento;
        } else {
            return descuento;
        }
    }
}
