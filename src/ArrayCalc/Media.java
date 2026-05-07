package ArrayCalc;

public class Media {
    static double media(int[] array){
        double media = 0;
        int nums = 0;
        for (int i = 0; i < array.length; i++) {
            media += array[i];
            nums++;
        }
        media = media/nums;

        return media;
    }
}
