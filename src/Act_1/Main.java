
package Act_1;


public class Main {


    public static void main(String[] args) {
        
        
        //Objetos
        Par <String, Integer> parUno = new Par <>("Jessica", 23);
        Par <Double, Float> parDos = new Par <> (3.456, 2.75f);
        
        System.out.println("------OBJETOS STRING E INTEGER------");
        System.out.println("Primero objeto: " + parUno.getObjetoUno() + " Segundo objeto: " + parUno.getObjetoDos());
        
        System.out.println("");
        
        System.out.println("-------OBJETOS DOUBLE Y FLOAT-------");
        System.out.println("Primero objeto: " + parDos.getObjetoUno() + " Segundo objeto: " + parDos.getObjetoDos());
    }
    
}
