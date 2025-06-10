public class estudiante extends persona
{
    String carrera;
    double promedio;
    public estudiante(){    }
    public estudiante(String carrera, double promedio, String nombre, int edad, String genero)
    {
        super(nombre, edad, genero);
        this.carrera = carrera;
        this.promedio = promedio;
    }
    void estudiar(){
        System.out.println("Estoy estudiando "+carrera);
    }
    boolean aprobo(){
        if(promedio>=6.0)
            return true;
        return false;
    }
    void setCarrera(String carrera){
        this.carrera=carrera;
    }
    String getCarrera(){
        return carrera;
    }
    void setPromedio(){
        this.promedio=promedio;
    }
    double getPromedio(){
        return promedio;
    }
}