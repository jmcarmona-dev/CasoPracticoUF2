import java.util.Scanner;
import java.util.Random;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Menu menu = new Menu();

        seleccionarPlato(menu);
        seleccionarComplemento(menu);
        seleccionarPostre(menu);
        seleccionarBebida(menu);

        generarSorpresa(menu);

        System.out.println("\nResumen del menú");
        menu.mostrarResumen();
    }

    // Pedir opciones
    public static int pedirOpcion(int max) {

        int opcion = 0;
        boolean correcto = false;

        while (!correcto) {

            System.out.print("Selecciona opción: ");

            if (sc.hasNextInt()) {
                opcion = sc.nextInt();

                if (opcion >= 1 && opcion <= max) {
                    correcto = true;
                } else {
                    System.out.println("Número fuera de rango");
                }

            } else {
                System.out.println("Debes introducir un número");
                sc.next();
            }
        }

        return opcion;
    }

    // Plato principal
    public static void seleccionarPlato(Menu menu) {

        System.out.println("\nPlato principal");
        System.out.println("1 Hamburguesa 2.50€");
        System.out.println("2 Chicken Burger 3.00€");
        System.out.println("3 Nuggets 2.80€");

        int opcion = pedirOpcion(3);

        switch (opcion) {
            case 1:
                menu.setPlatoPrincipal("Hamburguesa", 2.50);
                break;
            case 2:
                menu.setPlatoPrincipal("Chicken Burger", 3.00);
                break;
            case 3:
                menu.setPlatoPrincipal("Nuggets", 2.80);
                break;
        }
    }

    // Complemento
    public static void seleccionarComplemento(Menu menu) {

        System.out.println("\nComplemento");
        System.out.println("1 Patatas fritas 2.00€");
        System.out.println("2 Tomates Cherry 1.50€");
        System.out.println("3 Ensalada 2.20€");

        int opcion = pedirOpcion(3);

        switch (opcion) {
            case 1:
                menu.setComplemento("Patatas fritas", 2.00);
                break;
            case 2:
                menu.setComplemento("Tomates Cherry", 1.50);
                break;
            case 3:
                menu.setComplemento("Ensalada", 2.20);
                break;
        }
    }

    // Postre
    public static void seleccionarPostre(Menu menu) {

        System.out.println("\nPostre");
        System.out.println("1 Manzana 1.00€");
        System.out.println("2 Piña 1.20€");
        System.out.println("3 Brocheta 1.50€");

        int opcion = pedirOpcion(3);

        switch (opcion) {
            case 1:
                menu.setPostre("Manzana", 1.00);
                break;
            case 2:
                menu.setPostre("Piña", 1.20);
                break;
            case 3:
                menu.setPostre("Brocheta", 1.50);
                break;
        }
    }

    // Bebida
    public static void seleccionarBebida(Menu menu) {

        System.out.println("\nBebida");
        System.out.println("1 Agua 1.00€");
        System.out.println("2 Zumo naranja 1.50€");
        System.out.println("3 Zumo piña 1.50€");

        int opcion = pedirOpcion(3);

        switch (opcion) {
            case 1:
                menu.setBebida("Agua", 1.00);
                break;
            case 2:
                menu.setBebida("Zumo naranja", 1.50);
                break;
            case 3:
                menu.setBebida("Zumo piña", 1.50);
                break;
        }
    }

    // Sorpresa random
    public static void generarSorpresa(Menu menu) {

        String[] sorpresas = {"Chuches", "Libro", "Juguete"};

        Random r = new Random();

        int posicion = r.nextInt(sorpresas.length);

        menu.setSorpresa(sorpresas[posicion]);
    }
}
