
public class numeroDigitos
{
    public int contar (int n){
      if (n != 0){
         return 1 + contar (n/10);
        }else{
         return 0;
        }
    }
}
