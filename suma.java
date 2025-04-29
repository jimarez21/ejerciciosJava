public class suma
{
    private double resultado;
    public suma()
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
}
