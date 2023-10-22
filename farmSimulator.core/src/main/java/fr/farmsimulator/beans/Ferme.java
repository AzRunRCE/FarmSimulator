package fr.farmsimulator.beans;

import fr.farmsimulator.config.ConfigurationFerme;

import java.util.List;

public class Ferme {
    public int pieces;
    public List<Poule> poules;
    public int jour;

    public Ferme(ConfigurationFerme config) {
        this.pieces = config.pieces;
        this.poules = config.poules;
        this.jour = 1;
    }

    public int getPieces() {
        return pieces;
    }

    public int getJour() {
        return jour;
    }

    public void setJour(int jour) {
        this.jour = jour;
    }

    public void setPieces(int pieces) {
        this.pieces = pieces;
    }

    public List<Poule> getPoules() {
        return poules;
    }

    public void setPoules(List<Poule> poules) {
        this.poules = poules;
    }
}