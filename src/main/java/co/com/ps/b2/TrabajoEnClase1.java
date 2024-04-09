package co.com.ps.b2;

public class TrabajoEnClase1 {

    String cpu;
    String gpu;
    int memoriaRam;
    String fuente;
    int ventiladores;
    String capacidadDiscoDuro;
    String motherBoard;

    public void encender(){

        System.out.println("El computador se ha encendido");
    }

    public void specs(){
        System.out.println(cpu+" "+gpu+" "+memoriaRam+" "+fuente+" "+ventiladores+" "+ capacidadDiscoDuro+" "+motherBoard);
    }

    public void apagar(){

        System.out.println("El computador se ha apagado");
    }

}