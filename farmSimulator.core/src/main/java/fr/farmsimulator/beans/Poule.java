package fr.farmsimulator.beans;

import java.util.Random;

public class Poule {
    private String nom;
    private int prix;
    private int jours;
    private int faim;
    private boolean mort;

    public Poule() {
        this.nom = "Poule";
        this.jours = 1;
        this.faim = 5;
        this.mort = false;
    }

    // Ajouter un nom à une poule
    public Poule(String nom) {
        this(); // Appelle le constructeur par défaut pour les valeurs par défaut
        if (nom != null && !nom.isEmpty()) {
            this.nom = nom;
        }
    }

    public static int getTotalPonteParJour(int totalDesPoules) {



        int nombreTotalOeufs = 0;

        for (int i = 0; i < totalDesPoules; i++) {
            // Génère un nombre aléatoire entre 0 et 1 inclus !
            int nombreOeufs = (int) (Math.random() * 2);
            nombreTotalOeufs += nombreOeufs;
        }
        return nombreTotalOeufs;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getPrix() {
        return prix;
    }
    public void setPrix(int prix) {
        this.prix = prix;
    }
    public int getJours() {
        return jours;
    }
    public void setJours(int jours) {
        this.jours = jours;
    }
    public int getFaim() {
        return faim;
    }
    public void setFaim(int faim) {
        this.faim = faim;
    }
    public boolean isMort() {return mort;}
    public void setMort(boolean mort) {this.mort = mort;}
}
