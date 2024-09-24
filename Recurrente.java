import java.util.ArrayList;
public class Recurrente
{
    ArrayList <Integer> numeros = new ArrayList <>();
    int aux = 0;
    boolean bandera = true;
    int aux2 = 0;
    boolean bandera2 = true;
    public int calcularPromedio (int num){  
      conseguirLosNumeros (num, numeros);
      aux2 = numeros.size();
      return calcularPromedio (num ,numeros, aux);
    }
    private int calcularPromedio (int num, ArrayList <Integer> numeros, int aux){
      if(bandera2 == true){  
      if (numeros.size() == aux){
         bandera2 = false; 
         return 0;
        }else{
        if(aux2%2 == 0 ){    
         if(bandera == true){
           bandera = false;    
           return numeros.get(aux) + calcularPromedio (num, numeros, aux+1);
         }else{
           bandera = true;
           return -numeros.get(aux) + calcularPromedio (num, numeros, aux+1);
         }
        }else{
         if(bandera == true){
           bandera = false;    
           return -numeros.get(aux) + calcularPromedio (num, numeros, aux+1);
         }else{
           bandera = true;
           return numeros.get(aux) + calcularPromedio (num, numeros, aux+1);
         }
        }
      }
     }else{
        numeros.clear();
        bandera2 = true;
        return calcularPromedio (num); 
        }
    }
    private ArrayList <Integer> conseguirLosNumeros (int num, ArrayList <Integer> numeros){
        if (num > 0){
           numeros.add(num%10);
           return conseguirLosNumeros(num/10, numeros);
        }else{
          return numeros;
        }
    }  
}
