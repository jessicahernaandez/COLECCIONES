/**/
package Act_Ampliacion_12_33;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

class Cliente implements Comparable<Cliente> {

    String dni;
    String nombre;
    LocalDate fechaNacimiento;

    Cliente(String dniClie, String nombreClie, String fechaNacimientoClie) {
        dni = dniClie;
        nombre = nombreClie;
        DateTimeFormatter formatoFechas = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        fechaNacimiento = LocalDate.parse(fechaNacimientoClie, formatoFechas);
    }

    int edad() {
        return (int) fechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    @Override
    public boolean equals(Object ob) {
        return dni.equals(((Cliente) ob).dni);
    }

    @Override
    public int compareTo(Cliente otro) {
        return dni.compareTo(otro.dni);
    }

    @Override
    public String toString() {
        return "DNI: " + dni + " Nombre: " + nombre + " Edad: " + edad() + "\n";
    }
}
