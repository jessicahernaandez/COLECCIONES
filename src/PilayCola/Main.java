/*Prueba de Pila y de Cola*/
package PilayCola;


public class Main {

    
    public static void main(String[] args) {
        
        //Objetos de la clase Pila y Cola
        Pila <Integer> numerosPila = new Pila <>();
        Cola <Integer> numerosCola = new Cola <>();
        
        //Agregamos en cola
        numerosCola.encolar(32);
        numerosCola.encolar(23);
        numerosCola.encolar(56);
        numerosCola.encolar(78);
        numerosCola.encolar(90);
        numerosCola.encolar(5);
        
        System.out.println(numerosCola.toString() + "\n");
        
        System.out.println("Desencolando...");
        
        int numCola = numerosCola.numElementos;
        
        for(int i = 0; i < numCola; i++) {
            System.out.println(numerosCola.desencolar());
        }
        
        System.out.println("");
        
        //Agregamos a Pila
        numerosPila.apilar(3);
        numerosPila.apilar(7);
        numerosPila.apilar(4);
        numerosPila.apilar(9);
        numerosPila.apilar(1);
        
        System.out.println(numerosPila.toString() + "\n");
        
        System.out.println("Desapilando...");
        
        int numPila = numerosPila.numElementos;
        
        for(int i = 0; i < numPila; i++) {
            System.out.println(numerosPila.desapilar());
        }
        
    }
    
}
