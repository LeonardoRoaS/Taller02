package modelo.data;

public class Votante {
    private String rut, contacto, preferenciaPolitica;

    public Votante (String rut){
        this.rut=rut;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getPreferenciaPolitica() {
        return preferenciaPolitica;
    }

    public void setPreferenciaPolitica(String preferenciaPolitica) {
        this.preferenciaPolitica = preferenciaPolitica;
    }
}
