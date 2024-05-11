package PracticoClaseGenerica.Ejercicio4;
public class Articulo extends Producto {

    public Articulo(String nombre) {
        super(nombre);
    }
    @Override
    public String toString() {
        return  getNombre() ;
    }
}