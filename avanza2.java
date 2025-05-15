import java.util.ArrayList;

public class avanza2
{
    public avanza2(){}
    public void burbuja(int [] lista){
        boolean orden;
        int aux = 0;
        int limite = lista.length;
        System.out.println("Tamanio: "+limite);
        System.out.println("Lista Desordenada");
        imprimir(lista);        
        for (int x=0;x<limite-1;x++) {
            orden = false;
            for (int y=0;y<limite-x-1;y++) {
                //Fallo Imperante
                if (lista[y]>lista[y+1]) {
                    aux = lista[y];
                    lista[y] = lista[y+1];
                    lista[y+1] = aux;
                    orden = true;
                    imprimir(lista);
                }
            }
            if (!orden) break;
        }
        imprimir(lista);
    }
    public void busqueda(int [][] matriz, int target){
        int aux = 0;
        int limite = matriz.length;
        for(int x=0;x<limite;x++){
            for(int y=0;y<matriz[x].length;y++){
                aux = matriz[x][y];
                if(target == aux){
                    System.out.println("Posicion : ("+x+","+y+").");
                    break;
                } else {
                    if(y == matriz[x].length && x == limite){
                        System.out.println("No se encuntra en la Matriz.");
                    }
                }
            }
        }
    }
    public void frecDicc(String palabra){
        int size = palabra.length();
        int cont = 0;
        char [] letras = palabra.toCharArray();
        ArrayList <Integer> incidencias = new ArrayList<Integer>();
        /*
        for(int x = 0; x < size; x++){
            char temp = letras[x];
            for(int y = 0; y < size; y++){
                if(temp == letras[y]){
                    cont++;//SOLO CONTEO
                }
            }
            incidencias.add(cont);
            cont = 0;
        }
        */
        for(int i = 0; i < letras.length; i++){
            System.out.println
        }
        System.out.println("Incidencias");
        imprimirChar(letras);
        for (int i : incidencias){
            System.out.print(i + " ");
        }
    }
    public static void imprimir(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println(" ");
    }
    public static void imprimirChar(char[] arr) {
        for (char num : arr) {
            System.out.print(num + " ");
        }
        System.out.println(" ");
    }
}
