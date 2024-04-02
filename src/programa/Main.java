package programa;

/**
 * @author Rafael Galán
 * @version 1.0
 * @since 02/04/2024
 * @see modelo.Coche
 * @see modelo.Concesionario
 */

import modelo.Coche;
import modelo.Concesionario;
public class Main {

    public static void main(String[] args) {

        //Probando métodos y clases
        Concesionario concesionarioCitroen = new Concesionario ("SuperCoches", "Citroen", "Leganes");
        Coche CitroenC4 = new Coche ("Citroen", "C4", "Rojo", "6745JUP");
        Coche RenaultClio = new Coche ("Renault", "Clio", "Amarillo", "9746LOK");

        CitroenC4.conducirCoche(10);
        CitroenC4.repostarCoche(50);
        CitroenC4.conducirCoche(10);

        concesionarioCitroen.anadirCoche(CitroenC4);
        concesionarioCitroen.anadirCoche(RenaultClio);
    }
}
