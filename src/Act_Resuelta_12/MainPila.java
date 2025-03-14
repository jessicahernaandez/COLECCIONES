/**/
package Act_Resuelta_12;

import java.util.Scanner;

public class MainPila {

    public static void main(String[] args) {

        //Objeto Contenedor
        Contenedor<Integer> numeros = new Contenedor<>(new Integer[0]);

        Scanner sc = new Scanner(System.in);

        int numeroUsuario = 0;
        System.out.println("¡PILAS!");

        while (numeroUsuario != -1) {
            System.out.println("Introduce un número: ");
                numeroUsuario = sc.nextInt();
            if (numeroUsuario >= 0) {
                numeros.apilar(numeroUsuario);
            } else {
                System.out.println("Debes introducir numeros positivos");
            }
        }
        
        System.out.println("Haz introducido el '-1'");
        System.out.println("Desapilando...");
        
        //Guardamos el numero de elementos que tiene la pila
        int elementos = numeros.contadorObjetos;
        
        for(int i = 0; i < elementos; i++) {
            System.out.println(numeros.desapilar());
        }
    }
}
