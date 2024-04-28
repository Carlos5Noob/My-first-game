package elements;

import java.util.Scanner;

public class Story {

    public static void _story_first_section() {
        System.out.println(
                "\nEn un día común, los hermanos Steven y Tommy disfrutan jugando videojuegos hasta que Steven sugiere salir a tomar un poco de sol. Durante su paseo, son testigos de un acontecimiento extraño: un titán gigante secuestra a Tommy de repente. Alarmado, Steven corre en busca de ayuda y se encuentra con el duende Cóndor, quien revela una misión de vital importancia: salvar el universo de las garras de Halumberg, un malvado villano que ha alterado el curso de la humanidad. Para prepararse, el duende ofrece a Steven la posibilidad de elegir entre tres clases de poderes: Hechicero, Brutalista o Judío. Ante esta decisión trascendental, Steven se debate entre las opciones, consciente de que su elección determinará el destino de su hermano y del universo mismo.");
        System.out.println("¿Qué clase debería elegir Steven? (Hechizero, Brutalista o Judío)");

    }

    public static void chooseClass() {

        Scanner s = new Scanner(System.in);

        String opcion = s.nextLine();

        do {
            switch (opcion) {
                case "hechizero":
                case "Hechizero":
                    System.out
                            .println("Has elegido la clase de Hechizero. Perfecto, ya sabemos que tu rol es ser gay.");
                    break;
                case "brutalista":
                case "Brutalista":
                    System.out.println(
                            "Has elegido la clase de Brutalista. Espero que tus nudillos estén listos para hacer música en la cara de tus enemigos.");
                    break;
                case "judio":
                case "judío":
                case "Judio":
                case "Judío":
                    System.out.println(
                            "Has elegido la clase de Judío. Cuidado con tus enemigos, podrían ser más persistentes que un cobrador de impuestos en la época de los nazis.");
                    break;
                default:
                    System.out.println("Clase no permitida, inténtelo de nuevo: ");
                    opcion = s.nextLine();
                    continue;
            }
            break;
        } while (true);

    }

    public static void _story_second_section() {
        System.out.println(
                "Tras elegir la clase, el duende Cóndor le dice a Steven que antes de seguir su legado ha de demostrar si tiene la fuerza suficiente como para hacerle frente a las adversidades le van a surgir por la travesía, así que el duende Cóndor lo reta a un combate, pero un combate un tanto extraño, ya que cada uno de los enemigos a los que Steven se enfrentará en su travesía serán mini juegos de la vida cotidiana en los que si Steven pierde este muere, vamos, que se va para el lobby. Steven, aún desconcertado con todo lo ocurrido, le dice al duendecillo que es imposible que le gane, ya que todo ha sucedido muy rápido y que no está muy seguro de si es capaz de salvar a la humanidad. No obstante, el duendecillo se abstrae a sus palabras y comienza el combate.");
    }

    public static boolean combat_condor() {

        ASCIIart._fight();
        System.out.println();

        boolean combate = false;

        System.out.println(
                "Empieza el combate contra el duende Cóndor. En este combate tendrás que adivinar un número entre el 1 y el 10, pero sólo tendrás 3 intentos para hacerlo, sino... PAL LOBBY.");

        boolean adivina = Minigames.adivinarNumero();

        if (adivina) {
            System.out.println("¡Enhorabuena¡, ¡Has acertado el número y por lo tanto has ganado el combate!");
            combate = true;
        } else {
            System.out.println("¡Fallaste! Perdiste 20 de HP, suerte en la próxima. ");

        }

        return combate;
    }

    public static int _story_third_section() {
        System.out.println(
                "Después de un combate intenso con el duende Cóndor, este le asegura a Steven que está listo para enfrentar la adversidad. Abre un portal y lo transporta a otra dimensión. Steven, con el corazón aún palpitante por la emoción y el miedo, se adentra en este nuevo mundo con la única meta de encontrar a su hermano Tommy.");
        System.out.println(
                "Al cruzar el umbral del portal, Steven se encuentra sumergido en un paisaje oscuro y desolador que le hiela la sangre. La atmósfera está cargada de una energía ominosa que parece palpitar en el aire, y el joven no puede evitar sentir un escalofrío recorrer su espalda.");
        System.out.println(
                "Entonces, llega a un punto crucial donde se encuentra ante una encrucijada: dos caminos se abren ante él, cada uno más ominoso que el otro.");
        System.out.println(
                "Steven se ve obligado a tomar una decisión difícil: ¿seguirá el camino de la oscuridad a la izquierda, donde el aura maligna es más palpable, o tomará el sendero de la incertidumbre a la derecha, donde el peligro parece estar oculto tras una aparente calma?");
        System.out.println("1. Derecha");
        System.out.println("2. Izquierda");

        int x = chooseWay();

        if (x == 1) {
            int combat = right_way();
            return combat;
        } else {
            int combat2 = left_way();
            return combat2;
        }
    }

