import java.util.Random;

public class Exo2 {
    public static void exo2() {
        //Exo 2
        Random random = new Random();
        int tries = 0;
        boolean finish = false;

        while (!finish) {
            for (int i = 0; i <= 3; i++) {
                int a = random.nextInt(0, 1000);
                int b = random.nextInt(0, 1000);
                int c = random.nextInt(0, 1000);

                if (a%2 == 0 && b%2 == 0 && c%2 != 0) {
                    finish = true;
                    System.out.println("a :" + a + ", b :" + b + ", c :" + c);
                } else {
                    tries+=1;
                }

            }
        }
        System.out.println("tries : " + tries);
    }
}
