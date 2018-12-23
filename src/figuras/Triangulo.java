package figuras;

public class Triangulo extends Figuras2D {
    private double lado;
    private double altura;

    public Triangulo(double lado, double altura){
        this.lado = lado;
        this.altura = altura;
    }


    @Override
    double calculateArea() {
        return lado * altura / 2 ;
    }

    @Override
    double calculatePerimeter() {
        return lado * 3;
    }
}
