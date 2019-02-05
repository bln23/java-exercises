package ajedrez;

public class Pais {

    private final String nomPais;
    private final int numPais;

    public Pais(String nomPais, int numPais) {
        this.nomPais = nomPais;
        this.numPais = numPais;
    }

    public String getNomPais() {
        return nomPais;
    }

    public int getNumPais() {
        return numPais;
    }
}
