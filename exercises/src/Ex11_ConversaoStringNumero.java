package exercises.src;

import javax.swing.*;

public class Ex11_ConversaoStringNumero {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Bem-vindo à calculadora da S.H.I.E.L.D.",
                "Sistema de nível de Poder", JOptionPane.INFORMATION_MESSAGE);

        String heroPower = JOptionPane.showInputDialog("Informe o nível de poder do herói: ");
        String heroPower2 = JOptionPane.showInputDialog("Informe o nível de poder do outro herói: ");

        System.out.println(
                "Erro - cálcuulo incorreto: "
                + heroPower + " + " + heroPower2 + " = " + (heroPower + heroPower2)
        );

        try {
            double power = Double.parseDouble(heroPower);
            double power2 = Double.parseDouble(heroPower2);
            double sum = power + power2;

            System.out.println(
                    "Cálculo correto: "
                    + power + " + " + power2 + " = " + sum
            );

            JOptionPane.showMessageDialog(null, "O nível de poder total é: " + sum,
                    "Resultado", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor inválido! " + e.getMessage(),
                    "Erro de Conversão", JOptionPane.ERROR_MESSAGE);
            System.err.println("Erro crticio: Valor inválido! " + e.getMessage());
        }

    }
}
