package co.com.ps.b3;

public class Colombiano {

    private String cedula;
    private String nombre;
    private String apellido;
    private String tipoDocumento;
    private String tipoDeSangre;

    public Colombiano(String cedula, String nombre, String apellido, String tipoDocumento, String tipoDeSangre) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoDocumento = tipoDocumento;
        this.tipoDeSangre = tipoDeSangre;
    }


    // Getters: Sirven para solicitar los datos ya almacenados en atributos privados
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    // Setters: sirven para darle valor a los datos privados
    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getTipoDeSangre() {
        return tipoDeSangre;
    }

    public void setTipoDeSangre(String tipoDeSangre) {
        this.tipoDeSangre = tipoDeSangre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getApellido(){
        return apellido;
    }
}
