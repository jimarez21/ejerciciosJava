public class bucles
{
    int resultado;
    public bucles(){
        resultado = 0;
    }
    public int factorial(int x) {
        /* METODO RECURSIVO
        if(x==1){
            return x;
        } else {
            return x * factorial(x-1);
        }*/
        resultado = x;
        while(x>1){
            resultado = resultado*(x-1);
            x=x-1;
            System.out.println(resultado);
        }
        return resultado;
    }
}