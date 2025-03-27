/* */
package Act_Resuelta_12_12;

import java.util.HashSet;
import java.util.Set;


public class MetodosEstaticosHashSet {
    
    /*Metodo generico de Union
    -> Devuelve un conjunto de genericos y recibe 2 parametros de Conjuntos Genericos
    -> Une los dos conjuntos que se han pasado como parámetro*/
    static <E> Set <E> union (Set <E> conjunto1, Set <E> conjunto2) {
        Set <E> unionConjuntos = new HashSet <>();
        unionConjuntos.addAll(conjunto1);
        unionConjuntos.addAll(conjunto2);
        
        return unionConjuntos;
    }

    /*Método generico de Interseccion 
    -> Devuelve un conjunto de genericos y recibe 2 parametros de Conjuntos Genericos
    -> Borra los elementos del conjunto 2 excepto los que tenia en comun con el conjunto 1*/
    static <E> Set <E> interseccion (Set <E> conjunto1, Set <E> conjunto2) {
        /*Se inicializa el HashSet con el conjunto1*/
        Set <E> interseccionConjuntos = new HashSet <>(conjunto1);
        /*RemoveAll: elimina todos los elementos del conjunto invocante, salvo los que 
        tenga en comun con el conjunto2 (pasado como parametro)*/
        interseccionConjuntos.retainAll(conjunto2);
        
        return interseccionConjuntos;
    }
    
    public static void main(String[] args) {
        
        //Conjuntos de Integers
        Set <Integer> conjuntoUno = new HashSet <>();
        conjuntoUno.add(36);
        conjuntoUno.add(12);
        conjuntoUno.add(35);
        conjuntoUno.add(78);
        
        System.out.println("Conjunto 1: " + conjuntoUno);
        
        Set <Integer> conjuntoDos = new HashSet <>();
        conjuntoDos.add(78);
        conjuntoDos.add(35);
        conjuntoDos.add(5);
        conjuntoDos.add(9);
        
        System.out.println("Conjunto 2: " + conjuntoDos);
        
        Set <Integer> Unidos = union(conjuntoUno, conjuntoDos); 
        System.out.println("Conjuntos Unidos: " + Unidos);
        
        Set <Integer> Interseccion = interseccion(conjuntoUno, conjuntoDos); 
        System.out.println("Conjuntos Interseccion: " + Interseccion);

    }
    
}
