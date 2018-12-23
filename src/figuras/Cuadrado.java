package figuras;

public class Cuadrado extends Figuras2D {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double calculatePerimeter(){
        return lado * 4;
    }

    public double calculateArea(){
        return lado * lado;
    }
}
