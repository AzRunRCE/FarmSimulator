package fr.farmsimulator.utils;

import fr.farmsimulator.beans.Ferme;
import fr.farmsimulator.beans.Poule;

import java.util.ArrayList;
import java.util.List;

public class NomsIndispo {
    public static List<String> ListNomsIndisponibles(Ferme ferme) {
        List<String> nomsIndisponibles = new ArrayList<>();
        for (Poule poule : ferme.poules) {
            nomsIndisponibles.add(poule.getNom());
        }
        return nomsIndisponibles;
    }
}
