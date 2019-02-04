package ajedrez;

public class Participante {

    private final String nombre;
    private final String numSocio;
    private final String direccion;
    private final Pais pais;

    public Participante(String nombre, String numSocio, String direccion, Pais pais) {
        this.nombre = nombre;
        this.numSocio = numSocio;
        this.direccion = direccion;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumSocio() {
        return numSocio;
    }

    public String getDireccion() {
        return direccion;
    }

    public Pais getPais() {
        return pais;
    }
}
