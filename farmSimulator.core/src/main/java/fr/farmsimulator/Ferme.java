package fr.farmsimulator;

import java.util.ArrayList;
import java.util.List;

public class Ferme {
    public List<Poule> poules;
    public int pieces;

    public Ferme(int pieces) {
       this.pieces = pieces;
       poules = new ArrayList<>();
       Poule poule = new Poule("Robert");
       //poule.setNom("Robert");
       poules.add(poule);
    }

    public List<Poule> getPoules() {
        return poules;
    }

    public void setPoules(List<Poule> poules) {
        this.poules = poules;
    }

    public int getPieces() {
        return pieces;
    }

    public void setPieces(int pieces) {
        this.pieces = pieces;
    }
}

