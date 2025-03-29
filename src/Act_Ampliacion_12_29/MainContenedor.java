/*Main para poner a prueba los dos nuevos metodos de la clase Contenedor*/
package Act_Ampliacion_12_29;

import java.util.Arrays;
import java.util.Random;


public class MainContenedor {
    
    /*Metodo que rellena la tabla con numeros aleatorios entre 1 y 6*/
    public static void rellenaTablaRandom (Integer [] tabla) {
        
        Random random = new Random ();
        
        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = random.nextInt(6) + 1;
        }
    }

    
    public static void main(String[] args) {
        
        //Tabla para guardarla en la clase Contenedor
        Integer [] numeros = new Integer[10];
        
        rellenaTablaRandom(numeros);
        Arrays.sort(numeros);
        
        System.out.println("Tabla inicial: " + Arrays.toString(numeros));
        
        /*Guardamos la tabla en la clase Contenedor*/
        Contenedor<Integer> contenedor = new Contenedor<>(numeros);
        
        int [] indicesEncontrados = contenedor.buscarTodos(4);
        
        System.out.println("Indices del numero 4: " + Arrays.toString(indicesEncontrados));
        
        System.out.println("Intentado eliminar el numero 5 de la tabla, ¿Se modifico?: " + contenedor.eliminarTodos(5));
        System.out.println(Arrays.toString(contenedor.objetos));
    }
    
}
