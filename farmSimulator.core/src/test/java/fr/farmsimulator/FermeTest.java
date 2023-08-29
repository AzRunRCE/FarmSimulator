package fr.farmsimulator;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static fr.farmsimulator.Production.productionOeufs;
import static fr.farmsimulator.utils.NomAleatoire.AjouterNom;
import static junit.framework.Assert.*;

public class FermeTest {
    @Test
    public void constructorFermeTest() {
        Ferme maFerme = new Ferme(100);
        assertNotNull(maFerme);
    }
  

    //TODO: Créer une class ConfigurationFerme
    //TODO: Supprimer la class Production
    //TODO: Implémenter une methode getPonteJour() (0 ou x)
    //TODO: GetPonteTotalJour qui fais appel a chacune de tes poules de ton poulalier 
    et qui somme le tous.

      /*  var ferme = new Ferme(new ConfigurationFerme() {
        nbPoule=1,
        Argent=10
    }); */
    @Test
    public void initialisationFermeTest() {
        Ferme maFerme = new Ferme(100);

        assertNotNull(maFerme);
        assertEquals(100, maFerme.pieces);
        assertEquals(1, maFerme.poules.size());

        System.out.println("Nombre de poule : " + maFerme.poules.size());

        /*
        Affiche les noms de la liste des poules
        for (Poule poule : maFerme.poules) {
            System.out.println("Nom : " + poule.getNom());
        }
        */
    }

     //TODO: When_AucunePoule_Then_ProductionOeuf_ShouldReturn_0Oeuf

     //TODO: Créer un class ProductionTest
    @Test
    public void productionOeufAucunePouleTest() {
        List<Poule> poules = new ArrayList<>();
        int totalDesOeufs = Production.productionOeufs(poules);

        // Aucune poule dans la list
        assertEquals(0, totalDesOeufs);

        //System.out.println("Sur " + poules.size() + " poule, vous avez eu " + totalDesOeufs + " oeufs");
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

        //System.out.println("Sur " + nombreDePoules + " poule, vous avez eu " + totalDesOeufs + " oeuf(s)");
    }

    @Test
    public void productionOeufDeuxPoulesTest() {
        Ferme maFerme = new Ferme(100);

        // Ajout d'une nouvelle poule
        maFerme.poules.add(new Poule());

        int nombreDePoules = maFerme.poules.size();
        int totalDesOeufs = productionOeufs(maFerme.poules);

        assertTrue("Le total des oeufs doit être supérieur ou égale à 0",
                totalDesOeufs >= 0);
        assertTrue("Le total des oeufs doit être inférieur et égale 2 poules multiplié par 2",
                totalDesOeufs <= nombreDePoules * 2);

        //System.out.println("Sur " + nombreDePoules + " poules, vous avez eu " + totalDesOeufs + " oeuf(s)");

    }

    @Test
    public void AcheterPouleActionTest() {
        Ferme maFerme = new Ferme(1000);
        Poule nouvellePoule = new Poule();

        List<String> noms = new ArrayList<>();
        for (Poule poule : maFerme.poules) {
            noms.add(poule.getNom());
        }

        String nouveauNom = AjouterNom(noms);

        new AcheterPouleAction(maFerme, nouvellePoule, nouveauNom);

        assertTrue("Le nombre de poule de la ferme est supérieur à 2",
                maFerme.poules.size() > 1);
//        assertEquals(85, maFerme.pieces);

        System.out.println(maFerme.pieces);

        for (Poule poule : maFerme.poules) {
            System.out.println("Nom : " + poule.getNom());
        }

    }
}
