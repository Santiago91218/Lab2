package Punto1;
public class Main {
    public static void main(String[] args) {
        Flota flota1=new Flota("Flota 1");

        Avion avion1=new Avion(123);
        Vuelo vuelo1=new Vuelo("Argentina","Chile",12);
        avion1.addVuelo(vuelo1);//Asociacion Avion-Vuelo
        System.out.println(avion1.viaje());



        Reserva reserva1=new Reserva(200,"23/5/2024",12);
        vuelo1.addReservas(reserva1);


        Piloto p1=new Piloto("Jose","Perez",1);
        p1.volar();






    }
}
