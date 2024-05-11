package PracticoClaseGenerica.Ejercicio4;
public class Main {
    public static void main(String[] args) {
        Almacen almacen = new Almacen();

        almacen.agregarElemento(new Producto("Telefono"));
        almacen.agregarElemento(new Articulo("Libro"));

        almacen.imprimirElementos();

    }
}