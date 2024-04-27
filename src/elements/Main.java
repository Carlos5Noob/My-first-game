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
        int trivial = Minigames.trivial();

        salud_total -= trivial;

        _showHP(salud_total);


        skip();
        int rock_paper_scissors_game = Minigames.rock_paper_scissors_game();

        if (rock_paper_scissors_game < 0) {
            salud_total -= 40;
        } else if (rock_paper_scissors_game == 0) {
            salud_total -= 20;
        } else {
            salud_total = salud_total;
        }

        _showHP(salud_total);



        if (salud_total < 1) {
            System.out.println("GAME OVER");
            return;
        }

    }

    public static void _showHP(int salud) {

        System.out.println("Salud actual del personaje: " + salud);

    }

    public static void skip() {
        Scanner s = new Scanner(System.in);

        String skipear = s.nextLine();

    }
}
