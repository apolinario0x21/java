package exercises.src;

public class Ex15_Logicos {
    public static void main(String[] args) {

        boolean isCarnivore = true;
        boolean isLarge = false;
        boolean hasFeathers = true;
        boolean canFly = false;

        System.out.println("AND (&&):");
        System.out.println(isCarnivore && !isLarge);
        System.out.println(isCarnivore && isLarge);
        System.out.println(!isCarnivore && isLarge);
        System.out.println(!isCarnivore && !isLarge);

        System.out.println("\nOR (||):");
        System.out.println(hasFeathers || canFly);
        System.out.println(hasFeathers || !canFly);
        System.out.println(!hasFeathers || !canFly);
        System.out.println(!hasFeathers || canFly);

        System.out.println("\nXOR (^):");
        System.out.println(isCarnivore ^ isLarge);
        System.out.println(isCarnivore ^ !isLarge);
        System.out.println(!isCarnivore ^ isLarge);
        System.out.println(!isCarnivore ^ !isLarge);

        System.out.println("\nNegação (!):");
        System.out.println(!isCarnivore);
        System.out.println(!isLarge);



    }
}
