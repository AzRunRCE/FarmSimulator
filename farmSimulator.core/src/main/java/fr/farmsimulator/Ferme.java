package fr.farmsimulator;

import java.util.ArrayList;
import java.util.List;

public class Ferme {
    public List<Poule> poules;
    public Ferme() {
       poules = new ArrayList<>();
       Poule poule = new Poule();
       poules.add(poule);
    }
}

