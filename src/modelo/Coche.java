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
    protected int valorEuros;

    //Constructor
    public Coche (String marca, String modelo, String matricula, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        gasolinaRestante = 0;
        cuentakilometros = 0;
        valorEuros = (int) (Math.random() * 300000) +50000;
    }

    //Métodos
    public void imprimirInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Color: " + color);
        System.out.println("Gasolina restante (Litros): " + gasolinaRestante);
        System.out.println("Cuentakilómetros: " + cuentakilometros);
    }
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

    public boolean repostarCoche (double recargaLitrosGasolina) {
        gasolinaRestante += recargaLitrosGasolina;
        System.out.println("Has repostado tu " + marca + " " + modelo + " " + recargaLitrosGasolina + " litros de gasolina");
        return true;
    }

    //Getters y Setters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getGasolinaRestante() {
        return gasolinaRestante;
    }

    public void setGasolinaRestante(double gasolinaRestante) {
        this.gasolinaRestante = gasolinaRestante;
    }

    public double getCuentakilometros() {
        return cuentakilometros;
    }

    public void setCuentakilometros(double cuentakilometros) {
        this.cuentakilometros = cuentakilometros;
    }

    public int getValorEuros() {
        return valorEuros;
    }

    public void setValorEuros(int valorEuros) {
        this.valorEuros = valorEuros;
    }
}