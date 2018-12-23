package exercises;

public class Cuenta {
    public double cantidad;
    public String titular;

    public Cuenta(String nombre){
        this.cantidad = 0.0;
        this.titular = nombre;
    }

    public Cuenta(String nombre, double cant){
        this.titular = nombre;
        if(cant >= 0){
            this.cantidad = cant;
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void ingresar(double cant){
        if(cant >= 0){
            setCantidad(getCantidad() + cant);
        }
    }

    public void retirar(double cant){
        if(cant >= getCantidad()){
            setCantidad(0.0);
        } else if (cant >= 0){
             setCantidad(getCantidad() - cant);
        }
    }

    public String pedirInfo(){
        return "El titular " + getTitular() + " tiene " + getCantidad() + " euros en la cuenta";
    }

    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("Antonio");
        Cuenta cuenta2 = new Cuenta("Juan", 100);

        System.out.println(cuenta1.pedirInfo());
        cuenta1.ingresar(100);
        System.out.println(cuenta1.pedirInfo());
        cuenta1.retirar(30);
        System.out.println(cuenta1.pedirInfo());
        cuenta1.retirar(80);
        System.out.println(cuenta1.pedirInfo());
    }

}
