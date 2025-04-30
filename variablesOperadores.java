public class variablesOperadores
{
    private double resultado;
    public variablesOperadores()
    {
        resultado = 0;
    }
    public double getSuma(int x, int y)
    {
        resultado = x+y;
        return resultado;
    }
    public double getAreaCirculo(double r)
    {
        resultado = Math.PI*r*r;
        return resultado;
    }
    public double temperatura(double g)
    {
        return g*9/5+32;
    }
}
