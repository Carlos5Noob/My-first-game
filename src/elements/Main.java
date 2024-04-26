package elements;

public class Main {
    public static void main(String[] args) {

        int salud_total = 100; // salud inicial del personaje

        Story._story_first_section();
        Story.chooseClass();
        Story._story_second_section();

        boolean combate = Story.combat_condor();

        if (!combate) {
            salud_total -= 20;
        }

        System.out.println("Salud actual del personaje: " + salud_total);

        int trivial = Minigames.trivial();

        salud_total -= trivial;

        System.out.println("Salud actual del personaje " + salud_total);

        if (salud_total < 1) {
            System.out.println("GAME OVER");
            return;
        }

    }
}
