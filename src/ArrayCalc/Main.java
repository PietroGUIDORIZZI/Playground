package ArrayCalc;


import static ArrayCalc.BubbleSort.bubbleSort;
import static ArrayCalc.MaiorNumero.encontreOMaior;
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
        Mostrar(arrayBSort);
    }
}
