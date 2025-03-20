/*Método donde probamos los metodos de tabla de la interfaz Collection*/
package Act_Resuelta_12_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Random;


public class TablasyListas {
    
    public static void rellenaNumAleatorios (Collection<Integer> numeros) {
        
        Random random = new Random ();
        
        for (int i = 0; i < 20; i++) {
            numeros.add(random.nextInt(50) + 1);
        }
    }

    
    public static void main(String[] args) {
        
        //Variable de Collection
        Collection <Integer> numerosAleatorios = new ArrayList <>();
        
        //Rellenamos de 20 numeros Aleatorios
        rellenaNumAleatorios(numerosAleatorios);
        
        System.out.println("Lista con 20 numeros Aleatorios: " + numerosAleatorios + "\n");
        
        //Convertir la lista a tabla
        Integer [] tablaNumeros = numerosAleatorios.toArray(new Integer[0]);
        
        System.out.println("Lista convertida en tabla: " + Arrays.deepToString(tablaNumeros) + "\n");
        
        //Ordenarla -> Menor a mayor
        Arrays.sort(tablaNumeros);
        
        System.out.println("Tabla ordenada: " + Arrays.deepToString(tablaNumeros) + "\n");
        
        //Comparator que ordena de mayor a menos "CLASE ANONIMA"
        Comparator <Integer> ordenDecreciente = new Comparator <>() {
            public int compare (Integer num1, Integer num2) {
                return num2 - num1;           
            }
        };
        
        Arrays.sort(tablaNumeros, ordenDecreciente);
        
        System.out.println("Tabla con el orden Decreciente: " + Arrays.deepToString(tablaNumeros) + "\n");
            
        Collection <Integer> otraLista = new ArrayList <>();
        otraLista.addAll(Arrays.asList(tablaNumeros));
        
        System.out.println("Lista de ordenada de manera decreciente: " + otraLista);
                
        
        
        
        
    }
    
}
