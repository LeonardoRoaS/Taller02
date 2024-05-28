package modelo.data;

public class Eleccion {
    private String nombreEleccion, fecha, lugar;
    private Candidato candidato;
    
    public Eleccion(String nombreEleccion, String fecha, String lugar){
        this.nombreEleccion=nombreEleccion;
        this.fecha=fecha;
        this.lugar=lugar;
    }

    public String getNombreEleccion() {
        return nombreEleccion;
    }

    public void setNombreEleccion(String nombreEleccion) {
        this.nombreEleccion = nombreEleccion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
}
