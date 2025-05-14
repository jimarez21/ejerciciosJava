
public class avanza2
{
    public avanza2()
    {}
    public void burbuja(int [] lista){
        int aux = 0;
        int aux2= 0;
        int aux3= 0;
        int limite = lista.length-1;
        System.out.println("Tamanio: "+limite);
        System.out.println("Lista Desordenada");
        imprimir(lista);
        for(int x=0;x<=lista.length-1;x++){
            aux = lista[0];
            for(int y=0;y<=limite;y++){
                aux2 = lista[y];
                if(aux>aux2){
                    lista[y] = aux;
                    lista[y-1] = aux2;
                    //System.out.println("Aux 1: "+aux);
                    //System.out.println("Aux 2: "+aux2);
                    imprimir(lista);
                }
            }
            limite--;
        }
        System.out.println("\nLista Orednada");
        imprimir(lista);
    }
    public static void imprimir(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println(" ");
    }
}
