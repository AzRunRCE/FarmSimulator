package fr.farmsimulator;

import org.testng.annotations.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

public class FermeTest {

    @Test
    public void constructorFermeTest () {
        Ferme maFerme = new Ferme();
        assertNotNull(maFerme);
    }

    @Test
    public void initialisationFermeTest () {
        Ferme maFerme = new Ferme();
        assertNotNull(maFerme);

        assertEquals(1, maFerme.poules.size());
    }

}
