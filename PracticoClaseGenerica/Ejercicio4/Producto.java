package PracticoClaseGenerica.Ejercicio4;
public class Producto {
    private String nombre;
    public Producto(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}