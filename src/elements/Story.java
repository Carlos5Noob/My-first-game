package elements;

import java.util.Scanner;

public class Story {

    public static void _story_first_section() {
        System.out.println(
                "Un día como otro cualquiera, dos hermanos de misma sangre se pasan todo el día jugando a la consola, pero de repente un día de estos el hermano mayor, Steven, le dice al otro de salir a la calle para tomar el sol, que falta les hace\r\n"
                        + //
                        "El hermano pequeño, Tommy, acepta la petición y pasan ese día todo el día fuera.\r\n" + //
                        "Cuando salen a la calle se dan cuenta que algo raro pasa, por lo que deciden dar una vuelta por el vecindario, y, de repente, un titán de 5 metros se lleva al pequeño Tommy volando. Steven, tras el susto y el miedo de su hermano va corriendo en busca de ayuda a la policía. De camino a la comisaría, aparece el duende Cóndor, el cual le dice a Steven que tienen que salvar el universo de las garras de Halumberg, el malvado villano que ha cambiado el transcurso de la humanidad. Este chico, totalmente anonadado, acepta la petición del duendecillo en busca de salvar a la humanidad, y, sobre todo, en busca de su hermano. Pero antes de partir, Steven ha de escoger entre un superpoder que el duendecillo le va a ortorgar, ya que como humano no tiene ninguna opción de ganar a Halumberg. Las clases a elegir son: Hechicero, Brutalista, Judío. \r\n"
                        + //
                        "\r\n" + //
                        "Steven se encuentra parado en medio de la calle, mirando al duende Cóndor con asombro. Las palabras del diminuto ser resuenan en su mente mientras su corazón late con fuerza. ¿Salvar al universo? ¿Enfrentarse a un malvado villano? Y lo más importante, ¿rescatar a su querido hermano Tommy?\r\n"
                        + //
                        "El duende, con su expresión seria pero determinada, espera la elección de Steven. Mientras reflexiona sobre las opciones, un torrente de pensamientos lo abruma. ¿Qué tipo de poder sería el más útil en esta situación desesperada? ¿Qué habilidades le ayudarían a vencer a Halumberg y rescatar a su hermano?\r\n"
                        + //
                        "Hechicero: Steven imagina el poder de lanzar conjuros y manipular la realidad misma. Ser un hechicero podría otorgarle la capacidad de controlar elementos como el fuego, el agua y el viento. Podría conjurar escudos mágicos para protegerse y lanzar rayos de energía contra sus enemigos. Pero, ¿sería suficiente contra un villano tan poderoso como Halumberg?\r\n"
                        + //
                        "Brutalista: La idea de ser un guerrero cuerpo a cuerpo resuena en Steven. Ser un brutalista significaría ser la personificación de la fuerza bruta. Imagina sus puños envueltos en un aura de poder, capaz de destrozar rocas y derribar a sus enemigos con un solo golpe. Pero, ¿sería capaz de enfrentarse cara a cara con las hordas de criaturas malignas que Halumberg pueda lanzar contra él?\r\n"
                        + //
                        "Judío: Esta opción desconcierta a Steven. ¿Qué significa ser un \"judío\" en este contexto? ¿Será algún tipo de referencia cultural o histórica? Se pregunta si este camino le ofrecerá las habilidades necesarias para enfrentar los desafíos que se avecinan. Pero la curiosidad lo impulsa a considerar esta opción, preguntándose qué secretos podría albergar este camino poco convencional.\r\n"
                        + //
                        "Con su mente llena de dudas y emociones, Steven se prepara para tomar una decisión que cambiará el curso de su vida y del universo mismo. ¿Qué opción crees que debería elegir?\r\n"
                        + //
                        "");
    }

    public static void chooseClass() {

        Scanner s = new Scanner(System.in);

        String opcion = s.nextLine();
        opcion = opcion.toLowerCase();

        do {
            switch (opcion) {
                case "hechizero":
                    System.out.println("Has elegido la clase de Hechizero. Perfecto, ya sabemos que tu rol es ser gay.");
                    break;
                case "brutalista":
                    System.out.println("Has elegido la clase de Brutalista. Espero que tus nudillos estén listos para hacer música en la cara de tus enemigos.");
                    break;
                case "judio":
                case "judío":
                    System.out.println("Has elegido la clase de Judío. Cuidado con tus enemigos, podrían ser más persistentes que un cobrador de impuestos en la época de los nazis.");
                    break;
                default:
                    System.out.println("Clase no permitida, inténtelo de nuevo: ");
                    opcion = s.nextLine().toLowerCase();
                    continue;
            }
            break; 
        } while (true);
        
    }

    public static void _story_second_section() {
        System.out.println(
                "Tras elegir la clase, el duende Cóndor le dice a Steven que antes de seguir su legado ha de demostrar si tiene la fuerza suficiente como para hacerle frente a las adversidades le van a surgir por la travesía, así que el duende Cóndor lo reta a un combate, pero un combate un tanto extraño, ya que cada uno de los enemigos a los que Steven se enfrentará en su travesía serán mini juegos de la vida cotidiana en los que si Steven pierde, este muere… vamos, que se va para el lobby. Steven, aún desconcertado con todo lo ocurrido, le dice al duendecillo que es imposible que le gane, ya que todo ha sucedido muy rápido y que no está muy seguro de si es capaz de salvar a la humanidad. No obstante, el duendecillo se abstrae a sus palabras y comienza el combate.");
    }

    public static boolean combat_condor() {

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

}
