package exercises.src;

import java.util.Locale;
import java.util.Scanner;

public class Ex12_DesafioConversao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // Configura o Locale para usar ponto como separador decimal
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro salário: ");
        String inSalario = scanner.nextLine();

        System.out.print("Informe o segundo salário: ");
        String inSalarioOne = scanner.nextLine();

        System.out.print("Informe o terceiro salário: ");
        String inSalarioTwo = scanner.nextLine();

        try {

            double strToNumber = Double.parseDouble(inSalario.replace(",", "."));
            double strToNumberOne = Double.parseDouble(inSalarioOne.replace(",", "."));
            double strToNumberTwo = Double.parseDouble(inSalarioTwo.replace(",", "."));

            double media = (strToNumber + strToNumberOne + strToNumberTwo) / 3;
            System.out.printf("Média total dos salários: R$ %.2f ", media);

        } catch (NumberFormatException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        scanner.close();
    }
}
