package Projet;

import Projet.Models.Etudiant;
import Projet.Models.GestionEtudiant;

public class Main {
    public static void main(String[] args)
    {
        GestionEtudiant gestionEtudiant = new GestionEtudiant();
        gestionEtudiant.getListeEtudiantARenvoyer();
        gestionEtudiant.afficherListeEtudiantARenvoyer();

    }
}
