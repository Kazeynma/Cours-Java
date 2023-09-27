import java.time.Duration;
import java.time.OffsetTime;
import java.util.Random;
import java.util.Scanner;

public class Exo4 {
    public static void exo4() {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int value = random.nextInt(0, 1000);
        System.out.print("Valeur choisie. ");
        boolean win = false;

        OffsetTime start = OffsetTime.now();

        while (!win) {
            System.out.println("Quel chiffre ?");
            int guess = sc.nextInt();

            if (guess != value) {

                if (guess > value) {
                    System.out.println("C'est moins !");
                } else {
                    System.out.println("C'est plus !");
                }
            } else {
                OffsetTime end = OffsetTime.now();
                Duration time = Duration.between(start, end);
                win = true;
                System.out.println("Bravo ! Vous avez réussi en : " + time.getSeconds() + " secondes");
            }
        }
    }
}
