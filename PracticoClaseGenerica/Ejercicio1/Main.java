package PracticoClaseGenerica.Ejercicio1;
public class Main {
    public static void main(String[] args) {
        OperableImplementacion op=new OperableImplementacion();

        System.out.println(op.suma(12,2));
        System.out.println(op.resta(10,10));
        System.out.println(op.multiplicacion(4,6));

        try {
            System.out.println(op.division(12, 2));
        } catch (ArithmeticException e) {
            System.out.println("Error: Division por cero");
        }
    }
}