
package Act_Aplicion_12_27;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class LeeCadenaVersiones {
    
    /*Metodo de la actividad de aplicacion 12_27*/
    public static List <Character> leeCadena () {
        List<Character> listaCaracteres = new ArrayList<>();
        
        //Leer la cadena desde el teclado
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce una cadena: ");
        String cadena = sc.nextLine();
        
        //Convertir la cadena en una lista de caracteres
        for (int i = 0; i < cadena.length(); i++) {
            listaCaracteres.add(cadena.charAt(i));
        }
        
        return listaCaracteres;
    }
    
    /*Método que recibe una cadena como parámetro 
    -> El mismo protitpo a diferencia que esta recibe una cadena como parametro*/
    public static List<Character> leeCadena(String cadena) {
        List<Character> listaCaracteres = new ArrayList<>();
        
        //Convertir la cadena en una lista de caracteres
        for (int i = 0; i < cadena.length(); i++) {
            listaCaracteres.add(cadena.charAt(i));
        }
        
        return listaCaracteres;
    }

    /*Main donde probamos ambos metodos*/
    public static void main(String[] args) {
        //Prueba del primer método (leyendo desde el teclado) -> Original de la actividad de aplicacion
        System.out.println("Prueba de metodo leeCadena() leyendo desde el teclado:");
        List<Character> listaMetodoOriginal = leeCadena();
        System.out.println("Resultado: " + listaMetodoOriginal);
        System.out.println("");

        //Prueba del segundo método (recibiendo un String como parámetro) -> Segunda version del metodo
        System.out.println("Prueba de leeCadena() con parámetro:");
        String cadenaMetodoDos = "Lunita es traviesa";
        List<Character> lista2 = leeCadena(cadenaMetodoDos);
        System.out.println("Cadena de entrada: " + cadenaMetodoDos);
        System.out.println("Resultado: " + lista2);
    }
}
    

