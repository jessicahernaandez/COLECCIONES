/*Copia de la clase Contenedor -> Sin implementacion de la interfaz Pila*/
package Act_Ampliacion_12_29;

import java.util.Arrays;

public class Contenedor<T extends Comparable<T>> {

    //Datos de la clase
    T[] objetos; //Guarda los objetos
    int contadorObjetos;

    /*Constructor de la clase*/
    public Contenedor(T[] objetosNuevo) {
        objetos = objetosNuevo; //No se puede instanciar una tabla de tipo generico.
        contadorObjetos = objetosNuevo.length;
    }

    /*Inserta un objeto al principio de la tabla*/
    void insertarAlPrincipio(T nuevo) {
        objetos = Arrays.copyOf(objetos, objetos.length + 1);

        //desplazamos
        System.arraycopy(objetos, 0, objetos, 1, objetos.length - 1);
        objetos[0] = nuevo;
        contadorObjetos++;
    }

    /*Inserta un objeto al final de la tabla*/
    void insertarAlFinal(T nuevo) {
        objetos = Arrays.copyOf(objetos, objetos.length + 1);

        objetos[objetos.length - 1] = nuevo;
        contadorObjetos++;
    }

    /*Devuelve el objeto que esta en la posicion 0*/
    T extraerDelPrincipio() {
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

    T extraerDelFinal() {
        T objetoDevolver = null;

        if (objetos.length > 0) {
            objetoDevolver = objetos[objetos.length - 1];
            //Truncamos el final
            objetos = Arrays.copyOf(objetos, objetos.length - 1);
            contadorObjetos--;
        }

        return objetoDevolver;
    }

    /*Ordena la tabla*/
    void ordenar() {
        Arrays.sort(objetos);
    }

    /*Método toString*/
    @Override
    public String toString() {
        return Arrays.deepToString(objetos);
    }

    /*Devuelve una tabla con los indices de todas las ocurrencias de e*/
    int[] buscarTodos(Object e) {
        int[] indices = new int[0];
        int nuevoContador = 0;

        for (int i = 0; i < objetos.length; i++) {
            if (objetos[i].equals(e) && objetos[i] != null) {
                indices = Arrays.copyOf(indices, indices.length + 1);
                indices[nuevoContador] = i;
                nuevoContador++;
            }
        }

        return indices;
    }

    /*Elimina todas las ocurrencias de e y devuelve true si la lista fue alterada.*/
    boolean eliminarTodos(Object e) {
        boolean modificado = false;

        /*Contar cuántos elementos NO son e*/
        int nuevoTamaño = 0;
        for (int i = 0; i < contadorObjetos; i++) {
            if (!objetos[i].equals(e)) {
                nuevoTamaño++;
            } else {
                modificado = true;
            }
        }

        /*Si el nuevo tamaño es igual al original, no se eliminó nada*/
        if (nuevoTamaño == contadorObjetos) {
            return false;
        }

        /*Creamos un nuevo arreglo con el tamaño ajustado*/
        T[] nuevoArreglo = Arrays.copyOf(objetos, nuevoTamaño);

        /*Copiar los elementos que no son e*/
        int posicionNuevos = 0;
        for (int i = 0; i < contadorObjetos; i++) {
            if (!objetos[i].equals(e)) {
                nuevoArreglo[posicionNuevos] = objetos[i];
                posicionNuevos++;
                modificado = true;
            }
        }

        /*Actualizar objetos y contadorObjetos*/
        objetos = nuevoArreglo;
        contadorObjetos = nuevoTamaño;
        
        return modificado;
    }
}
