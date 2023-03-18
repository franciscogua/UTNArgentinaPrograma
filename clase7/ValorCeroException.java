package clase7;

public class ValorCeroException extends Exception {

    @Override
    public String getMessage() {
        return "No se puede aplicar descuento a un carrito cuyo valor total es $0";
    }
}
