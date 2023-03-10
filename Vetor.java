import java.util.Random;
import java.util.Scanner;
import java.util.Date;

public class Vetor{
    static void geraVetor (int[] v){
        Random random = new Random();
        for (int i=0;i<v.length;i++){
            v[i] = random.nextInt(v.length*10);
        }
    }
    static void exibeVetor(int[] v){
        for (int i=0; i < v.length; i++){
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }
    static void bubbleSort(int[] v){
        for (int i = 1; i < v.length; i++){
            for (int j=0; j < v.length-i; j++){
                if (v[j] > v[j+1]){
                    int aux = v[j];
                    v[j] = v[j+1];
                    v[j+1] = aux;
                }
            }
        }
    }
    static void insertionSort(int[] v){
        for (int i=0; i < v.length; i++){
            int chave = v[i];
            int j = i-1;
            while (j >=0 && v[j] > chave){
                v[j+1] = v[j];
                j -= 1;
            }
            v[j+1] = chave;

        }
    }
    static void selectionSort(int[] v){
        for (int j=0; j< v.length; j++){
            int valorMinimo = j;
            for (int i =j+1;i <v.length; i++){
                if (v[i] < v[valorMinimo]){
                    valorMinimo = i;
                }
                
            }
            int guardaValor = v[j];
            v[j] = v[valorMinimo];
            v[valorMinimo] = guardaValor;
        }
    }
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++){
            int[] v = new int[n];
            long ini = new Date().getTime();
            geraVetor(v);
            // bubbleSort(v);
            // insertionSort(v);
            selectionSort(v);
            long fim = new Date().getTime();
            exibeVetor(v);
            long tempoTotal = fim-ini;
            System.out.println("Tempo: " + tempoTotal + " milissegundos");
        }
        
    }
}