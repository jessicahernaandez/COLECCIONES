/**/
package Act_Resuelta_12_4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class ListaNumUsuarios {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*Lista
        -> Utilizamos una variable de Collection para utilizar sus metodos*/
        Collection<Integer> numeros = new ArrayList<>();

        Integer opcion = 0;

        System.out.println("¡LISTAS!");

        while (opcion != -1) {
            System.out.println("Introduce un numero entero positivo (-1 para terminar): ");
            opcion = sc.nextInt();
            
            if (opcion >= 0 && opcion != -1) {
                numeros.add(opcion);
            } else {
                System.out.println("Introduce un numero positivo.");
            }
        }
        
        System.out.println("Introduciste el valor '-1' \n" );
        System.out.println("Lista Actual: " + numeros + "\n");
        System.out.println("Mostrando valores pares y eliminamos todos los multiplos de 3...");
        
        //Objeto para recorrer y eliminamos los multiplos
        Iterator <Integer> recorreNumeros = numeros.iterator();
        
        System.out.println("Valores pares: ");
        
        for (Integer par : numeros) {
            if (par % 2 == 0) {
                System.out.println(par);
            }
        }
        
        
        System.out.println("");
        
        while (recorreNumeros.hasNext()) {
            opcion = recorreNumeros.next();
            if (opcion % 3 == 0) {
                recorreNumeros.remove();
            }
        }
       
        System.out.println("Tabla sin multiplos de 3: " + numeros);

    }

}
