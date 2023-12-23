# GestionAbsences App

## Description
Application de gestion d'absence des etudiant,  sachant que chaque etudiant peut etre de la team Java ou team DotNet, respectant les principes SOLID et applicant les Design patterns on vas traiter des etudiants sous forme des dto format text toute on raison sur un attribut etat qui fait reference a la presence de l'etat de presence d'un etudiant durant une seance afin qu on genere un fichier txt de presence .

## Fonctionnement
1. **Lecture des donneess** :
   - Les donnees des étudiants sont lues depuis un fichier texte (`etudiants.txt`). Chaque ligne represente un étudiant avec le format `"nom|equipe|isPresent"`.

2. **Traitement** :
   - Les lignes lues sont transformées en objets `EtudiantDto`, contenant le nom, team-equipe (Java ou DotNet), l'etat de présence de l'etudiant.

3. **Enregistrement des presences** :
   - Selon l'etat de présence de chaque etudiant, leurs informations sont ecrits dans un fichier de sortie.

### fonctionnement
- Tout d'abord l'app lit le fichier d'entre.
- Elle utilise un Factory Method pour creer des objets `EtudiantDto`.
- Les informations sur les présences et absences sont ensuite enregistrées dans un fichier de sortie unique par le biais d'une instance Singleton de `FichierPresence`.

## Design Patterns

1. **Singleton** :
   - Utilisé pour la classe `FichierPresence`, qui garantit une seule instance pour gérer le fichier de sortie.
2. **Factory Method** :
   - Encapsule la creation d'objets `EtudiantDto`, facilitant la creation d'etudiants des team Java et DotNet.
   - `JavaEtudiant` et `DotNetEtudiant` qui implemente `Etudiant`.

## How to Run
1. Posez votre fichier `etudiants.txt`.
2. Executer `App`.
3. Consulter le fichier produit dans le dossier pour les infos sur les presences.

## Auteurs
- [Meryam LAARAJ]
- [Fatima-Zahra BOUDAD]
- [Reda EL AYADI]
- [Yassine CHALH]