package fr.farmsimulator;

public class AcheterPouleAction {

        public AcheterPouleAction(Ferme maFerme, Poule nouvellePoule, String nouveauNom) {

            int prix = nouvellePoule.getPrix();

            if (maFerme.pieces >= prix) {
                int soustraction = maFerme.pieces - prix;
                maFerme.setPieces(soustraction); // Mettre à jour le solde de la ferme

                nouvellePoule.setNom(nouveauNom);

                maFerme.poules.add(nouvellePoule);
            } else {
                System.out.println("Solde insuffisant pour acheter la poule.");
            }
        }
    }
