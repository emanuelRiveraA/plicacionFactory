package Clases;

public class cuentaOro implements calculoInteres{
    
    private double entrada;
    private double interes;

    public cuentaOro() {
        
    }

    public cuentaOro(double entrada) {
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
        interes = entrada * 1.015;
    }

    @Override
    public String tipoCuenta() {
        return "Cuenta Oro";
    }

   @Override
    public Double interes() {
        return interes;
    }
    
}
