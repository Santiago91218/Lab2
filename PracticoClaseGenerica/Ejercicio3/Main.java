package PracticoClaseGenerica.Ejercicio3;
public class Main {
    public static void main(String[] args) {

        Almacen<Producto> almacen = new Almacen<>();

        almacen.agregarProducto(new Producto(30000.99,"Notebook"));
        almacen.agregarProducto(new Producto(399.99,"Harina"));
        almacen.agregarProducto(new Producto(1000,"Bananas"));

        almacen.imprimirProductos();



    }
}