/**/
package Act_Resuelta_12_2y12_11;

import java.util.Arrays;


public class Main {

    
    public static void main(String[] args) {
        
        //Crear la tabla que pasaremos como parametro al constructor de la clase Contenedor
        Integer [] numeros = {3, 14, 23, 10};
        System.out.println("Tabla inicial: " + Arrays.toString(numeros));
        
        Contenedor <Integer> contenedor1 = new Contenedor <> (numeros);
        
        contenedor1.ordenar();
        System.out.println("Tabla ordenada: " + Arrays.toString(numeros));
        System.out.println("");
        
        System.out.println("Inserccion al Principio...");
        contenedor1.insertarAlPrincipio(17);
        System.out.println(contenedor1.toString() + "\n");
        System.out.println("Inserccion al Principio...");
        contenedor1.insertarAlPrincipio(22);
        System.out.println(contenedor1.toString() + "\n");
        System.out.println("Inserccion al Final...");
        contenedor1.insertarAlFinal(59);
        System.out.println(contenedor1.toString() + "\n");
        System.out.println("Inserccion al Final...");
        contenedor1.insertarAlFinal(89);
        System.out.println(contenedor1.toString() + "\n");
        
        Integer obPrincipio = contenedor1.extraerDelPrincipio();
        System.out.println("Extraemos el primer elemento: " + obPrincipio);
        Integer obFinal = contenedor1.extraerDelFinal();
        System.out.println("Extraemos el ultimo elemento: " + obFinal);
        
    }
    
}
