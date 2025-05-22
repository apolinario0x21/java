package exercises.src;

public class Ex06_TipoString {
    public static void main(String[] args) {

        String frase = "Com grandes poderes vêm grandes responsabilidades.";
        System.out.printf("Frase Completa: %s %n", frase);
        System.out.printf("Primeiro Caracter: %s %n", frase.charAt(0));

        System.out.printf("Parte 1: %s %n",frase.substring(12, 20));
        System.out.printf("Parte 2: %s %n",frase.substring(32));

        String frase2 = " Homem-Aranha ao resgate! ";
        System.out.printf("Frase de efeito: %s %n", frase2.trim());
        System.out.printf("Caixa Alta: %s %n", frase2.toUpperCase());
        System.out.printf("Substituindo: %s %n", frase2.replace("Homem-Aranha", "Aranha"));

        System.out.printf("Contém: %s %n", frase.contains("poderes"));
        System.out.printf("Termina com 'Responsabilidades.'? %s %n", frase.endsWith("responsabilidades."));
        System.out.printf("Começa com 'Com'? %s %n", frase.startsWith("Com"));

        var heroi = "Peter Paker";
        var age = 5;
        System.out.printf("%s, já é heroi há %d anos. %n", heroi, age);

        String[] palavras = frase.split(" ");
        System.out.println("Palavras: ");
        for (int i = 0; i <= palavras.length - 1; i++) {
            System.out.println("- " + palavras[i]);
        }


    }
}
