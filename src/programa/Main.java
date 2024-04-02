package programa;

import modelo.Coche;
import modelo.Concesionario;
public class Main {

    public static void main(String[] args) {

        Concesionario concesionarioCitroen = new Concesionario ("SuperCoches", "Citroen", "Leganes");
        Coche CitroenC4 = new Coche ("Citroen", "C4", "Rojo", "6745JUP");
        Coche RenaultClio = new Coche ("Renault", "Clio", "Amarillo", "9746LOK");

        CitroenC4.conducirCoche(10);
        CitroenC4.repostarCoche(50);
        CitroenC4.conducirCoche(10);
    }
}
