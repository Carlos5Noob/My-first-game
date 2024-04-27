package elements;

import java.util.Scanner;

public class Minigames {

    private static final Scanner scanner = new Scanner(System.in);

    public static boolean adivinarNumero() {

        final int x = (int) (Math.random() * 10 + 1);
        boolean adivina = false;

        int contador = 3;
        int num;

        do {
            System.out.println("Introduce un número: ");
            num = Integer.parseInt(scanner.nextLine());

            if (num == x) {
                adivina = true;
                break;
            } else {
                contador--;
                if (num > x) {
                    System.out.println("El número a adivinar es más pequeño que el número introducido. Te quedan "
                            + contador + " intentos.");
                } else {
                    System.out.println("El número a adivinar es más grande que el número introducido. Te quedan "
                            + contador + " intentos.");
                }
            }

        } while (contador != 0);

        return adivina;
    }

    public static int rock_paper_scissors_game() {
        System.out.println(
                "Bienvenido al juego de piedra, papel o tijeras, donde la suerte puede estar de tu lado... o no.");
        System.out.println("En este combate tendrás 3 turnos, quien gane 2 gana el juego. ");
        int cont = 3;
        int jugadorGana = 0;
        int cpuGana = 0;
        int result;

        do {
            System.out.println("Tu turno: ");
            System.out.println("1. Piedra");
            System.out.println("2. Papel");
            System.out.println("3. Tijeras");
            int opcion_jugador = Integer.parseInt(scanner.nextLine());
            String jugador = "";
            switch (opcion_jugador) {
                case 1:
                    jugador = "Piedra";
                    System.out.println("Has elegido " + jugador);
                    break;

                case 2:
                    jugador = "Papel";
                    System.out.println("Has elegido " + jugador);
                    break;
                case 3:
                    jugador = "Tijeras";
                    System.out.println("Has elegido " + jugador);
                    break;
            }

            int opcion_cpu = (int) (Math.random() * 3 + 1);
            String cpu = "";
            switch (opcion_cpu) {
                case 1:
                    cpu = "Piedra";
                    System.out.println("El enemigo ha elegido " + cpu);
                    break;

                case 2:
                    cpu = "Papel";
                    System.out.println("El enemigo ha elegido " + cpu);
                    break;
                case 3:
                    cpu = "Tijeras";
                    System.out.println("El enemigo ha elegido " + cpu);
                    break;
            }

            if (jugador.equalsIgnoreCase(cpu)) {
                System.out.println("¡Empate!");
            } else if ((jugador.equalsIgnoreCase("Piedra") && cpu.equalsIgnoreCase("Tijeras")) ||
                    (jugador.equalsIgnoreCase("Papel") && cpu.equalsIgnoreCase("Piedra")) ||
                    (jugador.equalsIgnoreCase("Tijeras") && cpu.equalsIgnoreCase("Papel"))) {
                System.out.println("¡Has ganado!");
                jugadorGana++;
            } else {
                System.out.println("¡Has perdido!");
                cpuGana++;
            }

            cont--;

        } while (cont > 0);

        System.out.println("Ha terminado el juego. Has obtenido " + jugadorGana + " puntos, y el rival ha obtenido " + cpuGana + " puntos.");

        if (jugadorGana > cpuGana) {
            System.out.println("¡Enhorabuena, has ganado el combate!");
            result = 0;
        } else if (jugadorGana < cpuGana) {
            System.out.println("Qué pena! Has perdido el combate. Pierdes 40 de salud.");
            result = 40;
        } else {
            System.out.println("El juego ha terminado en empate. Pierdes 20 de salud.");
            result = 20;
        }

        return result;

    }

    public static int trivial() {
        System.out.println("Bienvenido al juego del Trivial. Puedes elegir con qué tipo de cuestiones quieres jugar:");
        System.out
                .println("------------------------------------------------------------------------------------------");
        System.out.println("1. Preguntas sobre historia de España");
        System.out.println("2. Preguntas aritméticas. (Si no has hecho la ESO, no elijas esta opción jeje...)");
        System.out.println("3. Preguntas de deportes. ");

        int hp = 0;
        int opcionMaster;
        opcionMaster = Integer.parseInt(scanner.nextLine());

        switch (opcionMaster) {
            case 1:
                System.out.println("Has elegido el trivial sobre historia de España. No te lo pondré fácil...");
                hp = trivial_history();
                break;
            case 2:
                System.out.println("Has elegido el trivial sobre aritmética. ¿Serás tan listo como para ganar?");
                hp = trivial_arithmetic();
                break;
            case 3:
                System.out.println("Has elegido el trivial sobre deportes. Sabia elección");
                hp = trivial_sports();
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }

        return hp;
    }

