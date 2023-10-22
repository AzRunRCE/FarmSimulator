package fr.farmsimulator.Actions;

import fr.farmsimulator.beans.Ferme;
import fr.farmsimulator.beans.Magasin;
import fr.farmsimulator.beans.Poule;

public class AcheterUnePouleAction {

        public AcheterUnePouleAction(Ferme maFerme) {

            Magasin magasin = new Magasin();
            int prixPoule = magasin.getPrixPoule();
            int nombreDePieces = maFerme.getPieces();

            if (nombreDePieces >= prixPoule) {
                int soustraction = nombreDePieces - prixPoule;
                maFerme.setPieces(soustraction); // Mettre à jour le solde de la ferme
                maFerme.poules.add(new Poule());
            } else {
                System.out.println("Solde insuffisant pour acheter la poule.");
            }
        }
    }
