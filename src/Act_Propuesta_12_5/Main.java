/**/
package Act_Propuesta_12_5;

import java.util.Comparator;
import java.util.TreeSet;


public class Main {

    
    public static void main(String[] args) {
        
        /*Conjunto de Clientes.*/
        TreeSet <Cliente> conjuntoClientes = new TreeSet<>();
        conjuntoClientes.add(new Cliente ("111", "Marta", "12/02/2000"));
        conjuntoClientes.add(new Cliente ("115", "Jorge", "16/03/1999"));
        conjuntoClientes.add(new Cliente ("112", "Carlos", "01/10/2002"));
        conjuntoClientes.add(new Cliente ("110", "Jessica", "23/09/2004"));
        
        System.out.println("Conjunto de Clientes ordenados por orden natural (dni): ");
        System.out.println(conjuntoClientes);
        System.out.println("");
        
        /*Objeto de la Clase ComparaEdades*/
        Comparator comparadorEdades = new ComparaEdades();
        
        /*Como los queremos ordenar con un criterio diferente al natural usamos la clase TreeSet*/
        TreeSet<Cliente> clientesOrdenEdad = new TreeSet<>(comparadorEdades);
        clientesOrdenEdad.addAll(conjuntoClientes);
        
        System.out.println("Conjunto de Clientes ordenados por edades: ");
        System.out.println(clientesOrdenEdad);
        System.out.println("");
        
        /*Prueba con clase Anonima*/
        Comparator<Cliente> ordenaNombres = new Comparator<>() {
            public int compare(Cliente o1, Cliente o2) {
                return o1.nombre.compareToIgnoreCase(o2.nombre);
            }
        };
        
        TreeSet<Cliente> clientesOrdenNombre = new TreeSet<>(ordenaNombres);
        clientesOrdenNombre.addAll(clientesOrdenEdad);
        
        System.out.println("Conjunto de Clientes ordenados por nombres: ");
        System.out.println(clientesOrdenNombre);
    }
    
}
