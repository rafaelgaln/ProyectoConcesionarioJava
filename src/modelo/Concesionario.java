package modelo;

import java.util.ArrayList;

public class Concesionario {

    //Atributos Fijos
    protected final String nombre;
    protected final String marcaConcesionario;
    protected final String ubicacion;

    //Atributos Variables
    protected ArrayList<Coche> inventarioCoches;

    //Constructor
    public Concesionario (String nombre, String marcaConcesionario, String ubicacion) {
        this.nombre = nombre;
        this.marcaConcesionario = marcaConcesionario;
        this.ubicacion = ubicacion;
        this.inventarioCoches = new ArrayList<Coche>();
    }
}
