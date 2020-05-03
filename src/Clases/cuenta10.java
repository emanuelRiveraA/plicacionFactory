package Clases;

public class cuenta10 implements calculoInteres{
    
    private double entrada;
    private double interes;

    public cuenta10() {
        
    }

    public cuenta10(double entrada) {
        this.entrada = entrada;
    }

    public double getEntrada() {
        return entrada;
    }

    public void setEntrada(double entrada) {
        this.entrada = entrada;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    @Override
    public void calcular() {
        interes = entrada * 1.01;
    }

    @Override
    public String tipoCuenta() {
        return "Cuenta 10";
    }
    
    @Override
    public Double interes() {
        return interes;
    }
    
}
