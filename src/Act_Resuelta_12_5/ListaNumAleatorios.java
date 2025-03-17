/**/
package Act_Resuelta_12_5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;


public class ListaNumAleatorios {
    
    static void rellenaNumAleatorios (Collection<Integer> num) {
        
        Random random = new Random ();
        
        for(int i = 0; i < 20; i++) {
            num.add(random.nextInt(10) + 1);
        }
    }

    
    public static void main(String[] args) {
        
        /*Lista de Integer
        -> ArrayList admite repetidos*/
        Collection <Integer> numerosRandoms = new ArrayList <>();
        //rellenamos
        rellenaNumAleatorios(numerosRandoms);
        
        System.out.println("Tabla con numeros Randoms (repetidos): " + numerosRandoms);
        
        System.out.println("");
        
        //Creamos una nueva lista donde no estaran los numeros repetidos 
        Collection <Integer> randomsSinRepetir = new ArrayList <>();
        
        //Recorremos la lista con numeros Randoms Repetidos con un bucle for-each
        for (Integer e : numerosRandoms) {
            if (!randomsSinRepetir.contains(e)) { //Si en la nueva lista no se encuentra el valor 
                randomsSinRepetir.add(e); //Lo agregamos y guardamos
            }
        }
        
        System.out.println("Lista de numeros Randoms sin repetir: " + randomsSinRepetir);
        
        
    }
    
}
