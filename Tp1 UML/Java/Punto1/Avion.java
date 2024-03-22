package Punto1;
public class Avion {
    private int matricula_avion;
    private Vuelo vuelo;
    public Avion(int matricula_avion){
        this.matricula_avion=matricula_avion;
    }
    public void addVuelo(Vuelo vuelo){
        this.vuelo=vuelo;
    }

    public String viaje(){
        return "El avion con matricula: "+this.matricula_avion+" va con destino a: "+vuelo.getDestino();
    }

    public int getMatricula_avion() {
        return matricula_avion;
    }
    public void setMatricula_avion(int matricula_avion) {
        this.matricula_avion = matricula_avion;
    }
}
