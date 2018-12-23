package figuras;

public class Cubo {
    private double arista;

    public Cubo(double arista){
        this.arista = arista;
    }

    public double calculatePerimeter(){
        return arista * 12;
    }

    public double calculateVolume(){
        return Math.pow(arista, 3);
    }
}
