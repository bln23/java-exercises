package exercises;

import java.util.Scanner;

public class IfTests {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la nota: ");
        int numero = sc.nextInt();
        sc.close();
        if (numero <= 4) {
            System.out.println("El alumno está suspenso.");
        }

        if (numero >= 5) {
            System.out.println("El alumno está aprobado");
        }

        if (numero == 9) {
            System.out.println("con un sobresaliente.");
        }

        if (numero == 10) {
            System.out.println("con una matrícula de honor.");
        }
    }
}
