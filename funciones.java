public class funciones
{
    int res;
    public funciones(){
        res=0;
    }
    public boolean primo(int n){
        int cont = n-1;
        while(cont>1){
            if(n%cont==0){
                return false;
            }
            cont--;
        }
        return true;
    }
    public boolean palindromo(String palabra){
        int i = 0;
        int f = palabra.length();
        while (i<f){
            char temp = palabra.charAt(i);
            if(temp == palabra.charAt(f)){
                i++;
                f--;
            } else{
                return false;
            }
        }
        return true;
    }
}
