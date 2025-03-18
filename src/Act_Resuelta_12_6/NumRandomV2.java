/**/
package Act_Resuelta_12_6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;


public class NumRandomV2 {
    
    /*Funcion que nos permite rellenar la lista con numeros aleatorios entre 1 y 10*/
    static public void rellenaNumRandom (Collection <Integer> num) {
        
        Random random = new Random ();
        
        for (int i = 0; i < 100; i++) {
            num.add(random.nextInt(10) + 1);
        }      
    }

    
    public static void main(String[] args) {
        
        //Objeto
        Collection <Integer> numerosRandoms = new ArrayList <>();
        
        rellenaNumRandom(numerosRandoms);
        
        System.out.println("Lista Inicial: " + numerosRandoms);
        
        boolean eliminar = numerosRandoms.remove(5);
        
        while (eliminar) {
            eliminar = numerosRandoms.remove(5);
        }
        
        System.out.println("Lista sin numeros '5': " + numerosRandoms);
    }
    
}
