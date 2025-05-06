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
    public void invertir(String [] lista){
        String [] invertida = lista;
        int cont=0;
        imprimir(lista);
        imprimir(invertida);
        for(int x = lista.length-1;x>=0;x--){
            System.out.println("X: "+x);
            System.out.println("Cont: "+cont);
            invertida[cont] = lista[x];
            System.out.println("lista: "+x);
            //System.out.println(lista[x]);
            cont++;
        }
        imprimir(lista);
        imprimir(invertida);
    }
    public void imprimir(String[] lista){
        System.out.print("{");
        for(int x=0;x<lista.length;x++){
            if(x==lista.length-1){
                System.out.print(lista[x]);
            }else{
                System.out.print(lista[x]+",");
            }
        }
        System.out.println("}");
    }
}