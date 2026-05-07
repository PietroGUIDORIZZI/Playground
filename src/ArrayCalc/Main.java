package ArrayCalc;


import static ArrayCalc.MaiorNumero.encontreOMaior;
import static ArrayCalc.MenorNumero.encontreOMenor;
import static ArrayCalc.MostrarArray.Mostrar;

public class Main {
    public static void main(String [] args){
        int [] arrayAleatorio = GerarArray.Gerador(1000, 100000);
        Mostrar(arrayAleatorio);

        MaiorNumero maior = encontreOMaior(arrayAleatorio);
        System.out.println("Maior Valor: "+ maior.value);
        System.out.println("Posição: "+ maior.position);

        MenorNumero menor = encontreOMenor(arrayAleatorio);
        System.out.println("Menor Valor: "+ menor.value);
        System.out.println("Posição: "+ menor.position);

    }
}
