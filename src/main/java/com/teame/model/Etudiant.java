package com.teame.model;

public class Etudiant {

    private String nom;
    private String equipe;
    private boolean isPresent;

    public Etudiant(String nom, String equipe, boolean isPresent) {
        this.nom = nom;
        this.equipe = equipe;
        this.isPresent = isPresent;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    public boolean isPresent() {
        return isPresent;
    }

    public void setPresent(boolean present) {
        isPresent = present;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "nom='" + nom + '\'' +
                ", equipe='" + equipe + '\'' +
                ", isPresent=" + isPresent +
                '}';
    }
}