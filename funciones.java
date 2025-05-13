import java.util.Scanner;
public class funciones
{
    int res;
    public funciones(){
        res=0;
    }
    public boolean primo(int n){
        int cont = n-1;
        while(cont>1){
            if(n%cont==0){
                return false;
            }
            cont--;
        }
        return true;
    }
    public boolean palindromo(String palabra){
        int i = 0;
        int f = palabra.length()-1;
        while (i<f){
            char temp = palabra.charAt(i);
            if(temp == palabra.charAt(f)){
                i++;
                f--;
            } else{
                return false;
            }
        }
        return true;
    }
    public void calculadora(){
        Scanner teclado =  new Scanner(System.in);
        int encendido = 6;
        double x,y;
        while(encendido!=0){
            System.out.println("CALCULADORA"+
                            "\n ¿Que operacion desea realizar?"+
                            "\n [1] Suma"+
                            "\n [2] Resta"+
                            "\n [3] Multiplicacion"+
                            "\n [4] Division"+
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
}
