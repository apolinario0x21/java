package exercises.src;

public class Ex09_ConversaoTipoPrimitivoNumerico {
    public static void main(String[] args) {

        double potenciaTotal = 850.456789; // conversão implícita de double para float
        System.out.println("Potência Total: " + potenciaTotal);

        float injecaoCombustivel = (float) 850.456789; // cast de double para float - conversão explícita
        System.out.println("Injeção de Combustível: " + injecaoCombustivel + ". Perda de precisão perceptível");

        int rpmSeguro = 7000;
        System.out.println("RPM Seguro: " + rpmSeguro);

        int rpmPerigoso = 13000;
        byte rpmMedido = (byte) rpmPerigoso; // cast de int para byte - conversão explícita
        System.out.println("RPM Medido: " + rpmMedido + ". Perda de precisão perceptível");

        double velocidadeReal = 198.7654321;
        int velocidadeDisplay = (int) velocidadeReal; // cast de double para int - conversão explícita
        System.out.println("Velocidade no painel: " + velocidadeDisplay + ". Perda de precisão perceptível");
    }
}
