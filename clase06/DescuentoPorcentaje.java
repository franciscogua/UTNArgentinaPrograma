package clase6;

public class DescuentoPorcentaje implements Descuento {
    
    private double porcentajeDescuento;

    public DescuentoPorcentaje(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public double calcularDescuento(double precio) {
        return precio * (porcentajeDescuento/100);
    }
}
