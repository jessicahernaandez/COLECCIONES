/*Cola Version 2: Utilizando objetos de Cola en lugar de ArrayList*/
package Act_aplicacion_12_20V2;


public class SuperColaV2 <T> {
    
    //Objetos de la Cola usando la clase Cola
    Cola<T> colaUno = new Cola<>();
    Cola<T> colaDos = new Cola<>();

    /*Metodo de encolar para COLAUNO
    -> Añade un elemento al final de la lista*/
    public void encolarUNO(T elemento) {
        colaUno.encolar(elemento);
    }

    /*Metodo de encolar para COLADOS
    -> Añade un elemento al final de la lista*/
    public void encolarDOS(T elemento) {
        colaDos.encolar(elemento);
    }

    /*Metodo de desencolar para COLAUNO
    -> Saca elementos al principio de la lista*/
    public T desencolarUNO() {
        T elementoDevolver = null;
        
        elementoDevolver = colaUno.desencolar();
        if (elementoDevolver == null) {
            System.out.println("No hay elementos a desencolar en Cola1 \n Desencolando cola Dos...");
            elementoDevolver = colaDos.desencolar();
        }

        return elementoDevolver;
    }

    /*Metodo de desencolar para COLADOS
    -> Saca elementos al principio de la lista*/
    public T desencolarDOS() {
        T elementoDevolver = null;

        elementoDevolver = colaDos.desencolar();
        if (elementoDevolver == null) {
            System.out.println("No hay elementos a desencolar en Cola2 \n Desencolando cola Uno...");
            elementoDevolver = colaUno.desencolar();
        }

        return elementoDevolver;
    }

    /*Metodo toString*/
    @Override
    public String toString() {
        return "Cola 1: " + colaUno + "\n" + "Cola 2: " + colaDos;
    }
    
}