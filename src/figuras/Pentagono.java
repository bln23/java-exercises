package figuras;

public class Pentagono extends Figuras2D{
    private double apotema;
    private double lado;


    public Pentagono(double lado, double apotema) {
        this.lado = lado;
        this.apotema = apotema;
    }


    @Override
    double calculateArea() {
        return lado * apotema;
    }

    @Override
    double calculatePerimeter() {
        return lado * 5;
    }
}
