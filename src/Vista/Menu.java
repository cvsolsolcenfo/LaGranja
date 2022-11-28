package Vista;

import java.util.Scanner;

public class Menu {
        Scanner scanner;

        public Menu() {
            scanner = new Scanner(System.in);
        }
        public void mostrar() {
            System.out.println("\nMenú. Por favor seleccione una opción: ");
            System.out.println("1.");
            System.out.println("2.");
            System.out.println("3.");
            System.out.println("4.");
            System.out.println("Opción: ");

        }
}
