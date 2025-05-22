package exercises.src;

public class Ex03_TiposPrimitivos {
    public static void main(String[] args) {
        /*
        Tipos primitivos em Java - byte, short, int, long, float, double, char, boolean
        */

        /* Tipos numéricos inteiros */
        byte b = 127; // 1^² = 8 bits (-128 a 127)
        System.out.println("byte: " + b);

        short s = 32767; // 2^² = 16 bits (-32.768 a 32.767)
        System.out.println("short: " + s);

        int i = 2147483647; // 4^² = 32 bits (-2.147.483.648 a 2.147.483.647)
        System.out.println("int: " + i);

        long l = 9223372036854775807L; // 8^² = 64 bits (-9.223.372.036.854.775.808 a 9.223.372.036.854.775.807)
        System.out.println("long: " + l);


        /* Tipos numéricos reais */
        float f = 3.14F; // 4^² = 32 bits (-3.40282347E+38 a 3.40282347E+38)
        System.out.println("float: " + f);

        double d = 3.141592653589793; // 8^² = 64 bits (-1.7976931348623157E+308 a 1.7976931348623157E+308)
        System.out.println("double: " + d);

        char c = 'A'; // 2^² = 16 bits (0 a 65.535)
        System.out.println("char: " + c);

        boolean bool = true; // 1 bit (true ou false)
        System.out.println("boolean: " + bool);
        System.out.println("------------------------------\n");

        byte tempoDeCarreira = 23;
        short quantidadeDeGolsMarcados = 999;
        int valorDeMercado = 50_000_000;
        long seguidoresInstagram = 630_000_000L;
        float altura = 1.87F;
        double velocidadeMaxima = 33.6;
        boolean isMelhorDoMundo = true;
        char posicao = 'A';

        System.out.printf(
                "Usando o cenário de futebol como exemplo:\nCR7 - siiiiuuuuu\n\n"
                + "Tempo de carreira: " + tempoDeCarreira
                + ". Média de gols por ano: " + quantidadeDeGolsMarcados / tempoDeCarreira
                + ". Valor de mercado: " + valorDeMercado
                + ".\nQuantidade de Seguidores: " + seguidoresInstagram
                + ". Altura: " + altura
                + ". Velocidade máxima: " + velocidadeMaxima
                + ".\nMelhor do Mundo: " + isMelhorDoMundo
                + ". Posição: " + posicao + " (Atacante).");
    }

}
// Tipos primitivos são imutáveis