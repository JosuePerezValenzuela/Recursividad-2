
public class Primo
{
    int aux;
    public boolean esPrimo(int n)
    {
           aux = n-1;
           return esPrimo (n, aux);
    }
    private boolean esPrimo (int n,int aux){
           if(aux == 2 && n%2 != 0){
              return true;
            }else if (n %aux == 0){
                return false;
            }else{
              return esPrimo (n, aux -1);
            }  
    }
    }