    public static int chooseWay() {
        Scanner s = new Scanner(System.in);
        int opcion = Integer.parseInt(s.nextLine());
        return opcion;
    }

    public static int right_way() {

        System.out.println("Steven elije adentrarse en el camino de la derecha.");
        System.out.println(
                "Al principio, Steven parecía estar tranquilo, hasta que de repente se alza a sus espaldas un ser imponente conocido como Eclipse. A pesar de su apariencia imponente, el combate contra Eclipse resulta ser un desafío trivial para Steven.");

        int x = combat_Eclipse();

        return x;
    }

    public static int left_way() {

        System.out.println("Steven elije adentrarse en el camino de la izquierda.");
        System.out.println(
                "Al principio, Steven parecía estar tranquilo, hasta que de repente se alza a sus espaldas un ser imponente conocido como Zyron. El combate con Zyron es diferente: se desarrolla como un juego de piedra, papel o tijeras, donde Steven debe utilizar su intuición y estrategia para vencer a este adversario astuto y caótico.");

        int x = combat_Zyron();

        return x;
    }

    public static int combat_Eclipse() {
        ASCIIart._fight();
        System.out.println();

        int x = Minigames.trivial();

        return x;

    }

    public static int combat_Zyron() {
        ASCIIart._fight();
        System.out.println();

        int x = Minigames.rock_paper_scissors_game();

        return x;
    }

    public static void _story_fourth_section() {
        System.out.println(
                "Tras derrotar al todopoderoso villano, Steven sigue avanzado en su aventura hasta llegar al castillo donde descansa el malvado Halumberg.");
        System.out.println(
                "Es aquí donde se decidirá el destino del universo. Steven, bastante confiado de sí mismo, se adentra dentro del castillo pero justo al intentar entrar, le cierran la gran puerta en toda su cara.");
        System.out.println(
                "Steven, ha resolver un acertijo para poder abrir la puerta y, de este modo, enfrentarse a Halumberg.");
        System.out.println("El acertijo es el siguiente: \n");

    }

    public static void _story_fifth_section() {
        System.out.println(
                "Tras resolver el acertijo y abrirse la puerta, Steven se encuentra con el malvado villano Halumberg, quien le está esperando para su combate final.");
        System.out.println(
                "Halumberg le dice que abandone, que no tiene la suficiente fuerza como para derrotarle, pero Steven se niega y no tiene miedo de hacerle frente");
        System.out.println("Tras esto, ¡Empieza la batalla final!");
    }

    public static boolean combat_Halumberg() {
        ASCIIart._fight();
        System.out.println();
        boolean result = false;

        System.out.println(
                "Empieza el combate final contra el supremo Halumberg. En este combate tendrás que desputar una tanda de penaltis contra él. 5 penaltis, has de marcar al menos 3 para ganar y salvar la humanidad. Mucha suerte, guerrero.");

        boolean combat = Minigames.penalti_game();

        if (combat) {
            System.out.println(
                    "¡INCREÍBLE! ¡Has conseguido ganar el combate y de este modo derrotar al villano Halumberg!");
            result = true;

        } else {
            System.out.println("Oh, no. Has perdido el combate contra Halumberg...");
        }

        return result;

    }

    public static void good_ending() {
        System.out.println(
                "Agotado pero triunfante, Steven se reúne con su hermano Tommy, quien lo mira con admiración y gratitud. Juntos, regresan a su hogar, sabiendo que su valentía y determinación salvaron al mundo de la destrucción total.");

        ASCIIart._the_end();
    }

    public static void bad_ending() {

        System.out.println(
                "El mundo se sume en la oscuridad y el desespero, con toda esperanza perdida.  Con un susurro final, el último rayo de luz se desvanece, dejando el universo en las garras del mal sin fin.");
        ASCIIart._game_over();
    }

}
