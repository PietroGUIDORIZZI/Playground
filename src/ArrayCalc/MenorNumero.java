package ArrayCalc;

public class MenorNumero {

    int value;
    int position;

    public MenorNumero(int value, int position) {
        this.value = value;
        this.position = position;

    }

    public static MenorNumero encontreOMenor(int[] nums) {
        int min = nums[0];
        int pos = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
                pos = i;
            }
        }
        return new MenorNumero(min, pos);


    }
}

