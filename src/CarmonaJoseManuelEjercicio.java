import java.util.Random;
import java.util.Scanner;

public class CarmonaJoseManuelEjercicio {
    static void main() {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        // ===== GENERAR PREMIOS =====
        String premio1 = String.format("%05d", random.nextInt(99999) + 1);
        String premio2 = String.format("%05d", random.nextInt(99999) + 1);
        String premio3 = String.format("%05d", random.nextInt(99999) + 1);
        String cuarto1 = String.format("%05d", random.nextInt(99999) + 1);
        String cuarto2 = String.format("%05d", random.nextInt(99999) + 1);

        String reintegro = premio1.substring(4);

        int opcion = -1;

        while (opcion != 0) {

            System.out.println("\n=== SORTEO DE NAVIDAD ===");
            System.out.println("[1] Comprobar décimo");
            System.out.println("[2] Resumen premios");
            System.out.println("[0] Salir");
            System.out.print("Elige una opción: ");

            if (input.hasNextInt()) {
                opcion = input.nextInt();
            } else {
                System.out.println("Debes introducir un número.");
                input.next(); // limpia lo incorrecto
                continue;
            }

            switch (opcion) {

                case 1:

                    int numero = 0;
                    boolean numeroValido = false;

                    while (!numeroValido) {

                        System.out.print("Introduce número del décimo (1-99999): ");

                        if (input.hasNextInt()) {
                            numero = input.nextInt();

                            if (numero >= 1 && numero <= 99999) {
                                numeroValido = true;
                            } else {
                                System.out.println("Número fuera de rango.");
                            }

                        } else {
                            System.out.println("Debes introducir un número entero.");
                            input.next();
                        }
                    }

                    int importe = 0;
                    boolean importeValido = false;

                    while (!importeValido) {

                        System.out.print("Introduce importe jugado (mínimo 1€): ");

                        if (input.hasNextInt()) {
                            importe = input.nextInt();

                            if (importe >= 1) {
                                importeValido = true;
                            } else {
                                System.out.println("El importe debe ser mínimo 1€.");
                            }

                        } else {
                            System.out.println("Debes introducir un número entero.");
                            input.next();
                        }
                    }

                    String decimo = String.format("%05d", numero);
                    String tipoPremio = "";

                    if (decimo.equals(premio1)) {
                        tipoPremio = "PRIMERO";
                    } else if (decimo.equals(premio2)) {
                        tipoPremio = "SEGUNDO";
                    } else if (decimo.equals(premio3)) {
                        tipoPremio = "TERCERO";
                    } else if (decimo.equals(cuarto1) || decimo.equals(cuarto2)) {
                        tipoPremio = "CUARTO";
                    } else if (decimo.substring(4).equals(reintegro)) {
                        tipoPremio = "REINTEGRO";
                    }

                    switch (tipoPremio) {

                        case "PRIMERO":
                            System.out.println("Décimo " + decimo +
                                    ". Primer premio!! Has ganado " + (20000 * importe) + "€");
                            break;

                        case "SEGUNDO":
                            System.out.println("Décimo " + decimo +
                                    ". Segundo premio!! Has ganado " + (6250 * importe) + "€");
                            break;

                        case "TERCERO":
                            System.out.println("Décimo " + decimo +
                                    ". Tercer premio!! Has ganado " + (2500 * importe) + "€");
                            break;

                        case "CUARTO":
                            System.out.println("Décimo " + decimo +
                                    ". Cuarto premio!! Has ganado " + (1000 * importe) + "€");
                            break;

                        case "REINTEGRO":
                            System.out.println("Décimo " + decimo +
                                    ". Reintegro!! Has ganado " + (importe) + "€");
                            break;

                        default:
                            System.out.println("Décimo " + decimo +
                                    ". Lo siento no has tenido suerte");
                    }

                    break;

                case 2:
                    System.out.println("\n=== RESUMEN PREMIOS ===");
                    System.out.println("Primer premio: " + premio1);
                    System.out.println("Segundo premio: " + premio2);
                    System.out.println("Tercer premio: " + premio3);
                    System.out.println("Cuarto premio 1: " + cuarto1);
                    System.out.println("Cuarto premio 2: " + cuarto2);
                    System.out.println("Reintegro: última cifra del Gordo (" + reintegro + ")");
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción incorrecta.");
            }
        }

        input.close();
    }
}
