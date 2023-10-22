package fr.farmsimulator;
import fr.farmsimulator.Actions.AcheterUnePouleAction;
import fr.farmsimulator.beans.Ferme;
import fr.farmsimulator.config.ConfigurationFerme;
import org.testng.annotations.Test;
import static org.junit.Assert.assertEquals;


public class CommerceActionTest {

    @Test
    public void When_AcheterUnePoule_Then_LeNombreDePieces_Should_Diminuer() {

        ConfigurationFerme config = new ConfigurationFerme(100, 5);
        Ferme maFerme = new Ferme(config);

        new AcheterUnePouleAction(maFerme);
        int solde = maFerme.getPieces();

        //prix d'une poule 15 -> résultat attendu 100 - 15 = 85
        assertEquals(solde, 85);
    }

    @Test
    public void When_AcheterUnePoule_Then_LeNombreDePoule_Should_augmenterDeUn() {

        ConfigurationFerme config = new ConfigurationFerme(100, 5);
        Ferme maFerme = new Ferme(config);

        new AcheterUnePouleAction(maFerme);
        int nombreDePoule = maFerme.poules.size();

        // 5 poules + 1 une nouvelle poule = 6
        assertEquals(nombreDePoule, 6);
    }
}


