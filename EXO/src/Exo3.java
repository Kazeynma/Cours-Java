import java.util.Random;
import java.util.Scanner;

public class Exo3 {

    public static void exo3() {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int value = random.nextInt(0, 1000);
        System.out.print("Valeur choisie. ");
        boolean win = false;

        while (!win) {
            System.out.println("Quel chiffre ?");
            int guess = sc.nextInt();

            if (guess != value) {
                int difference = guess - value;

                if (difference > 0) {
                    System.out.println("C'est moins !");
                } else {
                    System.out.println("C'est plus !");
                }
            } else {
                win = true;
                System.out.println("Bravo !");
            }
        }

    }
}
