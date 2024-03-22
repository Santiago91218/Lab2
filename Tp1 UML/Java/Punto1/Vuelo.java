package Punto1;

import java.util.ArrayList;

public class Vuelo {
    private String destino;
    private String origen;
    private int tiempo_vuelo;
    private Avion avion;//Asociacion Avion-Vuelo
    private  ArrayList<Reserva> reservas;

    public Vuelo(String destino,String origen,int tiempo_vuelo){
        this.destino=destino;
        this.origen=origen;
        this.tiempo_vuelo=tiempo_vuelo;
        this.reservas = new ArrayList<>();
    }

    public void addReservas(Reserva reserva){
        this.reservas.add(reserva);
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public int getTiempo_vuelo() {
        return tiempo_vuelo;
    }

    public void setTiempo_vuelo(int tiempo_vuelo) {
        this.tiempo_vuelo = tiempo_vuelo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }
}
