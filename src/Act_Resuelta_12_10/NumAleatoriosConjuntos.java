/**/
package Act_Resuelta_12_10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;


public class NumAleatoriosConjuntos {
    
    public static List <Integer> numAleatorios () {
        
        List <Integer> numAleatorios = new ArrayList<>();
        
        Random random = new Random();
        
        for(int i= 0; i <= 20; i++) {
            numAleatorios.add(random.nextInt(10) + 1);
        }
        
        return numAleatorios;
    }

    
    public static void main(String[] args) {
        
        //Lista de numeros Aleatorios
        List <Integer> aleatoriosLista = numAleatorios();
        
        System.out.println("Lista de numeros Aleatorios entre el 1 y 10:");
        System.out.println(aleatoriosLista);
        System.out.println("");
        
        //Los ordenamos con el orden natural
        Comparator<Integer> ordenNatural = Comparator.naturalOrder();
        
        aleatoriosLista.sort(ordenNatural);
        
        System.out.println("Lista ordenada: ");
        System.out.println(aleatoriosLista);
        System.out.println("");
        
        /*Crear un TreeSet para que respete el orden Natural y se pueda agregar sin repetidos*/
        Set<Integer> aleatoriosSinRepetir = new TreeSet<>();
        aleatoriosSinRepetir.addAll(aleatoriosLista);
        
        System.out.println("Lista de Aleatorios sin repetir: ");
        System.out.println(aleatoriosSinRepetir);
        System.out.println("");
        
        /*Conjunto con los numeros repetidos*/
        Set<Integer> aletoriosRepetidos = new TreeSet<>();
         /*El for recorre la lista de el conjunto donde tenemos los elementos sin repetir,
        entonces cada vez que el elemento 'repetido' toma el valor de los elementos que queremos eliminar,
        por eso, utilizamos remove, porque al eliminar solo uno de cada elemento en la lista original quedarian solo los repetidos.*/
        for (Integer repetido : aleatoriosSinRepetir) {
            aleatoriosLista.remove(repetido);
        }
        
        aletoriosRepetidos.addAll(aleatoriosLista);
        System.out.println("Conjunto con los numeros Repetidos: ");
        System.out.println(aletoriosRepetidos);
        System.out.println("");
        
        /*Elementos que aparecen solo una vez en la lista original*/
        Set<Integer> numUnicos = new TreeSet<>();
        numUnicos.addAll(aleatoriosSinRepetir);
        numUnicos.removeAll(aletoriosRepetidos);
        
        System.out.println("Conjunto de numeros no repetidos: " + numUnicos);
        
    }
    
}
