package com.teame.factory;


import com.teame.dto.EtudiantDto;
import com.teame.model.Etudiant;


public interface EtudiantFactory {
    Etudiant creerEtudiant(String nom, boolean isPresent);
}


