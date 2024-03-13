package edu.badpals.cotxox.carrera;

import edu.badpals.cotxox.conductores.Conductor;
import edu.badpals.cotxox.conductores.PoolConductores;
import edu.badpals.cotxox.tarifa.Tarifa;

public class Carrera {
    private String tarjetaCredito = "";
    private String origen = "";
    private String destino = "";
    private double distancia = 0.0;
    private int tiempoEsperado = 0;
    private int tiempoCarrera = 0;
    private double costeTotal = 0.0;
    private int propina = 0;
    private Conductor conductor = null;


    public Carrera(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public String getTarjetaCredito() {
        return this.tarjetaCredito;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public int getTiempoEsperado() {
        return tiempoEsperado;
    }

    public void setTiempoEsperado(int tiempoEsperado) {
        this.tiempoEsperado = tiempoEsperado;
    }

    public int getTiempoCarrera() {
        return tiempoCarrera;
    }

    public void setTiempoCarrera(int tiempoCarrera) {
        this.tiempoCarrera = tiempoCarrera;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public Conductor getConductor() {
        return conductor;
    }
    public void liberarConductor(){
        conductor.setOcupado(false);
    }

    public void asignarConductor (PoolConductores conductor){
        this.setConductor(conductor.asignarConductor());
    }

    public double getCosteTotal() {
        return Tarifa.getCosteTotalEsperado(this);
    }
    public double getCosteEsperado(){
        return Tarifa.getCosteTotalEsperado(this);
    }
    public void realizarPago(double pago){
        this.costeTotal = pago;
    }
    public void recibirPropina(int propina){
        this.propina = propina;
    }
    public int getPropina(){
        return propina;
    }
}
