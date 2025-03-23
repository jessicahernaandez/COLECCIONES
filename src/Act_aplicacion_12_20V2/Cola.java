/*FIFO -> Primero que entra, primero que sale
-> Copia de la clase COLA */
package Act_aplicacion_12_20V2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Cola<E> {

    //Datos de la clase
    Collection<E> colaNum = new ArrayList<>();
    int numElementos;

    /*Constructor de la clase*/
    public Cola() {
        numElementos = 0;
    }

    /*Metodo Encolar
    -> Inserta el elemento al final*/
    public void encolar(E elemento) {

        colaNum.add(elemento);
        numElementos++;
    }

    /*Metodo desencolar
    -> Elimina el elemento del principio*/
    public E desencolar() {

        E elementoEliminar = null;
        
        if (!colaNum.isEmpty()) {
            Iterator<E> recorre = colaNum.iterator();
            elementoEliminar = recorre.next();
            recorre.remove();
            numElementos--;
        }
        
        return elementoEliminar;
    }
    
    /*Metodo toString*/
    @Override
    public String toString () {
        return "Lista: " + colaNum;
    }

}
