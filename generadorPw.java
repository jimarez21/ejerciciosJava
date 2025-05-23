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
    public void generador(int l, int c){
        int randomNum = (int)(Math.random() * 11);
        switch(c){
            case 1:
                while(l=!)
        }
    }
}
