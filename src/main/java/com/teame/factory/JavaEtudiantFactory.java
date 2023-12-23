package com.teame.factory;

import com.teame.dto.EtudiantDto;
import com.teame.model.Etudiant;

public class JavaEtudiantFactory implements EtudiantFactory {
    @Override
    public Etudiant creerEtudiant(String nom, boolean isPresent) {
        return new Etudiant(nom, "Java", isPresent);
    }
}
