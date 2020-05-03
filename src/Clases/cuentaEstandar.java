package Clases;

public class cuentaEstandar implements calculoInteres{
    
    private double entrada;
    private double interes;

    public cuentaEstandar() {
        
    }

    public cuentaEstandar(double entrada) {
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
        interes = entrada * 1.005;
    }

    @Override
    public String tipoCuenta() {
        return "Cuenta Estándar";
    }

    @Override
    public Double interes() {
        return interes;
    }
    
}
