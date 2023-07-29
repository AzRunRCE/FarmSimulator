package fr.farmsimulator;

import org.testng.annotations.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

public class FermeTest {
    @Test
    public void constructorFermeTest () {
        Ferme maFerme = new Ferme(100);
        assertNotNull(maFerme);
    }

    @Test
    public void initialisationFermeTest () {
        Ferme maFerme = new Ferme(100);
        assertNotNull(maFerme);
        assertEquals(100, maFerme.pieces);
        assertEquals(1, maFerme.poules.size());
    }

}
