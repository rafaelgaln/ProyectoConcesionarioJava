package modelo;

public class Coche {
    //Atributos Fijos
    protected final String marca;
    protected final String modelo;
    protected final String matricula;

    //Atributos Variables
    protected String color;
    protected double gasolinaRestante;
    protected double cuentakilometros;

    //Constructor
    public Coche (String marca, String modelo, String matricula, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        gasolinaRestante = 0;
        cuentakilometros = 0;
    }
}
