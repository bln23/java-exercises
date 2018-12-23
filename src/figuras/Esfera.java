package figuras;

public class Esfera extends Figuras3D {
    private double radio;

    @Override
    double calculateVolume() {
        return 4/3 * Math.PI * Math.pow(radio, 3);
    }

    @Override
    double calculatePerimeter() {
        return 4 * Math.PI * Math.pow(radio, 2);
    }
}
