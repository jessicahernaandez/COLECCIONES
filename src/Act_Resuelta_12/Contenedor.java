/*Copia de la clase Contenedor*/
package Act_Resuelta_12;

import java.util.Arrays;


public class Contenedor <T extends Comparable<T>> implements Pila<T> {
    
    //Datos de la clase
    T [] objetos; //Guarda los objetos
    int contadorObjetos;
    
    /*Constructor de la clase*/
    public Contenedor (T[] objetosNuevo) {
        objetos = objetosNuevo; //No se puede instanciar una tabla de tipo generico.
        contadorObjetos = 0;
    }
    
    /*Inserta un objeto al principio de la tabla*/
    void insertarAlPrincipio (T nuevo) {
        objetos = Arrays.copyOf(objetos, objetos.length + 1);
        
        //desplazamos
        System.arraycopy(objetos, 0, objetos, 1, objetos.length -1);
        objetos[0] = nuevo;
        contadorObjetos++;
    }
    
    /*Inserta un objeto al final de la tabla*/
    void insertarAlFinal (T nuevo) {
        objetos = Arrays.copyOf(objetos, objetos.length + 1);
        
        objetos[objetos.length - 1] = nuevo;
        contadorObjetos++;
    }
    
    /*Devuelve el objeto que esta en la posicion 0*/
    T extraerDelPrincipio () {
        T objetoDevolver = null;
        
        if (objetos.length > 0) {
            objetoDevolver = objetos[0];
            //Desplazamos dejando el ultimo espacio vacio
            System.arraycopy(objetos, 1, objetos, 0, objetos.length - 1);
            //Truncamos la tabla
            objetos = Arrays.copyOf(objetos, objetos.length - 1);
            contadorObjetos--;
        }
        
        return objetoDevolver;
    }
    
    T extraerDelFinal () {
        T objetoDevolver = null;
        
        if (objetos.length > 0) {
            objetoDevolver = objetos[objetos.length -1];
            //Truncamos el final
            objetos = Arrays.copyOf(objetos, objetos.length - 1);
            contadorObjetos--;
        }
        
        return objetoDevolver;
    }
    
    /*Ordena la tabla*/
    void ordenar () {
        Arrays.sort(objetos); 
    }
    
    /*Método toString*/
    @Override
    public String toString () {
        return Arrays.deepToString(objetos);
    }   

    @Override
    public void apilar(T elemento) {
        insertarAlFinal(elemento);
    }

    @Override
    public T desapilar() {
        return extraerDelFinal();
    }
}
