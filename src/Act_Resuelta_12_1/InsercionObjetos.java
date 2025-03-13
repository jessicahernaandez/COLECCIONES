/**/
package Act_Resuelta_12_1;

import java.util.Arrays;


public class InsercionObjetos {
    
    //Datos

    /*Método generico
    -> Recibe como parametro una tabla y un objeto del mismo valor y lo inserta en la última posicion*/
    public static <T> T[] InsercionFinal (T array[], T objeto) {
        
        array = Arrays.copyOf(array, array.length + 1);
        
        array[array.length - 1] = objeto;
        
        return array;     
    }
      
    
    /*Metodo Generico que recibe dos tablas como parametros del mismo tipo y devuelve una concatenadas*/
    public static <T> T[] TablasJuntas (T[] array1, T[] array2) {
        T[] nuevaTabla = Arrays.copyOf(array1, array1.length + array2.length);
        
        System.arraycopy(array2, 0, nuevaTabla, array1.length, array2.length);
        
        return nuevaTabla;
    }
}
