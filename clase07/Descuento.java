package clase7;

public interface Descuento {

    double calcularDescuento(double total) throws ValorCeroException, MontoNegativoException;
}
