package exercises.src;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex16_DesafioLogicos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Teve hat-trick no primeiro jogo? (true/false): ");
            boolean firstGame = scanner.nextBoolean();

            System.out.print("Teve hat-trick no segundo jogo? (true/false): ");
            boolean secondGame = scanner.nextBoolean();

            if (firstGame && secondGame) {
                System.out.println("Hat-trick em ambos os jogos!".toUpperCase());
            } else if (firstGame ^ secondGame) {
                System.out.println("Hat-trick em apenas um dos jogos!".toUpperCase());
            } else {
                System.out.println("Não marcou em nenhum dos jogos!".toUpperCase());
            }
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage() + ". Entrada inválida. Por favor, insira true ou false.");
        }

        scanner.close();
    }
}
