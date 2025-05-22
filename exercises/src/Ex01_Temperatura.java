package exercises.src;

import java.util.Scanner;

public class Ex01_Temperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Fórmula de conversão de Fahrenheit para Celsius
        // Celsius = (Fahrenheit - 32) * 5/9

        /* constantes */
        final double x = 32;
        final double y = 5.0 / 9.0;

        System.out.print("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = (fahrenheit - x) * y;
        System.out.printf("%.0f°F = %.0f°C.", fahrenheit, celsius);
    }
}