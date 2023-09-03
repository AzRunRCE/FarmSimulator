package fr.farmsimulator;

public class AcheterPouleAction {

        public AcheterPouleAction(Ferme maFerme, Poule nouvellePoule) {

            int prix = nouvellePoule.getPrix();

            if (maFerme.pieces >= prix) {
                int soustraction = maFerme.pieces - prix;
                maFerme.setPieces(soustraction); // Mettre à jour le solde de la ferme

                maFerme.poules.add(nouvellePoule);
            } else {
                System.out.println("Solde insuffisant pour acheter la poule.");
            }
        }
    }
