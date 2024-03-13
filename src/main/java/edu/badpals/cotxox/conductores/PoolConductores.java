package edu.badpals.cotxox.conductores;

import java.util.List;

public class PoolConductores {
    private List<Conductor> poolConductores;

    public PoolConductores(List<Conductor> poolConductores) {
        this.poolConductores = poolConductores;
    }

    public List<Conductor> getPoolConductores() {
        return poolConductores;
    }
    
    public Conductor asignarConductor() {
        int conductorEnPool = 0;
        Conductor nombreConductor = null;
        for (Conductor conductor : poolConductores) {
            if (!conductor.isOcupado()) {
                conductor.setOcupado(true);
                nombreConductor = conductor;
                break;
            } else {
                conductorEnPool++;
            }
        }
        return nombreConductor;
    }
}
