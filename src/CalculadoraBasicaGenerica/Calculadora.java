/**/
package CalculadoraBasicaGenerica;

public class Calculadora<N extends Number> {

    //Sumar
    public double sumar(N num1, N num2) {
        return num1.doubleValue() + num2.doubleValue();
    }
    
    //Restar
    public double restar(N num1, N num2) {
        return num1.doubleValue() - num2.doubleValue();
    }
    
    //Multiplicar
    public double multiplicar(N num1, N num2) {
        return num1.doubleValue() * num2.doubleValue();
    }
    
    //Dividir
    public double dividir(N num1, N num2) {
        
        if (num2.doubleValue() == 0.0) {
            System.out.println("No se puede dividir entre 0");
            return 0;
        } else {
            return num1.doubleValue() / num2.doubleValue();
        }

    }

}
