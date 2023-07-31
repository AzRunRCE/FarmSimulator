package fr.farmsimulator;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static fr.farmsimulator.Production.productionOeufs;
import static junit.framework.Assert.*;

public class FermeTest {
    @Test
    public void constructorFermeTest() {
        Ferme maFerme = new Ferme(100);
        assertNotNull(maFerme);
    }

    @Test
    public void initialisationFermeTest() {
        Ferme maFerme = new Ferme(100);

        assertNotNull(maFerme);
        assertEquals(100, maFerme.pieces);
        assertEquals(1, maFerme.poules.size());

        System.out.println("Nombre de poule : " + maFerme.poules.size());

        // Affiche les noms de la liste des poules
        for (Poule poule : maFerme.poules) {
            System.out.println("Nom : " + poule.getNom());
        }
    }

    @Test
    public void productionOeufAucunePouleTest() {
        List<Poule> poules = new ArrayList<>();
        int totalDesOeufs = Production.productionOeufs(poules);

        // Aucune poule dans la list
        assertEquals(0, totalDesOeufs);

        System.out.println("Sur " + poules.size() + " poule, vous avez eu " + totalDesOeufs + " oeufs");
    }

    @Test
    public void productionOeufUnePouleTest() {
        Ferme maFerme = new Ferme(100);

        int nombreDePoules = maFerme.poules.size();
        int totalDesOeufs = productionOeufs(maFerme.poules);

        assertTrue("Le total des oeufs doit être supérieur ou égale à 0",
                totalDesOeufs >= 0);
        assertTrue("Le total des oeufs doit être inférieur et égale à 1 poule multiplié par 2",
                totalDesOeufs <= nombreDePoules * 2);

        System.out.println("Sur " + nombreDePoules + " poule, vous avez eu " + totalDesOeufs + " oeuf(s)");
    }

    @Test
    public void productionOeufDeuxPoulesTest() {
        Ferme maFerme = new Ferme(100);

        // Ajout d'une nouvelle poule
        maFerme.poules.add(new Poule("Roberta", 15, 30, 5, false));

        int nombreDePoules = maFerme.poules.size();
        int totalDesOeufs = productionOeufs(maFerme.poules);

        assertTrue("Le total des oeufs doit être supérieur ou égale à 0",
                totalDesOeufs >= 0);
        assertTrue("Le total des oeufs doit être inférieur et égale 2 poules multiplié par 2",
                totalDesOeufs <= nombreDePoules * 2);

        System.out.println("Sur " + nombreDePoules + " poules, vous avez eu " + totalDesOeufs + " oeuf(s)");

    }
}
