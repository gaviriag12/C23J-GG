package co.com.ps.b2;



public class Persona  {
    // Atributos
    String colorPiel;
    int edad;
    float estatura;  // float double  ejemplo 1.80
    String sexo;
    String nombre;
    String id;
    String telefono;

    Persona(){

    }
    // Constructor
    Persona(String nombre,int edad,String id,float estatura){
        this.nombre=nombre;
        this.edad=edad;
        this.id=id;
        this.estatura=estatura;
    }

    // Metodos
    public static void cantar(){
        System.out.println("Estoy cantando");
    }

    public void bailar(){
        System.out.println("estoy Bailando");
    }

    public int caminar(int cuadras){
        return cuadras *100;
    }

}
