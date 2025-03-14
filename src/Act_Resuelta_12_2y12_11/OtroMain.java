/*Este main utiliza la clase del Contenedor para enviar una tabla con numeros aleatorios*/
package Act_Resuelta_12_2y12_11;

import java.util.Arrays;
import java.util.Random;


public class OtroMain {
    
    /*Rellena la tabla que se pasa com,o parametro con numeros aleatorios entre 1 y 10*/
    public static void numAleatorios (Integer [] array) {
        
        Random random = new Random();
        
        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1;
        }
    }

    
    public static void main(String[] args) {
        
        Integer [] numeros = new Integer [30];
        
        //Rellenamos la tabla
        numAleatorios(numeros);
        
        System.out.println("Tabla Inicial con numeros Aleatorios: " + Arrays.toString(numeros));
        
        Contenedor <Integer> c1 = new Contenedor <> (numeros);
        
        c1.ordenar();
        
        System.out.println("Tabla ordenada: " + c1.toString());
    }
    
}
