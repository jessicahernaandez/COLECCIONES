/**/
package Act_Aplicacion_12_7;

import java.util.Iterator;




public class MainCola {

    
    public static void main(String[] args) {
        
        //Objeto de Cola
        Cola<Integer> colaUno = new Cola <>();
        
        System.out.println("Cola Inicial: " + colaUno);
        
        //Encolamos
        colaUno.encolar(34);
        colaUno.encolar(45);
        colaUno.encolar(7);
        colaUno.encolar(10);
        colaUno.encolar(4);
        colaUno.encolar(78);
        colaUno.encolar(14);
        
        System.out.println("Cola despues de agregar elementos: " + colaUno);
        
        System.out.println("Desencolando...");
        
        while (!colaUno.colaNum.isEmpty()) {
            System.out.println(colaUno.desencolar());
        }

        
    }
    
}
