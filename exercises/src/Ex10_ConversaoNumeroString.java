package exercises.src;

public class Ex10_ConversaoNumeroString {
    public static void main(String[] args) {

        // Tipo Wrapper para String - Usando Wrapper.toString()
        Integer recompensaLuffy = 1_500_000_000;
        System.out.println(
                "Método 1 - Wrapper.toString():\n"
                + "Recompensa: " + recompensaLuffy.toString()
                + "\nQuantidade de dígitos: " + recompensaLuffy.toString().length()
        );

        // Tipo primitivo para String - Usando Integer.toString()
        int recompensaZoro = 1_100_000_000;
        System.out.println("\n" +
                "Método 2 - Integer.toString():\n"
                + "Recompensa: " + Integer.toString(recompensaZoro)
                + "\nQuantidade de dígitos: " + Integer.toString(recompensaZoro).length()
        );

        // Usando concatenação com String
        int recompensaSanji = 1_000_000_000;
        System.out.println("\n" +
                "Método 3 - Concatenação com String:\n"
                + "Recompensa: " + ("" + recompensaSanji)
                + "\nQuantidade de dígitos: " + ("" + recompensaSanji).length()
        );

    }
}
