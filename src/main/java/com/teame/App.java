package com.teame;

import com.teame.dao.FichierPresence;
import com.teame.dto.EtudiantDto;
import com.teame.factory.DotNetEtudiantFactory;
import com.teame.factory.EtudiantFactory;
import com.teame.factory.JavaEtudiantFactory;
import com.teame.tools.FichierUtil;

import java.io.IOException;
import java.util.List;

/**
 *
 *
 * @author TEAM E : Fatty, Mery, Reda, YSL
 *
 */
public class App 
{
    public static void main(String[] args) {
        try {

            EtudiantFactory javaFactory = new JavaEtudiantFactory();
            EtudiantFactory dotNetFactory = new DotNetEtudiantFactory();

            String cheminFichierEntree = "src/main/resources/etudiants.txt";
            String dossierFichiersSortie = "src/main/resources/";


            List<EtudiantDto> etudiants = FichierUtil.lireFichierEtudiants(cheminFichierEntree);

            FichierPresence fichierPresence = FichierPresence.getInstance();

            for (EtudiantDto etudiant : etudiants) {
                fichierPresence.enregistrerPresence(etudiant, dossierFichiersSortie, javaFactory, dotNetFactory);
            }

            System.out.println("Traitement termine! check fichier de presence albatal/batala.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
