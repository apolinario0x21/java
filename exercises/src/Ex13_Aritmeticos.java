package exercises.src;

public class Ex13_Aritmeticos {
    public static void main(String[] args) {

        int luffyReward = 3_000;
        int zoroReward = 1_111;
        int sanjiReward = 1_000;

        int totalReward = luffyReward + zoroReward + sanjiReward;
        int rewardDifference = luffyReward - zoroReward;
        int averageReward = totalReward / 3;

        System.out.printf("Soma total: %,d %nDiferença entre Luffy e Zoro: %,d %nMédia de recompensa: %,d%n",
                totalReward, rewardDifference, averageReward);

        double increasePercentage = 0.25;
        double newLuffyReward = luffyReward * (1 + increasePercentage);


        System.out.printf("Nova Recompensa: %,.2f %nDiferença para o Luffy %,.2f ",
                newLuffyReward, (newLuffyReward - zoroReward));
    }
}
