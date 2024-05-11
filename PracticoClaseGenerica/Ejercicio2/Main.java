package PracticoClaseGenerica.Ejercicio2;
public class Main {
    public static void main(String[] args) {
        PilaArray pila=new PilaArray<>(3);

        System.out.println("Esta vacia?");
        System.out.println(pila.estaVacia());
        System.out.println("------------------------");

        System.out.println("Añadimos elementos");
        System.out.println(pila.aniadir(2.9));
        System.out.println(pila.aniadir(1));
        System.out.println(pila.aniadir("Hola"));
        System.out.println("------------------------");

        System.out.println("Ultimo elemento agregado");
        System.out.println(pila.primero());
        System.out.println("------------------------");

        System.out.println("Extraemos");
        System.out.println(pila.extraer());
        System.out.println(pila.extraer());
        System.out.println("------------------------");

        System.out.println("Elementos de la pila");
        System.out.println(pila.toString());
        System.out.println("------------------------");

        System.out.println("Esta vacia?");
        System.out.println(pila.estaVacia());
    }
}