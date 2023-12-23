package com.teame.tools;

import com.teame.dto.EtudiantDto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FichierUtil {

    /**
     * lire un fichier d'etudiants et retourner une liste d'etudiants
     * @param cheminFichier
     * @return
     * @throws IOException
     */
    public static List<EtudiantDto> lireFichierEtudiants(String cheminFichier) throws IOException {

        List<EtudiantDto> etudiants = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(cheminFichier))) {

            String ligne;

            while ((ligne = reader.readLine()) != null) {
                String[] fields = ligne.split("\\|");
                String nom = fields[0];
                String equipe = fields[1];
                boolean isPresent = Boolean.parseBoolean(fields[2]);

                EtudiantDto etudiant = new EtudiantDto(nom, equipe, isPresent);
                etudiants.add(etudiant);
            }
        }
        return etudiants;
    }
}
