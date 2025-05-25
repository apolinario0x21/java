package exercises.src;

public class Ex08_Wrapper {
    public static void main(String[] args) {
        /*
         * Wrappers classes
         * byte, short, int, long, float, double, char, boolean
         * Byte, Short, Integer, Long, Float, Double, Character, Boolean
         * */

        Byte level = 50;
        Short hp = 190;
        Integer attack = 110;
        Long exp = 1_250_000L;
        Float height = 0.4f;
        Double weight = 6.0;
        Character type = 'E';
        Boolean canEvolve = true;

        System.out.printf("Level: %d%n" +
                        "HP: %d%n" +
                        "Attack: %d%n" +
                        "EXP: %d%n" +
                        "Altura: %.2f%n" +
                        "Peso: %.2f%n" +
                        "Tipo: %c%n" +
                        "Pode evoluir: %b%n",
                level.byteValue(), hp.shortValue(), attack.intValue(), exp.longValue(), height.floatValue(),
                weight.doubleValue(), type.charValue(), canEvolve.booleanValue());

        int damage = attack * 2;
        System.out.println("Dano: " + damage);

        String pokeball = "Pokebola";
        Integer captureRate = Integer.valueOf(("50"));
        Double sucessRate = Double.parseDouble("75.5");

        System.out.printf("Pokebola: %s%nTaxa de captura: %d%nTaxa de sucesso: %.2f%n",
                pokeball, captureRate, sucessRate);

        Boolean teste = true;
        teste.toString();
        System.out.println("Teste: " + teste);


    }
}
