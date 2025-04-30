public class condicionales
{
    public condicionales(){}
    public String par(int n){
        /*
        if(n%2==0) {
            return "Par";
        }
        return "Impar";*/
        return n%2==0 ? "Par" : "Impar";
    }
    public int mayor(int a, int b, int c){
        if(a>b){
            if(a>c){
                return a;
            }else {
                return c;
            }
        } else{
            if(b>c){
                return b;
            } else {
                return c;
            }
        }
    }
}
