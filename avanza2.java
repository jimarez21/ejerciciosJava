
public class avanza2
{
    public avanza2()
    {}
    public void burbuja(int [] lista){
        int aux = 0;
        int aux2= 0;
        int limite = lista.length-1;
        System.out.println("Tamanio: "+limite);
        System.out.println("Lista Desordenada");
        imprimir(lista);
        for(int x=0; x<=limite;x++) {
            aux = lista[x];
            //System.out.println("\nIteracion: "+x);
            for(int y=x+1; y<=limite;y++){
                //System.out.println("Sub-iteracion: "+y);
                if(aux>lista[y]){
                    System.out.println("Comparacion: "+aux+" y "+lista[y]);
                    aux2 = lista[y];
                    lista[y] = aux;
                    aux = aux2;
                    lista[x] = aux;
                    imprimir(lista);
                }
            }
        }
        System.out.println("Lista Ordenada");

        imprimir(lista);
    }
    public static void imprimir(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println(" ");
    }
}
