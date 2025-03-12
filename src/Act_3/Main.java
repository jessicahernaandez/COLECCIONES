/*Prueba de la clase busquedaElementos, que contiene un metodo estatico generico*/
package Act_3;


import java.util.Arrays;
import java.util.Random;


public class Main {
    
    /*Metodo que genera numero randoms y rellena el array.*/
    public static void numRandoms (Integer [] array) {
        
        Random random = new Random ();
        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50) + 1;
        }
        
    }

    
    public static void main(String[] args) {
        

        Integer[] numeros = new Integer [10];
        
        //Rellena el array de numeros randoms
        numRandoms(numeros);
        
        System.out.println(Arrays.toString(numeros));
        
        System.out.println("¿Contiene el numero 23?: " + BusquedaElementos.contiene(numeros, 23));
        
        String [] palabras = new String[] {"Luna", "Estrella", "Sol"};
        
        System.out.println("¿Contiene la palabra 'Luna'?: " + BusquedaElementos.contiene(palabras, "Luna"));
        
    }
    
}
