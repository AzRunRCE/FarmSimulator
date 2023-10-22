package fr.farmsimulator;
import fr.farmsimulator.beans.Ferme;
import fr.farmsimulator.config.ConfigurationFerme;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class FermeTest {

    //TODO: Créer une class ConfigurationFerme
    //TODO: Supprimer la class Production
    //TODO: Implémenter une methode getPonteJour() (0 ou x)
    //TODO: GetPonteTotalJour qui fais appel a chacune de tes poules de ton poulalier et qui somme le tous.
    @Test
    public void constructorFermeTest() {
        ConfigurationFerme config = new ConfigurationFerme(150, 2);
        Ferme maFerme = new Ferme(config);
        assertNotNull(maFerme);
    }

    @Test
    public void initialisationFermeTest() {

        int piece = 100;
        int nombrePoule = 5;

        ConfigurationFerme config = new ConfigurationFerme(piece, nombrePoule);
        Ferme maFerme = new Ferme(config);

        assertNotNull(maFerme);
        assertEquals(piece, maFerme.pieces);
        assertEquals(nombrePoule, maFerme.poules.size());

        System.out.println("Nombre de poule : " + maFerme.poules.size());

    }


}
