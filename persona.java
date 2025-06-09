import java.util.Scanner;

public class persona
{
    String nombre;
    int edad;
    String genero;
    public persona(){}
    public persona(String nombre, int edad, String genero)
    {
        this.nombre = nombre;
        validaEdad(edad);
        this.genero = genero;
    }
    void saludar(){
        System.out.println("Hola, soy "+nombre+" y tengo "+edad+" años.");
    }
    boolean esMayorDeEdad(){
        if(edad>=18)
            return true;
        return false;
    }
    void setNombre(String nombre){
        this.nombre=nombre;
        System.out.println("Ahora el nombre es: "+nombre);
    }
    void setEdad(int edad){
        validaEdad(edad);
        System.out.println("Ahora la edad es: "+edad);
    }
    void validaEdad(int e){
        if(e>0)
            edad=e;
        else{
            System.out.print("La edad no puede ser menor a 0"+
                                "\nIngrese una edad valida: ");
            Scanner teclado = new Scanner(System.in);
            int temp = teclado.nextInt();
            validaEdad(temp);
        }
    }
}
