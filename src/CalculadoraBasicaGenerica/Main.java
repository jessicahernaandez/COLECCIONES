/**/
package CalculadoraBasicaGenerica;


public class Main {

    
    public static void main(String[] args) {
        
        //Objetos
        Calculadora <Integer> enteros = new Calculadora <>();
        Calculadora <Double> doubles = new Calculadora <>();
        
        System.out.println("Suma de los enteros: " + enteros.sumar(8, 5) + "\n");
        System.out.println("Resta de los enteros: " + enteros.restar(8, 3) + "\n");
        System.out.println("Multiplicacion de los enteros: " + enteros.restar(6, 3) + "\n");
        System.out.println("Division de los enteros: " + enteros.dividir(5, 0) + "\n");
        System.out.println("Division de los enteros: " + enteros.dividir(5, 2) + "\n");
        
        System.out.println("Suma de los Doubles: " + doubles.sumar(2.5, 3.75) + "\n");
        System.out.println("Suma de los Doubles: " + doubles.restar(4.25, 7.6) + "\n");
        System.out.println("Suma de los Doubles: " + doubles.multiplicar(1.5, 6.5) + "\n");
        System.out.println("Suma de los Doubles: " + doubles.dividir(45.3, 0.0) + "\n");
        System.out.println("Suma de los Doubles: " + doubles.dividir(45.3, 3.75) + "\n");
        
    }
    
}
