/**/
package Act_aplicacion_12_20V2;


public class Main {

    
    public static void main(String[] args) {
        
        //Objeto de Supercola
        SuperColaV2<Integer> superCola = new SuperColaV2<>();

        //Agregar elementos a ambas colas
        System.out.println("Añadiendo elementos...");
        superCola.encolarUNO(23);
        superCola.encolarUNO(67);
        superCola.encolarDOS(34);
        superCola.encolarDOS(12);

        //Mostrar estado inicial
        System.out.println("Estado inicial:");
        System.out.println(superCola);
        System.out.println();

        //Desencolar de Cola 1
        System.out.println("Desencolando de Cola 1:");
        System.out.println("Elemento desencolado: " + superCola.desencolarUNO());
        System.out.println(superCola);
        System.out.println();

        //Desencolar de Cola 2
        System.out.println("Desencolando de Cola 2:");
        System.out.println("Elemento desencolado: " + superCola.desencolarDOS());
        System.out.println(superCola);
        System.out.println();

        // Vaciar Cola 1 y probar si se desencola.
        System.out.println("Vaciando Cola...");
        superCola.desencolarUNO(); //Quita el último elemento de fallback:");Cola 1
        System.out.println("Intentando desencolar de Cola 1 vacía:");
        System.out.println("Elemento desencolado: " + superCola.desencolarUNO());
        System.out.println(superCola);
    }
}
