package ArrayCalc;

public class BubbleSort {
    public static int[] bubbleSort(int[] array) {
        int temp = 0;
        int i = 0;
        for (i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
}
