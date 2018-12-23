package figuras;

public class Octaedro extends Figuras3D {
    private double arista;

    public Octaedro(double arista){
        this.arista = arista;
    }

    @Override
    double calculateVolume() {
        return Math.sqrt(2)/3 * Math.pow(arista, 3);
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.sqrt(3) * Math.pow(arista, 2);
    }
}
