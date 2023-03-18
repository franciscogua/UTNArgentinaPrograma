package clase7;

public class MontoNegativoException extends Exception {
    
    @Override
    public String getMessage() {
        return "El descuento no puede dar un monto negativo";
    }
}
