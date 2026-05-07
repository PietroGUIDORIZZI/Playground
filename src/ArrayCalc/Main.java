package ArrayCalc;


import static ArrayCalc.MaiorNumero.encontreOMaior;
import static ArrayCalc.MostrarArray.Mostrar;

public class Main {
    public static void main(String [] args){
        int [] arrayAleatorio = GerarArray.Gerador(1000, 100);
        Mostrar(arrayAleatorio);

        MaiorNumero maior = encontreOMaior(arrayAleatorio);
        System.out.println("Maior Valor: "+ maior.value);
        System.out.println("Posição: "+ maior.position);
    }
}
