package modelo.data;

public class Votante {
    private String contacto, preferenciaPolitica;

    public Votante (String contacto, String preferenciaPolitica){
        this.contacto = contacto;
        this.preferenciaPolitica = preferenciaPolitica;
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
