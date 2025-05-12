import java.util.*;
import java.util.Arrays;

public class arreglos
{
    int res;
    public arreglos()
    {
        res = 0;
    }
    public int sumaArray(int [] lista) {
        for(int x=lista.length-1;x>=0;x--){
            res = res+lista[x];
        }
        return res;
    }
    public int mayor(int [] lista){
        int n=lista[0];
        for(int x=lista.length-1;x>=0;x--){
            if(n<lista[x]){
                n = lista[x];
            }
        }
        return n;
    }
    public void invertir(int [] lista){
        int aux = 0;
        int inicio = 0;
        int fin = lista.length-1;
        System.out.println("\n Arreglo original: ");
        imprimir(lista);
        while(inicio < fin) {
            aux = lista[inicio];
            lista[inicio]=lista[fin];
            lista[fin]=aux;
            inicio++;
            fin--;
        }
        System.out.println("\n Arreglo invertido: ");
        imprimir(lista);
    }
    public static void imprimir(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public int concurrencia(int [] lista, int elemento){
        int cont=0;
        for(int num : lista){
            if(num==elemento){
                cont++;
            }
        }
        return cont;
    }
}