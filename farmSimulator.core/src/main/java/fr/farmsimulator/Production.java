package fr.farmsimulator;
import java.util.List;

public class Production {
    public static int productionOeufs(List<Poule> poules) {
        int nombreTotalOeufs = 0;

        for (Poule poule : poules) {
            // Génère un nombre aléatoire entre 0 et 2 inclus !
            int nombreOeufs = (int) (Math.random() * 3);
            nombreTotalOeufs += nombreOeufs;
        }

        return nombreTotalOeufs;
    }
}
