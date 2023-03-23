package ArgentinaPrograma;

public class Main {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        System.out.println(calc.sumar(75, 38));
        System.out.println(calc.restar(75, 38));
        System.out.println(calc.multiplicar(75, 38));
        System.out.println(calc.dividir(75, 0));
    }
}