/*Clase Jugador*/
package Act_Ampliacion_12_37;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class Jugador {
    
    //Datos de la clase
    String dni;
    String nombre;
    PosicionJugador Posicion;
    double estatura;
    
    /*Constructor de la clase*/
    public Jugador (String dniJugador, String nombreJugador, String PosicionJug, double estaturaJugador ) {
        dni = dniJugador;
        nombre = nombreJugador;
        Posicion = PosicionJugador.valueOf(PosicionJug);
        estatura = estaturaJugador;
    }
  
    /*METODOS ESTATICOS*/
    /*Metodo que recibe como parametro un mapa y un integer como clave unica
    -> No devuelve nada, da de alta a un jugador*/
    static void altaJugador (Map <Integer, Jugador> plantilla, Integer dorsal) {
        
        /*Datos sobre el Jugador*/
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce los datos del Jugador: ");
        System.out.println("DNI: ");
        String dniJug = sc.nextLine();
        System.out.println("Nombre: ");
        String nombreJug = sc.nextLine();
        System.out.println("Escribe la posicion: ");
        System.out.println("-> Portero");
        System.out.println("-> Defensa");
        System.out.println("-> Centrocampista");
        System.out.println("-> Delantero");
        String posicion = sc.nextLine().toUpperCase();
        System.out.println("Estatura: ");
        double estatura = sc.nextDouble();
        
        //Creamos el objeto de clase Jugador
        Jugador jugador = new Jugador(dniJug, nombreJug, posicion, estatura);
        
        //Un Mapa pasado como parametro, ingresamos al jugador como valor y el dorsal pasado como parametro como clave.
        plantilla.put(dorsal, jugador);
              
    }
    
    /*Recibe como parametro un mapa con clave Integer y valor de tipo Jugador y aparte,
    la clave de tipo Integer del mapa.
    -> Elimina al Jugador del mapa y lo devuelve*/
    static Jugador eliminarJugador (Map<Integer, Jugador> plantilla, Integer dorsal) {
        
        Jugador jugadorEliminado = null;
        
        /*Itero sobre un conjunto de claves y valores del mapa*/
        Set <Map.Entry<Integer, Jugador>> jugadores = plantilla.entrySet();
        
        /*Iterador para el conjunto jugadores*/
        Iterator <Map.Entry<Integer, Jugador>> iteraJugadores = jugadores.iterator();
        
        
        while(iteraJugadores.hasNext()) {
            Map.Entry<Integer, Jugador> claveDorsal = iteraJugadores.next();
            
            /*Si la clave es igual, se elimina*/
            if (claveDorsal.getKey().equals(dorsal)) {
                /*Y guardamos el valor de tipo Jugador para devolverlo*/
                jugadorEliminado = claveDorsal.getValue();
                iteraJugadores.remove();
            } else {
                System.out.println("El jugador con dorsal " + dorsal + " no existe");
            }
        }
        
        return jugadorEliminado;
    }
    
    /*Recibe un mapa como parametro y no devuelve nada
    -> Muestra el dorsal y el nombre del Jugador*/
    static void mostrar (Map<Integer, Jugador> plantilla) {
        
        /*Obtenemos una vista de claves y valores*/
        Set <Map.Entry<Integer, Jugador>> jugadores = plantilla.entrySet();
        
        //Lista para mostrar los dorsales y el nombre del jugador
        List <String> nombreyDorsal = new ArrayList<>();
        
        //Iterator
        Iterator <Map.Entry<Integer, Jugador>> itera = jugadores.iterator();
        
        System.out.println("Lista de Jugadores: ");
        while(itera.hasNext()) {
            Map.Entry<Integer, Jugador> elemento = itera.next();
            Integer dorsal = elemento.getKey();
            String nombre = elemento.getValue().nombre;
            
            nombreyDorsal.add("Dorsal: " + dorsal + " Nombre: " + nombre);
            /*Si no era una lista mostrarlo como tal con un sout, o se podria
            crear otro mapa de Integer y String e introducir los valores.*/
        }
        
        System.out.println(nombreyDorsal);
               
    }
    
    /*Muestra una lista de los jugadores que comparten una misma posicion*/
    static void mostrar (Map <Integer, Jugador> plantilla, String posicion) {
        
        List <Jugador> delanteros = new ArrayList<>();
        List <Jugador> defensas = new ArrayList<>();
     
        /*Vista de valores -> Jugadores*/
        Collection <Jugador> jugadores = plantilla.values();
        
        Iterator <Jugador> itera = jugadores.iterator();
        
        while(itera.hasNext()) {
            Jugador jugador = itera.next();
            
            if (jugador.Posicion.equals(PosicionJugador.DELANTERO)) {
                delanteros.add(jugador);
            } else if (jugador.Posicion.equals(PosicionJugador.DEFENSA)) {
                defensas.add(jugador);
            }
        }
        
        System.out.println("Jugadores que comparten la misma posicion: ");
        
        if (!delanteros.isEmpty()) {
            System.out.println("Delanteros: ");
            System.out.println(delanteros);
        }
        
        if (!defensas.isEmpty()) {
            System.out.println("Defensas: ");
            System.out.println(defensas);
        }
        
    }
    
    /*No terminado*/
    static boolean editarJugador (Map<Integer, Jugador> plantilla, Integer dorsal) {
        boolean editado = false;
        
        /*Verificamos si el dorsal existe en el mapa*/
        if (!plantilla.containsKey(dorsal)) {
            System.out.println("El jugador con el dorsal " + dorsal + " no se encuentra en la plantilla");
        }
        
        return editado;
    }
}
