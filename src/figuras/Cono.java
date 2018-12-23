package figuras;

public class Cono extends Figuras3D {
    private double radio;
    private double altura;

    public Cono(double radio, double altura){
        this.altura = altura;
        this.radio = radio;
    }

    @Override
    double calculateVolume() {
        return (Math.PI * Math.pow(radio, 2) * altura) / 3;
    }

    @Override
    double calculatePerimeter() {
        return 0;
    }
}
