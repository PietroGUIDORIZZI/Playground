package ArrayCalc;

public class MaiorNumero {
    int value;
    int position;

    public MaiorNumero(int value, int position) {
        this.value = value;
        this.position = position;

    }

    public static MaiorNumero encontreOMaior(int[] nums) {
        int max = nums[0];
        int pos = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                pos = i;
            }
        }
        return new MaiorNumero(max, pos);


    }
}

