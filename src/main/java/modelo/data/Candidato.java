package modelo.data;

public class Candidato {
    private String nombre, partidoPolitico, cargo;
    
    public Candidato(String nombre, String partidoPolitico, String cargo){
        this.nombre = nombre;
        this.partidoPolitico = partidoPolitico;
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
