import java.util.*;

public class generadorPw
{
    public String key;
    public String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public String numeros = "0123456789";
    public String caracteres = "!@#$%^&*()_+-=";   
    public generadorPw()
    {   
        key = "";
    }

    public void generador(){
        Scanner teclado =  new Scanner(System.in);
        int encendido = 6;
        int rasgo = 0;
        while(encendido!=0){
            System.out.println("GENERADOR DE CONTRASEÑAS"+
                "\n ¿Cuantos caracteres desea generar para su clave?"+
                "\n [1] 8 Caracteres"+
                "\n [2] 10 Caracteres"+
                "\n [3] 12 Caracteres"+
                "\n [4] 16 Caracteres"+
                "\n [5] Salir");
            encendido=teclado.nextInt();
            switch(encendido){
                case 1:
                    System.out.println("\n --8 CARACTERES--");
                    System.out.println("\nSELECCIONE LOS CARACTERES A USAR: "+
                        "\n [1] Letras {A-Z, a-z}"+
                        "\n [2] Numeros {0-9}"+
                        "\n [3] Simbolos {!@#$%^&*_+-=}"+
                        "\n [4] Letras y Numeros"+
                        "\n [5] Letras y Simbolos"+
                        "\n [6] Simbolos y Numeros"+
                        "\n [7] Letras, Numeros y Simbolos"+
                        "\n [8] Cancelar");
                    rasgo = teclado.nextInt();

                case 2:
                    System.out.println("\n --10 CARACTERES--");
                    System.out.println("\nSELECCIONE LOS CARACTERES A USAR: "+
                        "\n [1] Letras {A-Z, a-z}"+
                        "\n [2] Numeros {0-9}"+
                        "\n [3] Simbolos {!@#$%^&*_+-=}"+
                        "\n [4] Letras y Numeros"+
                        "\n [5] Letras y Simbolos"+
                        "\n [6] Simbolos y Numeros"+
                        "\n [7] Letras, Numeros y Simbolos"+
                        "\n [8] Cancelar");
                    rasgo = teclado.nextInt();

                case 3:
                    System.out.println("\n --12 CARACTERES--");
                    System.out.println("\nSELECCIONE LOS CARACTERES A USAR: "+
                        "\n [1] Letras {A-Z, a-z}"+
                        "\n [2] Numeros {0-9}"+
                        "\n [3] Simbolos {!@#$%^&*_+-=}"+
                        "\n [4] Letras y Numeros"+
                        "\n [5] Letras y Simbolos"+
                        "\n [6] Simbolos y Numeros"+
                        "\n [7] Letras, Numeros y Simbolos"+
                        "\n [8] Cancelar");
                    rasgo = teclado.nextInt();

                case 4:
                    System.out.println("\n --16  CARACTERES--");
                    System.out.println("\nSELECCIONE LOS CARACTERES A USAR: "+
                        "\n [1] Letras {A-Z, a-z}"+
                        "\n [2] Numeros {0-9}"+
                        "\n [3] Simbolos {!@#$%^&*_+-=}"+
                        "\n [4] Letras y Numeros"+
                        "\n [5] Letras y Simbolos"+
                        "\n [6] Simbolos y Numeros"+
                        "\n [7] Letras, Numeros y Simbolos"+
                        "\n [8] Cancelar");
                    rasgo = teclado.nextInt();

                case 5:
                    System.out.println("ADIOS");
                    encendido = 0;
                    break;
            }
        }
    }

    public int numRandom(int rango){
        return (int)(Math.random()*rango);
    }

    public void tipo(int l, int c){
        switch(c){
            case 1://SOLO LETRAS
                while(l!=key.length()){
                    char temp;
                    temp = letras.charAt(numRandom(letras.length()));
                    String temps = ""+temp;
                    if(numRandom(2)==1){
                        key = key + temps.toLowerCase();
                    }else {
                        key = key + temps.toUpperCase();
                    }
                }
                System.out.println("PW: "+key);
                break;

            case 2://SOLO NUMEROS
                while(l!=key.length()){
                    char temp;
                    temp = numeros.charAt(numRandom(numeros.length()));
                    key = key + temp;
                }
                System.out.println("PW: "+key);
                break;

            case 3://SOLO CARACTERES
                while(l!=key.length()){
                    char temp;
                    temp = caracteres.charAt(numRandom(caracteres.length()));
                    key = key + temp;
                }
                System.out.println("PW: "+key);
                break;

            case 4://LETRAS Y NUMEROS
                while(l!=key.length()){
                    if(numRandom(2)==1){
                        char temp;
                        temp = letras.charAt(numRandom(letras.length()));
                        String temps = ""+temp;
                        if(numRandom(2)==1){
                            key = key + temps.toLowerCase();
                        }else {
                            key = key + temps.toUpperCase();
                        }
                    } else{
                        char temp;
                        temp = numeros.charAt(numRandom(numeros.length()));
                        key = key + temp;
                    }
                }
                System.out.println("PW: "+key);
                break;

            case 5://LETRAS Y CARACTERES
                while(l!=key.length()){
                    if(numRandom(2)==1){
                        char temp;
                        temp = letras.charAt(numRandom(letras.length()));
                        String temps = ""+temp;
                        if(numRandom(2)==1){
                            key = key + temps.toLowerCase();
                        }else {
                            key = key + temps.toUpperCase();
                        }
                    } else{
                        char temp;
                        temp = caracteres.charAt(numRandom(caracteres.length()));
                        key = key + temp;
                    }
                }
                System.out.println("PW: "+key);
                break;

            case 6://NUMEROS Y CARACTERES
                while(l!=key.length()){
                    if(numRandom(2)==1){
                        char temp;
                        temp = numeros.charAt(numRandom(numeros.length()));
                        key = key + temp;
                    } else{
                        char temp;
                        temp = caracteres.charAt(numRandom(caracteres.length()));
                        key = key + temp;
                    }
                }
                System.out.println("PW: "+key);
                break;

            case 7://LETRAS, NUMEROS Y CARACTERES
                while(l!=key.length()){
                    int aleatorio = numRandom(3);
                    if(aleatorio==1){
                        char temp;
                        temp = letras.charAt(numRandom(letras.length()));
                        String temps = ""+temp;
                        if(numRandom(2)==1){
                            key = key + temps.toLowerCase();
                        }else {
                            key = key + temps.toUpperCase();
                        }
                    } else if (aleatorio==2){
                        char temp;
                        temp = numeros.charAt(numRandom(numeros.length()));
                        key = key + temp;
                    } else{
                        char temp;
                        temp = caracteres.charAt(numRandom(caracteres.length()));
                        key = key + temp;
                    }
                }
                System.out.println("PW: "+key);
                break;
        }
    }
}
