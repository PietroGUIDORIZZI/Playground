package ArrayCalc;


import java.util.Random;

public class GerarArray {
    public static int[] Gerador(int tamanho, int range) {
        Random random = new Random();
        int[] numeros = new int[tamanho];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(range);
        }

        return numeros;
    }
}
