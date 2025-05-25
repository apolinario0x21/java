package exercises.src;

import java.util.Scanner;

public class Ex07_Console {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Treino de KI\nGoku - Bem-vindo ao treino de KI!");

        System.out.print("Informe seu poder de luta: ");
        int power = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha deixada pelo nextInt()

        System.out.print("Informe seu nome: ");
        String name = scanner.nextLine();

        System.out.print("Você é um Super Saiyajin? (true/false): ");
        boolean isSuperSaiyajin = scanner.nextBoolean();

        System.out.printf("%s, seu poder de luta é %d e você %s Super Saiyajin%n"
                , name, power, isSuperSaiyajin ? "é um" : "não é um");

        scanner.close();
    }
}
