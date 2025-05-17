package exercises.src;

public class Ex14_DesafioAritmeticos {
    public static void main(String[] args) {

        double first = Math.pow(6 * (3 + 2), 2) / (3 * 2);
        double second = Math.pow((1 - 5) * (2 - 7) / 2, 2) ;
        double aux = Math.pow(first - second, 3);
        double aux2 =  Math.pow(10, 3);

        System.out.printf("1° etapa: %s " +
                        "%n2° etapa: %s " +
                        "%n3° etapa: %s " +
                        "%n4° etapa: %s " +
                        "%n5° etapa: %s %n%n",
                first, second, first - second, aux, aux2);

        double result = aux / aux2;
        System.out.println("Resultado final: " + result);

    }
}
