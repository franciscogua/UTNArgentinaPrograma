package clase6;

public class DescuentoPorcentajeConTope implements Descuento {
    
    private double porcentajeDescuento;
    private double topeDescuento;

    public DescuentoPorcentajeConTope(double porcentaje, double tope) {
        this.porcentajeDescuento = porcentaje;
        this.topeDescuento = tope;
    }

    public double calcularDescuento(double total) {
        double descuento = total * porcentajeDescuento / 100;
        if (descuento > topeDescuento) {
            return topeDescuento;
        } else {
            return descuento;
        }
    }
}
