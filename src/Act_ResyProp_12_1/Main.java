/**/
package Act_ResyProp_12_1;

import java.util.Arrays;


public class Main {

    
    public static void main(String[] args) {
       
        //Objeto de Integer
        Integer [] numeros = {23, 45, 55, 67, 88};        
        
        //Objeto de String
        String [] palabras = {"Luna", "Estrella", "Sol", "Mundo"};
            
        System.out.println("Tabla Inicial de numeros: " + Arrays.toString(numeros));
        numeros = InsercionObjetos.InsercionFinal(numeros, 98);
        System.out.println("Tabla con el numero 98 insertado al final: " + Arrays.toString(numeros));
        
        System.out.println("");
        
        System.out.println("Tabla inicial de palabras: " + Arrays.toString(palabras));       
        palabras = InsercionObjetos.InsercionFinal(palabras, "Saturno");
        System.out.println("Tabla con la palabra 'Saturno' agregada al final: " + Arrays.toString(palabras));
        
        //Otra tabla de Integer para concatenarla con la primera
        Integer [] numerosDos = {1, 2, 4, 5}; 
        
        System.out.println("Segunda tabla de numeros: " + Arrays.toString(numerosDos));
        
        //Nueva tabla para concatenar
        Integer [] nuevaTabla = {};
        nuevaTabla = InsercionObjetos.TablasJuntas(numeros, numerosDos);
        System.out.println("Nueva tabla que une a las dos tablas de numeros: " + Arrays.toString(nuevaTabla));
                
    }
    
}
