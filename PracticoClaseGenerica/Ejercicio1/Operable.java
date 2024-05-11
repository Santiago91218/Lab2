package PracticoClaseGenerica.Ejercicio1;
public interface Operable <A extends Number> {
    A suma(A num1,A num2);
    A resta(A num1,A num2 );
    A multiplicacion(A num1,A num2);
    A division(A num1,A num2);
}