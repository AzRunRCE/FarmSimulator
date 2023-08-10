package fr.farmsimulator.utils;

import java.util.*;

public class NomAleatoire {

    private static final List<String> listeNoms = Arrays.asList("Max", "Bella", "Charlie", "Lucy", "Cooper");

    public static String AjouterNom(List<String> nomsIndisponibles) {

        List<String> nomsDisponibles = new ArrayList<>(listeNoms);
        nomsDisponibles.removeAll(nomsIndisponibles);

        if (!nomsDisponibles.isEmpty()) {
            Random random = new Random();

            int randomNombre = random.nextInt(nomsDisponibles.size());

            return nomsDisponibles.get(randomNombre);

        } else {
            return "Poule";
        }

    }
}
