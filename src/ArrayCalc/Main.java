package ArrayCalc;


import static ArrayCalc.BubbleSort.bubbleSort;
import static ArrayCalc.BuscaLinear.buscaLinear;
import static ArrayCalc.MaiorNumero.encontreOMaior;
import static ArrayCalc.Media.media;
import static ArrayCalc.MenorNumero.encontreOMenor;
import static ArrayCalc.MostrarArray.Mostrar;

public class Main {
    public static void main(String [] args){
        int [] arrayAleatorio = GerarArray.Gerador(10, 10);
        Mostrar(arrayAleatorio);

        MaiorNumero maior = encontreOMaior(arrayAleatorio);
        System.out.println();

        System.out.println("Maior Valor: "+ maior.value);
        System.out.println("Posição: "+ maior.position);
        System.out.println();

        MenorNumero menor = encontreOMenor(arrayAleatorio);
        System.out.println("Menor Valor: "+ menor.value);
        System.out.println("Posição: "+ menor.position);
        System.out.println();


        int[] arrayBSort = bubbleSort(arrayAleatorio);
        System.out.println("Array Pós Bubble Sort: ");
        System.out.println();
        Mostrar(arrayBSort);
        System.out.println();

        int posBL = buscaLinear(arrayAleatorio, 2);

        if (posBL == -1) {
            System.out.println("Target não encontrado! ");
        } else {
            System.out.printf("Encontrado na busca linear na posição %d\n", posBL);
            System.out.println();
        }

        System.out.printf("A média do array é %.2f\n", media(arrayAleatorio));
    }
}
