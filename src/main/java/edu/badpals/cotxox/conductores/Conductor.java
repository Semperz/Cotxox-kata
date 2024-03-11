package edu.badpals.cotxox.conductores;

import java.util.ArrayList;

public class Conductor {
    private String nombre = "";
    private String modelo = "";
    private String matricula = "";
    private double valoracionMedia = 0.0;
    private boolean ocupado = false;
    private ArrayList<Byte> valoraciones;

    public Conductor(){};

    public Conductor(String nombre) {
        this.nombre = nombre;
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

}
