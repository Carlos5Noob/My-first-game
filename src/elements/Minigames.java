package elements;

import java.util.Scanner;

public class Minigames {
    
    public static boolean adivinarNumero() {

        final int x = (int) (Math.random() * 11);  
        boolean adivina = false;

        Scanner s = new Scanner(System.in);
        int contador = 3;
        int num;

        do {
            System.out.println("Introduce un número: ");
            num = Integer.parseInt(s.nextLine());

            if (num == x) {
                adivina = true;
                break;
            } else {
                contador--;
                if (num > x) {
                    System.out.println("El número a adivinar es más pequeño que el número introducido. Te quedan " + contador + " intentos.");
                } else {
                    System.out.println("El número a adivinar es más grande que el número introducido. Te quedan " + contador + " intentos.");
                }
            }

        } while (contador != 0);

        s.close();
        return adivina;
    }

}
