package edu.badpals.cotxox.conductores;

import java.util.ArrayList;
import java.util.Optional;

public class Conductor {
    private String nombre = "";
    private String modelo = "";
    private String matricula = "";
    private double valoracionMedia = 0d;
    private boolean ocupado = false;
    private ArrayList<Byte> valoraciones = new ArrayList<>();

    public Conductor(){};

    public Conductor(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getValoracion(){
        return calcularValoracionMedia();

    }
    public ArrayList<Byte> getValoraciones() {
        return this.valoraciones;
    }
    public int getNumeroValoraciones(){
        return this.valoraciones.size();
    }
    public void setValoracion(byte valoracion){
        this.valoraciones.add(valoracion);
    }

    private double calcularValoracionMedia(){
        Optional<Byte> sumaValoraciones = this.valoraciones
                .stream()
                .reduce((a, b) -> (byte)(a + b));
        double sumaTotal = sumaValoraciones.get();
        double valoracionesEnDouble = getNumeroValoraciones();
        return sumaTotal / valoracionesEnDouble;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public boolean isOcupado(){
        return this.ocupado;
    }
}


