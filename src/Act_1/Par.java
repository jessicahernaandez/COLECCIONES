
package Act_1;


public class Par <T,U> {
    
    //Datos
    T objetoUno;
    U objetoDos;
    
    /*Constructor*/
    public Par (T objeto1, U objeto2) {
        objetoUno = objeto1;
        objetoDos = objeto2;
    }
    
    //Getters

    public void setObjetoUno(T objeto1) {
        objetoUno = objeto1;
    }

    public void setObjetoDos(U objeto2) {
        objetoDos = objeto2;
    }
    
    //Setters

    public T getObjetoUno() {
        return objetoUno;
    }

    public U getObjetoDos() {
        return objetoDos;
    }
    
    
    
}
