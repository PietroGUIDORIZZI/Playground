package ArrayCalc;



public class MostrarArray{
    public static void Mostrar(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Posição: %5d || Valor: %5d\n", i, array[i]);
        }


    }
}
