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
    public void tabla(int n){
        System.out.println("Tabla de Multiplicar del "+n);
        for(int x=1;x<=10;x++){
            System.out.println(x+" x "+n+" = "+(n*x));
        }
    }
    public int sumaPar(int n){
        resultado = 0;
        while(n>0){
            if(n%2==0 || n==1){
                resultado = resultado+n;
                //System.out.println("resultado:"+resultado);
            }
            //System.out.println("n:"+n);
            n--;
        }
        return resultado;
    }
    public void triangulo(int n){
        for(int x=1;x<=n;x++){
            int v = x;
            while(v!=0){
                System.out.print("*");
                v--;
            }
            System.out.print("\n");
        }
    }
    public void fibonacci(int n){
        int c1 = 0;
        int c2 = 1;
        int suma = 0;
        System.out.print(c1+", "+c2);
        while(n-2>0) {
            suma = c1 + c2;
            c1 = c2;
            c2 = suma;
            n--;
            System.out.print(", "+suma);
        }
    }
}