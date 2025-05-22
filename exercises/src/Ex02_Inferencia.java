package exercises.src;

public class Ex02_Inferencia {
    public static void main(String[] args) {

        /*
        * Inferência de tipos em Java - Quando o compilador consegue inferir o tipo da variável
        * A inferência de tipos é o processo pelo qual o compilador determina o tipo de uma variável com base no valor atribuído a ela.
        * */

        var text = "Compilador determinará o tipo da variável como String";

        System.out.printf("Type of text - %s %n", text.getClass().getName());

        if(text.getClass() == String.class) {
            System.out.printf("text - %s %n", text);
        }

        if (text instanceof String) {
            System.out.printf("text - %s", text);
        }
    }
}
