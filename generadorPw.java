import java.util.*;

public class generadorPw
{

    public String key;
    
    public generadorPw()
    {   
        key = "";
    }
    
    public void generador(){
        Scanner teclado =  new Scanner(System.in);
        int encendido = 6;
        double x,y;
        while(encendido!=0){
            System.out.println("GENERADOR"+
                            "\n ¿Cuantos caracteres desea generar para su clave?"+
                            "\n [1] 8 Caracteres"+
                            "\n [2] 10 Caracteres"+
                            "\n [3] 12 Caracteres"+
                            "\n [4] 16 Caracteres"+
                            "\n [5] Salir");
            encendido=teclado.nextInt();
            switch(encendido){
                case 1:
                    System.out.println("\n --SUMA--");
                    System.out.println("\nIngrese la primera cantidad a sumar: ");
                    x = teclado.nextDouble();
                    System.out.println("Ingrese la segunda cantidad a sumar: ");
                    y = teclado.nextDouble();
                    System.out.println(" "+x+" + "+y+" = "+(x+y));
                    System.out.println("¿Desea hacer otra operacion?"+
                                        "\n [1] SI"+
                                        "\n [2] NO");
                    encendido = teclado.nextInt();
                    if(encendido == 2){
                        encendido = 0;
                    }
                    break;
                
                case 2:
                    System.out.println("\n --RESTA--");
                    System.out.println("\nIngrese la primera cantidad a restar: ");
                    x = teclado.nextDouble();
                    System.out.println("Ingrese la segunda cantidad a restar: ");
                    y = teclado.nextDouble();
                    System.out.println(" "+x+" - "+y+" = "+(x-y));
                    System.out.println("¿Desea hacer otra operacion?"+
                                        "\n [1] SI"+
                                        "\n [2] NO");
                    encendido = teclado.nextInt();
                    if(encendido == 2){
                        encendido = 0;
                    }
                    break;
                    
                case 3:
                    System.out.println("\n --MULTIPLICACION--");
                    System.out.println("\nIngrese la primera cantidad: ");
                    x = teclado.nextDouble();
                    System.out.println("Ingrese la segunda cantidad: ");
                    y = teclado.nextDouble();
                    System.out.println(" "+x+" x "+y+" = "+(x*y));
                    System.out.println("¿Desea hacer otra operacion?"+
                                        "\n [1] SI"+
                                        "\n [2] NO");
                    encendido = teclado.nextInt();
                    if(encendido == 2){
                        encendido = 0;
                    }
                    break;
                    
                case 4:
                    System.out.println("\n --DIVISION--");
                    System.out.println("\nIngrese el dividendo: ");
                    x = teclado.nextDouble();
                    System.out.println("Ingrese el divisor: ");
                    y = teclado.nextDouble();
                    System.out.println(" "+x+"/"+y+" = "+(x/y));
                    System.out.println("¿Desea hacer otra operacion?"+
                                        "\n [1] SI"+
                                        "\n [2] NO");
                    encendido = teclado.nextInt();
                    if(encendido == 2){
                        encendido = 0;
                    }
                    break;
                    
                case 5:
                    System.out.println("ADIOS");
                    encendido = 0;
                    break;
            }
        }
    }
    public void generador(int n){
        
    }
}
