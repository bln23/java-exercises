package figuras;

public class Circulo extends Figuras2D {
    private double radio;

    public Circulo(double radio){
        this.radio = radio;
    }

    @Override
    double calculateArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radio;
    }
}
