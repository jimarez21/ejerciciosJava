import java.util.Scanner;
public class main
{
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Hola println");
        suma s1 = new suma();
        double r = s1.getSuma(8,9);
        System.out.println("Las suma de 8 + 9 es: "+r);
        s1 = new suma();
        System.out.println("Ingrese el Radio del circulo: ");
        r = teclado.nextDouble();
        System.out.println("El area del circulo con radio "+r+" es: "+s1.getAreaCirculo(r));
    }
}
