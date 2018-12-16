package exercises;

import java.util.Scanner;

public class ReadFromConsole {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce palabra: ");
        String palabra = sc.nextLine();
        System.out.println();
        System.out.print("Introduce numero entero: ");
        int numEntero = sc.nextInt();
        System.out.println();
        System.out.print("Introduce numero decimal: ");
        double numDecimal = sc.nextDouble();
        System.out.println(palabra);
        System.out.println(numEntero);
        System.out.println(numDecimal);
        sc.close();

    }
}

