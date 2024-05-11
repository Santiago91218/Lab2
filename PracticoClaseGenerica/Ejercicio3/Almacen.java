package PracticoClaseGenerica.Ejercicio3;
import java.util.*;
public class Almacen <T extends Producto> {
    private List<T> productos;
    public Almacen() {
        this.productos = new ArrayList<>();
    }
    public void agregarProducto(T producto) {
        productos.add(producto);
    }
    public void imprimirProductos() {
        System.out.println("Productos:");
        for (T producto : productos) {
            System.out.println(producto.getNombre());
        }
    }
}