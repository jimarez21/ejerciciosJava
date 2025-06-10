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
    }
    String getNombre(){
        return nombre;
    }
    void setEdad(int edad){
        validaEdad(edad);
    }
    int getEdad(){
        return edad;
    }
    void setGenero(String genero){
        this.genero = genero;
    }
    String getGenero(){
        return genero;
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
