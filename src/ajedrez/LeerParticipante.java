package ajedrez;

import java.util.Scanner;

public class LeerParticipante {

    public static Participante leer(String nivel) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre participante: ");
        String nombre = sc.nextLine();
        System.out.println();
        System.out.print("Numero de socio: ");
        String numSocio = sc.nextLine();
        System.out.println();
        System.out.print("Direccion participante: ");
        String direccion = sc.nextLine();
        System.out.print("Pais del participante: ");
        String nombrePais = sc.nextLine();
        System.out.println();
        System.out.print("Numero del pais: ");
        int numPais = sc.nextInt();
        System.out.println();
        System.out.println(nombre);
        System.out.println(numSocio);
        System.out.println(direccion);
        System.out.println(nombrePais);
        System.out.println(numPais);
        sc.close();
        return new Participante(nombre, new Jugador(numSocio, nivel), direccion, new Pais(nombrePais, numPais));
    }
}