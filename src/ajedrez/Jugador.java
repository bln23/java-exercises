package ajedrez;

public class Jugador {

    private final String numSocio;
    private final String nivel;

    public Jugador(String numSocio, String nivel) {
        this.numSocio = numSocio;
        this.nivel = nivel;
    }

    public String getNumSocio() {
        return numSocio;
    }

	public String getNivel() {
		return nivel;
	}

}
