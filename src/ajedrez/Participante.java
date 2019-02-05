package ajedrez;

public class Participante {

    private final String nombre;
    private final Jugador jugador;
    private final String direccion;
    private final Pais pais;

    public Participante(String nombre, Jugador jugador, String direccion, Pais pais) {
        this.nombre = nombre;
        this.jugador = jugador;
        this.direccion = direccion;
        this.pais = pais;
    }

	public String getNombre() {
        return nombre;
    }

    public String getNumSocio() {
        return jugador.getNumSocio();
    }

    public String getDireccion() {
        return direccion;
    }

    public Pais getPais() {
        return pais;
    }

    public Jugador getJugador() {
        return jugador;
    }
}