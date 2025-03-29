/**/
package Act_Ampliacion_12_30;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;


public class FuncionLista {

    /*Metodo estatico que recibe como parametro una lista y la devuelve
    sin repetidos*/
    public static <T> List <T> eliminaRepetidos (List <T> lista) {
        
        /*Creamos un conjunto -> LinkedHashSet porque quiero que respete el orden de insercion
        -> Le pasamos la lista como parametro*/
        Collection <T> sinRepetir = new LinkedHashSet<>(lista); 
        
        /*Creamos una lista donde agregamos todo lo que tenga el conjunto*/
        List <T> listaSinRepetidos = new ArrayList<>();
        listaSinRepetidos.addAll(sinRepetir);
        
        return listaSinRepetidos;
    }
    
    
    public static void main(String[] args) {
        
        /*Lista de Integers*/
        List <Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(2);
        numeros.add(6);
        numeros.add(6);
        numeros.add(5);
        numeros.add(8);
        numeros.add(9);
        numeros.add(5);
        
        System.out.println("Lista Inicial: " + numeros);
        numeros = eliminaRepetidos(numeros);
        System.out.println("Lista sin Repetidos: " + numeros);
        
        
    }
    
}
