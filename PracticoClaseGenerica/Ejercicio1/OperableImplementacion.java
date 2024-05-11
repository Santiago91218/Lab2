package PracticoClaseGenerica.Ejercicio1;
public class OperableImplementacion implements Operable<Integer> {
    @Override
    public Integer suma(Integer num1, Integer num2) {
        return num1 + num2;
    }

    @Override
    public Integer resta(Integer num1, Integer num2) {
        return num1 - num2;
    }

    @Override
    public Integer multiplicacion(Integer num1, Integer num2) {
        return num1 * num2;
    }

    @Override
    public Integer division(Integer num1, Integer num2) {

        return num1/num2;
    }
}
