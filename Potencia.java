
public class Potencia
{
    public int potencia (int a, int b){
       if(a == 0){
          return 0;
        }else{
         if(b == 0){
            return 1; 
         }else{
            if (b == 1){
             return a;
            }else{
             return a + potencia (a,b-1);
            }
            }
        }
    }
}
