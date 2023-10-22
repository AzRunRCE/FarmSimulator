package fr.farmsimulator.config;

import fr.farmsimulator.beans.Poule;

import java.util.ArrayList;
import java.util.List;

public class ConfigurationFerme {

    public int pieces;
    public int nombrePoule;
    public List<Poule> poules;

    public ConfigurationFerme(int pieces, int nombrePoule) {

        this.pieces = pieces;
        this.nombrePoule = nombrePoule;

        // Créez une nouvelle liste pour stocker les nouvelles poules
        poules = new ArrayList<>();

        // Ajoutez des poules à la liste nouvellesPoules
        for (int i = 0; i < nombrePoule; i++) {
            Poule nouvellePoule = new Poule();
            poules.add(nouvellePoule);
        }

    }

//    public static String AjouterNom(List<String> nomsIndisponibles) {
//
//        List<String> listeNoms = Arrays.asList("Max", "Bella", "Charlie", "Lucy", "Cooper");
//
//        List<String> nomsDisponibles = new ArrayList<>(listeNoms);
//        nomsDisponibles.removeAll(nomsIndisponibles);
//
//        if (!nomsDisponibles.isEmpty()) {
//            Random random = new Random();
//
//            int randomNombre = random.nextInt(nomsDisponibles.size());
//
//            return nomsDisponibles.get(randomNombre);
//
//        } else {
//            return "Poule";
//        }
//
//    }
//
//    public static List<String> ListNomsIndisponibles() {
//        List<String> nomsIndisponibles = new ArrayList<>();
//        for (Poule poule : ferme.poules) {
//            nomsIndisponibles.add(poule.getNom());
//        }
//        return nomsIndisponibles;
//    }
}
