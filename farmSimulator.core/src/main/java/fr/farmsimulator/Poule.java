package fr.farmsimulator;

public class Poule {
    private String nom;
    private int prix;
    private int jours;
    private int faim;
    private boolean mort;

    public Poule(String nom, int prix, int jours,  int faim, boolean mort) {
        this.nom = nom;
        this.prix = prix;
        this.jours = jours;
        this.faim = faim;
        this.mort = mort;
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
    public boolean isMort() {
        return mort;
    }
    public void setMort(boolean mort) {
        this.mort = mort;
    }
}
