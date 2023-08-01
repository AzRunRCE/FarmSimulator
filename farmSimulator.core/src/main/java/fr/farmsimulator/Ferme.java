package fr.farmsimulator;

import java.util.ArrayList;
import java.util.List;

public class Ferme {
    public List<Poule> poules;
    public int pieces;

    public Ferme(int pieces) {
       this.pieces = pieces;
       poules = new ArrayList<>();
       Poule poule = new Poule();
       poule.setNom("Robert");
       poules.add(poule);
    }
}

