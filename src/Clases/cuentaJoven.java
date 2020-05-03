package Clases;

public class cuentaJoven implements calculoInteres{
    
    private double entrada;
    private double interes;

    public cuentaJoven() {
        
    }

    public cuentaJoven(double entrada) {
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
        interes = entrada * 1.02;
    }

    @Override
    public String tipoCuenta() {
        return "Cuenta Joven";
    }
    
    @Override
    public Double interes() {
        return interes;
    }
}
