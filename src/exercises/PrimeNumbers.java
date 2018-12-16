package exercises;

import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce numero entero: ");
        int numero = sc.nextInt();
        for (int i = 0; i < numero; i++) {
            if (esPrimo(i)) {
                System.out.println("El numero " + i + " es primo");
            }
        }
        sc.close();
    }


    private static boolean esPrimo(int numero) {
        boolean primo = true;
        int divisor = 2;
        while ((primo) && (divisor < numero)) {
            if (numero % divisor == 0) {
                primo = false;
            } else {
                divisor++;
            }
        }
        return primo;
    }
}
