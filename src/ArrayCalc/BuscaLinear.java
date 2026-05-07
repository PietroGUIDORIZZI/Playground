package ArrayCalc;

public class BuscaLinear {
    static int buscaLinear(int[] array ,int target){

        int pos = -1;
        for (int i = 0; i < array.length; i++) {
            if(target == array[i]){
                pos = i;
            }
        }
        return pos;
    }
}
