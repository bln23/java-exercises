package figuras;

public class Cilindro extends Figuras3D {
    private double radio;
    private double altura;

    public Cilindro(double radio, double altura){
        this.altura = altura;
        this.radio = radio;
    }

    @Override
    double calculateVolume() {
        return Math.PI * Math.pow(radio, 2) * altura;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radio * altura;
    }
}
