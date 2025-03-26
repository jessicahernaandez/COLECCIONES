/**/
package Act_Propuesta_12_5;

import java.util.Comparator;


public class ComparaEdades implements Comparator <Cliente> {

    @Override
    public int compare(Cliente cliente1, Cliente cliente2) {
        return cliente1.edad() - cliente2.edad();
    }
}
