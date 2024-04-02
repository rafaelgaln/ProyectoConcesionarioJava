package modelo;

/**
 * @author Rafael Galán
 * @version 1.0
 * @since 02/04/2024
 * @see Concesionario
 * @see programa.Main
 */

public class Coche {
    //Atributos Fijos
    protected final String marca;
    protected final String modelo;
    protected final String matricula;

    //Atributos Variables
    protected String color;
    protected double gasolinaRestante;
    protected double cuentakilometros;
    protected int valorEuros;

    //Constructor

    /**
     *
     * @param marca La marca del fabricante del coche
     * @param modelo El modelo del vehículo
     * @param matricula La matrícula del coche. Es única para cada coche.
     * @param color El color del coche
     */
    public Coche (String marca, String modelo, String matricula, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        gasolinaRestante = 0;
        cuentakilometros = 0;
        valorEuros = (int) (Math.random() * 300000) +50000;
    }

    //Métodos
    /**
     *
     */
    public void imprimirInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Color: " + color);
        System.out.println("Gasolina restante (Litros): " + gasolinaRestante);
        System.out.println("Cuentakilómetros: " + cuentakilometros);
    }

    /**
     *
     * @param kilometrosRecorridos - Los kilómetros que va a recorrer el coche
     * @return false si no hay gasolina suficiente para recorrer los kilómetros recorridos, true si  la hay
     */
    public boolean conducirCoche (double kilometrosRecorridos) {
        System.out.println("Vamos a conducir el " + marca + " " + modelo);
        if (gasolinaRestante < (kilometrosRecorridos*0.06)) {
            System.out.println("No hay suficiente gasolina para conducir");
            return false;
        }
        cuentakilometros += kilometrosRecorridos;
        gasolinaRestante -= (kilometrosRecorridos*0.06);
        System.out.println("Has conducido tu " + marca + " " + modelo + " " + kilometrosRecorridos + " kilómetros");
        System.out.println("- Ha consumido " + (kilometrosRecorridos*0.06) + " litros de combustible");
        return true;
    }

    /**
     *
     * @param recargaLitrosGasolina - Litros de gasolina a repostar
     * @return true
     */
    public boolean repostarCoche (double recargaLitrosGasolina) {
        gasolinaRestante += recargaLitrosGasolina;
        System.out.println("Has repostado tu " + marca + " " + modelo + " " + recargaLitrosGasolina + " litros de gasolina");
        return true;
    }

    //Getters y Setters

    /**
     *
     * @return marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     *
     * @return modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     *
     * @return matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     *
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     *
     * @param color El color del coche
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     *
     * @return gasolinaRestante
     */
    public double getGasolinaRestante() {
        return gasolinaRestante;
    }

    /**
     *
     * @param gasolinaRestante La gasolina restante del coche
     */
    public void setGasolinaRestante(double gasolinaRestante) {
        this.gasolinaRestante = gasolinaRestante;
    }

    /**
     *
     * @return cuentakilometros
     */
    public double getCuentakilometros() {
        return cuentakilometros;
    }

    /**
     *
     * @param cuentakilometros Los kilómetros recorridos por el coche
     */
    public void setCuentakilometros(double cuentakilometros) {
        this.cuentakilometros = cuentakilometros;
    }

    /**
     *
     * @return valorEuros
     */
    public int getValorEuros() {
        return valorEuros;
    }

    /**
     *
     * @param valorEuros El valor del coche en Euros
     */
    public void setValorEuros(int valorEuros) {
        this.valorEuros = valorEuros;
    }
}