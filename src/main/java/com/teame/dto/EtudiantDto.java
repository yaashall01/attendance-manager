package com.teame.dto;

public class EtudiantDto {

    private String nom;
    private String equipe;
    private boolean isPresent;

    public EtudiantDto(String nom, String equipe, boolean isPresent) {
        this.nom = nom;
        this.equipe = equipe;
        this.isPresent = isPresent;
    }

    public String getNom() {
        return nom;
    }

    public String getEquipe() {
        return equipe;
    }

    public boolean isPresent() {
        return isPresent;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    public void setPresent(boolean isPresent) {
        this.isPresent = isPresent;
    }

    @Override
    public String toString() {
        return "EtudiantDTO{" +
                "nom='" + nom + '\'' +
                ", equipe='" + equipe + '\'' +
                ", isPresent=" + isPresent +
                '}';
    }
}
