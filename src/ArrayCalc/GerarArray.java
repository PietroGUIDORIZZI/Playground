package ArrayCalc;


import java.util.Random;

public class GerarArray {
    public static int[] Gerador() {
        Random random = new Random();
        int[] numerous = new int[random.nextInt(1, 100)];

        for (int i = 0; i < numerous.length; i++) {
            numerous[i] = random.nextInt(100);
        }

        return numerous;
    }
}
