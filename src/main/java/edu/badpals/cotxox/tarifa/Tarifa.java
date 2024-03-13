package edu.badpals.cotxox.tarifa;

import edu.badpals.cotxox.carrera.Carrera;

public class Tarifa {
    private  static final double  COSTE_MILLA = 1.35;
    private static final double COSTE_MINUTO = 0.35;
    private static final double COSTE_MINIMO = 5.00;

    private static final byte PORCENTAJE_COMISION = 20;

    public Tarifa() {
    }


    public static double getCosteDistancia(double distancia){
        return distancia * COSTE_MILLA;
    }
    public static double getCosteTiempo(int tiempo){
        return tiempo * COSTE_MINUTO;
    }
    public static double getCosteTotalEsperado(Carrera estimacion){
        double costeDistancia = getCosteDistancia(estimacion.getDistancia());
        double costeTiempo = getCosteTiempo(estimacion.getTiempoEsperado());
        if(costeDistancia * costeTiempo > COSTE_MINIMO){
                return costeDistancia + costeTiempo;
        }else{
            return COSTE_MINIMO;
        }
    }

}
