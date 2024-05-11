package PracticoClaseGenerica.Ejercicio2;
import java.util.*;
public class PilaArray<T> {
    private T [] elementos;
    private int obj_ingresados,tamanio;
    public PilaArray(int tamanio_pila) {
        this.tamanio=tamanio_pila;
        elementos =  (T[]) new Object[tamanio_pila];
    }

    public boolean estaVacia() {
        if(obj_ingresados == 0){
            return true;
        }
        return false;
    }
    public boolean aniadir(T dato) {
        if (obj_ingresados < tamanio) {
            elementos[obj_ingresados] = dato;
            obj_ingresados++;
            return true;
        } else {
            return false;
        }
    }
    public T primero() {
        if(estaVacia()){
            throw new NoSuchElementException("La pila esta vacia");
        }
            return elementos[obj_ingresados - 1];

    }
    public T extraer() {
        if(estaVacia()){
            throw new NoSuchElementException("La pila esta vacia");
        }
        obj_ingresados--;
        return elementos[obj_ingresados];
    }


    @Override
    public String toString() {
      return "PilaArray " + Arrays.toString(Arrays.copyOfRange(elementos, 0, obj_ingresados));
    }
}
