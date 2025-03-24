/**/
package Act_aplicacion_12_28;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class UneCadenas {
    
    /*Devuelve una lista con las 2 listas que recibe como parametros unidas*/
    public static List <Character> uneCadenas (List<Character> cad1, List <Character> cad2) {
        
        List <Character> listasJuntas = new ArrayList<>();
        
        //Primera cadena en listasJuntas
        listasJuntas.addAll(cad1);
        //Segunda cadena en listasJuntas
        listasJuntas.addAll(cad2);
        
        return listasJuntas;
    }
    
    /*Método que recibe una cadena como parámetro 
    -> El mismo protitpo a diferencia que esta recibe una cadena como parametro*/
    public static List<Character> leeCadena(String cadena) {
        List<Character> listaCaracteres = new ArrayList<>();
              
        //Convertir la cadena en una lista de caracteres
        for (int i = 0; i < cadena.length(); i++) {
            listaCaracteres.add(cadena.trim().charAt(i));
        }
        
        return listaCaracteres;
    }

    
    public static void main(String[] args) {
        
        //Objetos de Lista
        List <Character> cadenaUno = leeCadena("Hola Luna,");
        List <Character> cadenaDos = leeCadena("Me llamo Jessica");
        
        List <Character> cadenasUnidas = uneCadenas(cadenaUno, cadenaDos);
        
        System.out.println("Primera Cadena: " + cadenaUno);
        System.out.println("Segunda Cadena: " + cadenaDos);
        
        System.out.println("Cadenas Unidas: " + cadenasUnidas);
        
    }
    
}
