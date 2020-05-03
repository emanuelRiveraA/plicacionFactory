package Clases;

public class fabrica {
    
    public static calculoInteres objConstruir(String cuenta, double entrada){
         switch(cuenta){
            case "cuentaJoven":
                return new cuentaJoven(entrada);
            case "cuenta10":
                return new cuenta10(entrada);
            case "cuentaOro":
                return new cuentaOro(entrada);
            default:
                return new cuentaEstandar(entrada);
        }
    }
    
}
