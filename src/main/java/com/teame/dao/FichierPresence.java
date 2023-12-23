package com.teame.dao;

import com.teame.dto.EtudiantDto;
import com.teame.factory.EtudiantFactory;
import com.teame.model.Etudiant;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FichierPresence {

    private static FichierPresence instance = new FichierPresence();

    private FichierPresence() {}

    public static FichierPresence getInstance() {
        return instance;
    }

    public void enregistrerPresence(EtudiantDto etudiantDto, String dir, EtudiantFactory javaFactory, EtudiantFactory dotNetFactory) throws IOException {

        // Convertir EtudiantDto en Etudiant
        Etudiant etudiant = toEtudiant(etudiantDto, javaFactory, dotNetFactory);

        if (etudiant.isPresent()) {
            String chrono = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
            String fileName = dir + "fichier_presence_" + chrono + ".txt";

            try (PrintWriter writer = new PrintWriter(new FileWriter(fileName, true))) {
                String etudiantInfo = String.format("Nom: %s, Team: %s", etudiant.getNom(), etudiant.getEquipe());
                writer.println(etudiantInfo);
            }
        }
    }

    private Etudiant toEtudiant(EtudiantDto etudiantDto, EtudiantFactory javaFactory, EtudiantFactory dotNetFactory) {
        if (Team.JAVA.getName().equals(etudiantDto.getEquipe())) {
            return javaFactory.creerEtudiant(etudiantDto.getNom(), etudiantDto.isPresent());
        } else if (Team.DOTNET.getName().equals(etudiantDto.getEquipe())) {
            return dotNetFactory.creerEtudiant(etudiantDto.getNom(), etudiantDto.isPresent());
        } else {
            throw new IllegalArgumentException("invalid team");
        }
    }
}