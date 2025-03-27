/**/
package Act_Ampliacion_12_37;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*Creamos un mapa para almacenar la plantilla de jugadores*/
        Map<Integer, Jugador> plantilla = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 5) {
            System.out.println("--- Gestión de Plantilla ---");
            System.out.println("Elige una opción: ");
            System.out.println("1. Dar de alta un jugador");
            System.out.println("2. Eliminar un jugador");
            System.out.println("3. Mostrar todos los jugadores");
            System.out.println("4. Mostrar jugadores por posición");
            System.out.println("5. Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    /*Dar de alta un jugador*/
                    System.out.println("Introduce el dorsal del jugador: ");
                    Integer dorsalAlta = sc.nextInt();
                    /*Verificamos que el dorsal sea mayor que 0*/
                    if (dorsalAlta <= 0) {
                        //Si no es mayor, lo dejamos como esta
                        System.out.println("El dorsal debe ser mayor que 0.");
                    } else {
                        Jugador.altaJugador(plantilla, dorsalAlta);
                    }

                }

                case 2 -> {
                    /*Eliminar un jugador*/
                    System.out.println("Introduce el dorsal del jugador a eliminar: ");
                    Integer dorsalEliminar = sc.nextInt();
                    Jugador jugadorEliminado = Jugador.eliminarJugador(plantilla, dorsalEliminar);
                    if (jugadorEliminado != null) {
                        System.out.println("Jugador eliminado: " + jugadorEliminado);
                    }
                }

                case 3 -> {
                    /*Mostrar todos los jugadores*/
                    Jugador.mostrar(plantilla);
                }

                case 4 -> {
                    // Mostrar jugadores por posición
                    System.out.println("Introduce la posición a buscar: ");
                    System.out.println("-> Portero");
                    System.out.println("-> Defensa");
                    System.out.println("-> Centrocampista");
                    System.out.println("-> Delantero");
                    String posicion = sc.nextLine().toUpperCase();
                    Jugador.mostrar(plantilla, posicion);
                }

                case 5 -> {
                    System.out.println("Saliendo del programa...");
                }

                default -> {
                    System.out.println("Opcion Invalida.");
                }
            }

        }
    }
}
