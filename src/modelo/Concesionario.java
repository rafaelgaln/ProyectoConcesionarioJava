package modelo;

import java.util.ArrayList;

public class Concesionario {

    //Atributos Fijos
    protected final String nombre;
    protected final String marcaConcesionario;
    protected final String ubicacion;

    //Atributos Variables
    protected ArrayList<Coche> inventarioCoches;
    protected int eurosGanados;

    //Constructor
    public Concesionario (String nombre, String marcaConcesionario, String ubicacion) {
        this.nombre = nombre;
        this.marcaConcesionario = marcaConcesionario;
        this.ubicacion = ubicacion;
        this.inventarioCoches = new ArrayList<Coche>();
    }

    //Métodos
    public boolean anadirCoche(Coche cocheNuevo) {
        System.out.println("Se va a intentar añadir el " + cocheNuevo.marca + " " + cocheNuevo.modelo
                + " al concesionario " + nombre);

        // Verifica si el concesionario es de la misma marca que el coche nuevo
        if (!marcaConcesionario.equals(cocheNuevo.marca)) {
            System.out.println(" - El coche no se puede añadir a un concesionario de diferente marca");
            return false;
        }

        // Si el inventario de coches está vacío, añade el coche nuevo al inventario
        if (inventarioCoches.isEmpty()) {
            inventarioCoches.add(cocheNuevo);
            System.out.println(" - El coche se ha añadido satisfactoriamente");
            return true;
        } else {
            // Si el inventario de coches no está vacío, itera sobre cada coche en el inventario
            for (Coche cocheSeleccionado : inventarioCoches) {
                // Compara la matrícula de cada coche en el inventario con la matrícula del coche nuevo
                if (cocheSeleccionado.matricula.equals(cocheNuevo.matricula)) {
                    System.out.println(" - El coche ya está en el concesionario");
                    return false;
                }
            }
        }

        // Si no se encuentra un coche con la misma matrícula en el inventario, añade el coche nuevo al inventario
        inventarioCoches.add(cocheNuevo);
        System.out.println(" - El coche se ha añadido satisfactoriamente");
        return true;
    }
    public boolean venderCoche(Coche cocheVendido) {
        int posCoche = inventarioCoches.indexOf(cocheVendido);
        inventarioCoches.remove(posCoche);
        eurosGanados += cocheVendido.valorEuros;
        System.out.println("Se ha vendido el " + cocheVendido.marca + " " + cocheVendido.modelo + " por "
                + cocheVendido.valorEuros + " euros");
        return true;
    }
}
