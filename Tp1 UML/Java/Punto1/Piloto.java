package Punto1;
public class Piloto extends Persona implements Volador {
    private int num_licencia;

    public Piloto(String nombre, String apellido,int num_licencia){
        super(nombre, apellido);
        this.num_licencia=num_licencia;
    }

    @Override
    public void volar() {
        System.out.println("El piloto "+getNombre() +" esta pilotando");
    }

    public int getNum_licencia() {
        return num_licencia;
    }

    public void setNum_licencia(int num_licencia) {
        this.num_licencia = num_licencia;
    }
}
