package fr.farmsimulator;

import fr.farmsimulator.beans.Ferme;
import fr.farmsimulator.beans.Poule;
import fr.farmsimulator.config.ConfigurationFerme;
import org.testng.annotations.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TotalPonteParJourTest {

    /*
    * @Exemple de notation
    * When_AucunePoule_Then_ProductionOeuf_ShouldReturn_0Oeuf
    *
    * */

    @Test
        public void When_AucunePoule_Then_getTotalPonteParJour_ShouldReturn_0_Oeuf() {

        int piece = 100;
        int nombrePoule = 0;

        ConfigurationFerme config = new ConfigurationFerme(piece, nombrePoule);
        Ferme maFerme = new Ferme(config);
        int nombreTotalOeufs = Poule.getTotalPonteParJour(maFerme.poules.size());

        assertEquals(nombreTotalOeufs, 0);
    }

    @Test
    public void When_10_Poules_Then_getTotalPonteParJour_ShouldReturn_entre_0Et10_Oeufs() {

        int piece = 100;
        int nombrePoule = 10;

        ConfigurationFerme config = new ConfigurationFerme(piece, nombrePoule);
        Ferme maFerme = new Ferme(config);
        int nombreTotalOeufs = Poule.getTotalPonteParJour(maFerme.poules.size());

        assertTrue("Le total des oeufs doit être inférieur au nombre de poule ou égale à 0",
                nombreTotalOeufs >= 0 && nombreTotalOeufs <= nombrePoule);
    }
}
