import java.util.Scanner;
import java.util.Arrays;

public class main {
    public static void main(String[]args) {
        Scanner teclado = new Scanner(System.in);
        int x,y,z;
        String sx,sy,sz;
        double r;
        variablesOperadores s1 = new variablesOperadores();
        condicionales p = new condicionales();
        bucles pb = new bucles();
        arreglos pa = new arreglos();
        funciones fun = new funciones();
        avanza2 av = new avanza2();
        generadorPw gp= new generadorPw();
        persona persona1 = new persona("Ana", 25, "Femenino");
        estudiante estudiante1 = new estudiante("Ingenieria",7.5,"Luis",20,"Masculino");
        /*System.out.println("Hola println");
        System.out.println("Las suma de 8 + 9 es: "+r);
        s1 = new variablesOperadores();
        System.out.println("Ingrese el R adio del circulo: ");
        r = teclado.nextDouble();
        System.out.println("El area del circulo con radio "+r+" es: "+s1.getAreaCirculo(r));
        System.out.println("Ingrese la temperatura en Celsius: ");
        r = teclado.nextDouble();
        System.out.println("La temperatura "+r+" C° en Grados Fahrenheit es: "+s1.temperatura(r));*/

        /*
        System.out.println("Ingresa un numero para ver si es par o impar:");
        x = teclado.nextInt();
        System.out.println("El numero "+x+" es: "+ p.par(x));
         */
        /*
        System.out.println("Ingresa un numero para ver si es el mayor:");
        x = teclado.nextInt();
        System.out.println("Ingresa el segundo numero:");
        y = teclado.nextInt();
        System.out.println("Ingresa el ultimo numero:");
        z = teclado.nextInt();
        System.out.println("El numero mayor de: "+x+", "+y+" y "+z+" es: "+p.mayor(x,y,z));

        System.out.println("Año bisiesto");
        System.out.print("Ingresa un anio año, para saber si es bisiesto: ");
        x = teclado.nextInt();
        System.out.println("El año "+x+" "+ (p.bisiesto(x)==true? "es bisiesto":"no es biciesto"));
         */
        /*
        System.out.println("Numero Factorial");
        System.out.print("Ingresa un numero: ");
        x = teclado.nextInt();
        System.out.println("El factorial del numero "+x+" es: "+pb.factorial(x));
         */
        /*
        System.out.print("Ingrese un numero para multiplicar: ");
        x = teclado.nextInt();
        pb.tabla(x);
         */
        /*
        System.out.print("Ingresa un nuemero para sumar sus pares: ");
        x = teclado.nextInt();
        System.out.println(pb.sumaPar(x));
         */
        /*
        System.out.print("Ingresa el numero de pisos: ");
        x=teclado.nextInt();
        pb.triangulo(x);
        */
        /*
        System.out.println("Serie Fibonacci de: ");
        x=teclado.nextInt();
        pb.fibonacci(x);
        */
        /*
        int [] lista = {5,5,5,5,5};
        System.out.println(pa.sumaArray(lista));
        */
        /*
        int [] lista = {9,7,5,88,3,8    };
        pa.invertir(lista);
        
        int [] lista = {9,7,5,88,3,8,4,3,5,3,6};
        System.out.println("Con currencia: "+pa.concurrencia(lista,9));
        */
        /*
        System.out.println("Ingrese un numero para ver si es primo: ");
        x = teclado.nextInt();
        System.out.println("El numero es "+ (fun.primo(x)==true ? "Primo" : "NO es Primo"));
        
        System.out.println("Ingrese un numero para ver si es primo: ");
        x = teclado.nextInt();
        System.out.println("El numero es "+ (fun.primo(x)==true ? "Primo" : "NO es Primo"));
        
        System.out.println("Ingresa una palabra: ");
        sx = teclado.nextLine();
        System.out.println("La palabra es "+ (fun.palindromo(sx)==true ? "Palindromo" : "NO es Palindromo"));
        
        fun.calculadora();
        */
       
        /*
        
        //int [] lista = {10,9,8,7,6,5,4,3,2,1};
        int [] lista = {9,7,5,88,3,8,4,3,5,3,6};
        av.burbuja(lista);
        
        int [][] lista = {{3,5,6,7,7,8},
                            {6,9,0,4,6,8},
                            {4,7,9,8,3,4}};
        av.busqueda(lista, 0);
        
        av.frecDicc("PARANGARICUTIMIRICUARO");
        
        gp.tipo(16,7);  
        
       
        persona persona1 = new persona("Ana", 25, "Femenino");
        persona1.saludar();
        System.out.println(persona1.esMayorDeEdad());
        */
        estudiante1.saludar();
        estudiante1.estudiar();
    }
}
