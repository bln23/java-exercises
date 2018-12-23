package figuras;

public class Tetraedro extends Figuras3D{
    private double arista;

    public Tetraedro(double arista) {
        this.arista = arista;
    }


    @Override
    double calculateVolume() {
        return Math.sqrt(2)/2 * Math.pow(arista, 3);
    }

    @Override
    double calculatePerimeter() {
        return Math.sqrt(3) * Math.pow(arista, 2);
    }
}
