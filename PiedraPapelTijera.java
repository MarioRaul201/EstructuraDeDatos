import java.util.Random;

public class PiedraPapelTijera {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        switch (randomNumber) {
            case 0 -> System.out.println("Piedra");
            case 1 -> System.out.println("Papel");
            default -> System.out.println("Tijera");
        }
    }
}