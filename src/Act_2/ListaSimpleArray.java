
package Act_2;

import java.util.ArrayList;


public class ListaSimpleArray <E> implements ListaSimple <E> {
    
    //Datos de la clase
    private ArrayList<E> lista;
    
    /*Constructor de la clase*/
    public ListaSimpleArray () {
       lista = new ArrayList<>();
    }
    
    /*Añade un elemento al final de la lista*/
    @Override
    public void agregar(E elemento) {
        lista.add(elemento);
    }

    @Override
    public E obtener(int indice) {
        E objeto = null;
        
        if(indice < 0 || indice >= tamaño()) {
            System.out.println("Indice fuera de lugar");
            return objeto;
        }
        
        return lista.get(indice);
        
    }

    /*Devuelve el tamaño de la lista*/
    @Override
    public int tamaño() {
        return lista.size();
    }
    
}
