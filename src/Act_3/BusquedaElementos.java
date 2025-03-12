
package Act_3;


public class BusquedaElementos {
    
    //Metodo estatico generico que busca un valor especificado en un array
    //-> Estos 2 pasados como parametros
    public static <T extends Comparable <T>> boolean contiene (T array[], T valor) {
        boolean contiene = false;
        
        for(T busqueda: array) {
            if (busqueda != null && busqueda.compareTo(valor) == 0) {
                contiene = true;
            }
        }
        
        return contiene;
    }
    
    
}
