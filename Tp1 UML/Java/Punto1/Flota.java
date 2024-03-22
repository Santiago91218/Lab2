package Punto1;
import java.util.ArrayList;
public class Flota {
    private ArrayList<Avion> aviones;
    private String nombre_flota;
    public Flota(){
    }
    public Flota(String nombre_flota){
        this.nombre_flota=nombre_flota;
        this.aviones = new ArrayList<>();
    }

    public void addAvion(int matricula){
        this.aviones.add(new Avion(matricula));
    }

    public String getNombre_flota() {
        return nombre_flota;
    }
    public void setNombre_flota(String nombre_flota) {
        this.nombre_flota = nombre_flota;
    }
}