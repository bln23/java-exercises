package figuras;

public class Icosaedro extends Figuras3D {
    private double arista;

    public Icosaedro(double arista){
        this.arista = arista;
    }

    @Override
    double calculateVolume() {
        return 5/12 * (3 + Math.sqrt(5)) * Math.pow(arista, 3);
    }

    @Override
    double calculatePerimeter() {
        return 5 * Math.sqrt(3) * Math.pow(arista, 2);
    }
}
