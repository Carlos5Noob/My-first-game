package elements;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int salud_total = 100; // salud inicial del personaje

        Story._story_first_section();
        Story.chooseClass();
        skip();
        Story._story_second_section();
        skip();
        boolean combate = Story.combat_condor();

        if (!combate) {
            salud_total -= 20;
        }

        _showHP(salud_total);
        skip();

        int cont = Story._story_third_section();

        salud_total -= cont;

        _showHP(salud_total);
        skip();

        Story._story_fourth_section();
        skip();
        Minigames.quiz();
        skip();

        Story._story_fifth_section();
        skip();

        boolean finalCombat = Story.combat_Halumberg();

        if (finalCombat) {
            Story.good_ending();
        } else {
            Story.bad_ending();
        }

        // si la salud del personaje llega a 0, la partida termina
        if (salud_total < 1) {
            ASCIIart._game_over();
            return;
        }

    }

    /**
     * Método que muestra por consola la salud actual del personaje
     * 
     * @param salud
     */
    public static void _showHP(int salud) {

        System.out.println("Salud actual del personaje: " + salud);

    }

    /**
     * Método para skipear pulsando la tecla Enter
     */
    public static void skip() {
        Scanner s = new Scanner(System.in);

        String skipear = s.nextLine();

    }
}
