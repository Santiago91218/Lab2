package PracticoClaseGenerica.Ejercicio4;
import java.util.*;
public class Almacen {
    private List<? super Producto> elementos;

    public Almacen() {
        elementos = new ArrayList<>();
    }

    public void agregarElemento(Producto elemento) {
        elementos.add(elemento);
    }

    public void imprimirElementos() {
        System.out.println("Elmentos");
        for (Object elemento : elementos) {
            System.out.println(elemento.toString());
        }
    }
}