    public static int trivial_history() {
        int hp = 0;

        System.out.println("Primera pregunta: ¿Quién fue el primer monarca de la dinastía de los Borbones en España?");
        System.out
                .println("-------------------------------------------------------------------------------------------");
        System.out.println("A) Felipe II");
        System.out.println("B) Carlos I");
        System.out.println("C) Felipe V");
        System.out.println("D) Fernando VII");
        String opcion = scanner.nextLine();

        switch (opcion) {
            case "A":
            case "a":
            case "B":
            case "b":
            case "D":
            case "d":
                System.out.println("¡Fallaste! La opción correcta era C) Felipe V");
                hp += 10;
                break;
            case "C":
            case "c":
                System.out.println("¡Acertaste!");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }

        System.out.println(
                "Segunda pregunta: ¿Cuál fue el evento que marcó el final de la Reconquista y la unificación de España en 1492?");
        System.out
                .println("-------------------------------------------------------------------------------------------");
        System.out.println("A) La Batalla de Las Navas de Tolosa");
        System.out.println("B) La toma de Granada por los Reyes Católicos");
        System.out.println("C) La firma de la Concordia de Segovia");
        System.out.println("D) El descubrimiento de América por Cristóbal Colón");

        String opcion2 = scanner.nextLine();

        switch (opcion2) {
            case "A":
            case "a":
            case "C":
            case "c":
            case "D":
            case "d":
                System.out.println("¡Fallaste! La opción correcta era B) La toma de Granada por los Reyes Católicos");
                hp += 10;
                break;
            case "B":
            case "b":
                System.out.println("¡Acertaste!");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }

        System.out.println(
                "Tercera pregunta: ¿Qué conflicto bélico enfrentó a España contra Estados Unidos en 1898 y resultó en la pérdida de las últimas colonias españolas en América y Asia?");
        System.out
                .println("-------------------------------------------------------------------------------------------");
        System.out.println("A) La Guerra de Sucesión Española");
        System.out.println("B) La Guerra de Independencia Española");
        System.out.println("C) La Guerra Civil Española");
        System.out.println("D) La Guerra Hispano-Estadounidense");

        String opcion3 = scanner.nextLine();

        switch (opcion3) {
            case "A":
            case "a":
            case "B":
            case "b":
            case "C":
            case "c":
                System.out.println("¡Fallaste! La opción correcta era D) La Guerra Hispano-Estadounidense");
                hp += 10;
                break;
            case "D":
            case "d":
                System.out.println("¡Acertaste!");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }

        return hp;
    }

    public static int trivial_arithmetic() {
        int hp = 0;

        System.out.println("Primera pregunta: Resuelve la siguiente ecuación: 3x+5=17");
        System.out
                .println("-------------------------------------------------------------------------------------------");
        System.out.println("A) 4");
        System.out.println("B) 3");
        System.out.println("C) 0");
        System.out.println("D) 7");
        String opcion = scanner.nextLine();

        switch (opcion) {
            case "D":
            case "d":
            case "B":
            case "b":
            case "C":
            case "c":
                System.out.println("¡Fallaste! La opción correcta era A) 4");
                hp += 10;
                break;
            case "A":
            case "a":
                System.out.println("¡Acertaste!");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }

        System.out.println(
                "Segunda pregunta: Si un libro cuesta 15 euros y quiero comprar 4 libros, ¿cuánto dinero necesitaré en total?");
        System.out
                .println("-------------------------------------------------------------------------------------------");
        System.out.println("A) 45");
        System.out.println("B) 75");
        System.out.println("C) 60");
        System.out.println("D) 15");
        String opcion2 = scanner.nextLine();

        switch (opcion2) {
            case "A":
            case "a":
            case "B":
            case "b":
            case "D":
            case "d":
                System.out.println("¡Fallaste! La opción correcta era C) 60");
                hp += 10;
                break;
            case "C":
            case "c":
                System.out.println("¡Acertaste!");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }

        System.out
                .println("Tercera pregunta: Calcula el área de un triángulo cuya base mide 8 cm y su altura mide 6 cm");
        System.out
                .println("-------------------------------------------------------------------------------------------");
        System.out.println("A) 24");
        System.out.println("B) 32");
        System.out.println("C) 48");
        System.out.println("D) 14");
        String opcion3 = scanner.nextLine();

        switch (opcion3) {
            case "D":
            case "d":
            case "B":
            case "b":
            case "C":
            case "c":
                System.out.println("¡Fallaste! La opción correcta era A) 24");
                hp += 10;
                break;
            case "A":
            case "a":
                System.out.println("¡Acertaste!");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }

        return hp;
    }

    public static int trivial_sports() {
        int hp = 0;

        System.out.println("Primera pregunta: ¿Cuántos títulos de Champions tiene el FC Barcelona?");
        System.out
                .println("-------------------------------------------------------------------------------------------");
        System.out.println("A) 5");
        System.out.println("B) 3");
        System.out.println("C) 2");
        System.out.println("D) 6");
        String opcion = scanner.nextLine();

        switch (opcion) {
            case "D":
            case "d":
            case "B":
            case "b":
            case "C":
            case "c":
                System.out.println("¡Fallaste! La opción correcta era A) 5");
                hp += 10;
                break;
            case "A":
            case "a":
                System.out.println("¡Acertaste!");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }

        System.out.println(
                "Segunda pregunta: ¿Quién es el tenista con más títulos de Grand Slam en la historia del tenis masculino, con un total de 20 títulos hasta 2022?");
        System.out
                .println("-------------------------------------------------------------------------------------------");
        System.out.println("A) Novak Djokovic");
        System.out.println("B) Rafael Nadal");
        System.out.println("C) Carlitos Alcaraz");
        System.out.println("D) Roger Federer");
        String opcion2 = scanner.nextLine();

        switch (opcion2) {
            case "B":
            case "b":
            case "C":
            case "c":
            case "D":
            case "d":
                System.out.println("¡Fallaste! La opción correcta era A) Novak Djokovic");
                hp += 10;
                break;
            case "A":
            case "a":
                System.out.println("¡Acertaste!");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }

        System.out.println("Tercera pregunta: ¿En qué equipo de baloncesto juega Lebron James?");
        System.out
                .println("-------------------------------------------------------------------------------------------");
        System.out.println("A) Boston Celtics");
        System.out.println("B) Denver Nuggets");
        System.out.println("C) The Lakers");
        System.out.println("D) Chicago Bulls");
        String opcion3 = scanner.nextLine();

        switch (opcion3) {
            case "A":
            case "a":
            case "B":
            case "b":
            case "D":
            case "d":
                System.out.println("¡Fallaste! La opción correcta era C) The Lakers");
                hp += 10;
                break;
            case "C":
            case "c":
                System.out.println("¡Acertaste!");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }

        return hp;
    }

}