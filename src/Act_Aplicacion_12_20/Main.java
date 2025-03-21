/*Menu para poner a prueba a clase SUPERCOLA*/
package Act_Aplicacion_12_20;

import java.util.Scanner;

public class Main {

    public static int menuPrincipal() {

        Scanner sc = new Scanner(System.in);

        System.out.println("-----SUPER COLA-----");
        System.out.println("Elige una opcion:");
        System.out.println("1. Encola cola Uno.");
        System.out.println("2. Encola cola Dos");
        System.out.println("3. Desencolar cola Uno");
        System.out.println("4. Desencolar cola Dos");
        System.out.println("5. Salir");
        int opcionUsuario = sc.nextInt();

        return opcionUsuario;
    }

    public static void main(String[] args) {

        //Objetos de la clase SuperCola
        SuperCola<Integer> cola1 = new SuperCola<>();
        SuperCola<Integer> cola2 = new SuperCola<>();

        int opcion = menuPrincipal();

        while (opcion != 5 && opcion > 0) {

            Scanner sc = new Scanner(System.in);

            switch (opcion) {
                case 1 -> {
                    System.out.println("Introduce un numero entero positivo: ");
                    Integer elemento = sc.nextInt();

                    if (elemento > 0) {
                        cola1.encolarUNO(elemento);

                    } else {
                        System.out.println("ELEMENTO NO VALIDO");
                    }
                    
                }

                case 2 -> {
                    System.out.println("Introduce un numero entero positivo: ");
                    Integer elemento2 = sc.nextInt();

                    if (elemento2 > 0) {
                        cola2.encolarDOS(elemento2);

                    } else {
                        System.out.println("ELEMENTO NO VALIDO");
                    }
                }

                case 3 -> {

                    if (cola1.desencolarUNO() == null && cola2.desencolarDOS() == null) {
                        System.out.println("No hay mas elementos para desencolar");
                    } else {
                        System.out.println("Desencolando COLA UNO...");

                        if (cola1.desencolarUNO() == null) {
                            System.out.println(cola2.desencolarDOS());
                        } else {
                            System.out.println(cola1.desencolarUNO());
                        }
                    }
                }
                
                case 4 -> {
                    
                    if (cola1.desencolarUNO() == null && cola2.desencolarDOS() == null) {
                        System.out.println("No hay mas elementos para desencolar");
                    } else {
                        System.out.println("Desencolando COLA DOS...");

                        if (cola2.desencolarDOS() == null) {
                            System.out.println(cola1.desencolarUNO());
                        } else {
                            System.out.println(cola2.desencolarDOS());
                        }
                    }
                }
                
                case 5 -> {
                    System.out.println("Saliendo del programa...");
                }
                
                default -> {
                    System.out.println("Opcion no valida");
                }
            }
            
            System.out.println("Saliendo del programa...");
            
            System.out.println(cola1.toString());
            
            opcion = menuPrincipal();
        }
    }

}
