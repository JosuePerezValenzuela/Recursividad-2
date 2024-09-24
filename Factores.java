import java.util.ArrayList;
public class Factores
{
  ArrayList <Integer> num = new ArrayList <> ();
  int aux = 2;
  public ArrayList <Integer> factores (int n){
    return factores (n, num,aux);
  }
  private ArrayList <Integer> factores (int n, ArrayList <Integer> num, int aux){
    if (n == 1){  
      return num;
    }else{
      if (n%aux == 0){
          num.add(aux);
          return factores (n/aux, num, aux);
      }
      else{
         return factores (n, num, aux + 1);
        }
    }
  }
  public void imprimir (){
    System.out.print (num);
    }
}
