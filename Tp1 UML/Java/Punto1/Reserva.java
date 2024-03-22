package Punto1;
public class Reserva {
    private double costo;
    private String fecha_reserva;
    private int num_asiento;

    public Reserva(double costo,String fecha_reserva,int num_asiento){
        this.costo=costo;
        this.fecha_reserva=fecha_reserva;
        this.num_asiento=num_asiento;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getFecha_reserva() {
        return fecha_reserva;
    }

    public void setFecha_reserva(String fecha_reserva) {
        this.fecha_reserva = fecha_reserva;
    }

    public int getNum_asiento() {
        return num_asiento;
    }

    public void setNum_asiento(int num_asiento) {
        this.num_asiento = num_asiento;
    }
}
