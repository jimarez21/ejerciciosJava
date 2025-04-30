import java.util.Scanner;
public class main
{
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        int x,y,z;
        double r;
        variablesOperadores s1 = new variablesOperadores();
        condicionales prueba = new condicionales();
        /*System.out.println("Hola println");
        System.out.println("Las suma de 8 + 9 es: "+r);
        s1 = new variablesOperadores();
        System.out.println("Ingrese el Radio del circulo: ");
        r = teclado.nextDouble();
        System.out.println("El area del circulo con radio "+r+" es: "+s1.getAreaCirculo(r));
        System.out.println("Ingrese la temperatura en Celsius: ");
        r = teclado.nextDouble();
        System.out.println("La temperatura "+r+" C° en Grados Fahrenheit es: "+s1.temperatura(r));*/
        
        System.out.println("Ingresa un numero para ver si es par o impar:");
        x = teclado.nextInt();
        System.out.println("El numero "+x+" es: "+ prueba.par(x));
        
        System.out.println("Ingresa un numero para ver si es el mayor:");
        x = teclado.nextInt();
        System.out.println("Ingresa el segundo numero:");
        y = teclado.nextInt();
        System.out.println("Ingresa el ultimo numero:");
        z = teclado.nextInt();
        System.out.println("El numero mayor de :"+x+", "+y+" y "+z+" es: "+);
    }
}
