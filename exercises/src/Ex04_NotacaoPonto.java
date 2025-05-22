package exercises.src;

public class Ex04_NotacaoPonto {
    public static void main(String[] args) {

        String str = "Hello World";
        str = str.replace("Hello World", "Olá Mundo");
        str = str.toUpperCase();
        str = str.concat("!");

        System.out.println(str);

        String str2 = "Java".toUpperCase();
        System.out.println(str2);

        String str3 = "Java".toUpperCase().concat("?").replace("?", "!");
        System.out.println(str3);

        // Conforme exemplo abaixo, os tipos primitivos não possuem métodos e são imutáveis
        String number = "123";
        System.out.println(number.replace("123", "456"));

        int isNumber = 123;
        System.out.println(number); // number. não há métodos disponíveis, pois int é um tipo primitivo.

    }
}
