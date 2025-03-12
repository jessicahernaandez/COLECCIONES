package Act_2;

public class Main {

    public static void main(String[] args) {

        //Objetos
        ListaSimpleArray<String> lista1 = new ListaSimpleArray<>();

        lista1.agregar("Jessica");
        lista1.agregar("Andrea");
        lista1.agregar("Cynthia");
        lista1.agregar("Alejandra");
        lista1.agregar("Liza");
        lista1.agregar("Alba");
        lista1.agregar("Dasha");
        
        System.out.println("Tamaño de la lista: " + lista1.tamaño());
        
        System.out.println("Objeto en el indice 3: " + lista1.obtener(3));

    }

}
