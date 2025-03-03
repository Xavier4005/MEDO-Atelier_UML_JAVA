package Projet.Models;

import Projet.DBGestion;

import java.util.ArrayList;
import java.util.List;

public class GestionEtudiant {
    private List<Etudiant> listeEtudiantARenvoyer;

    public GestionEtudiant() {
        this.listeEtudiantARenvoyer = new ArrayList<>();
    }

    public List<Etudiant> getListeEtudiantARenvoyer() {
        DBGestion db = new DBGestion();
        listeEtudiantARenvoyer = db.getListEtudiantARenvoyer();
        return listeEtudiantARenvoyer;
    }

    public void afficherListeEtudiantARenvoyer() {
        for(Etudiant etudiant : listeEtudiantARenvoyer ) {
            System.out.println("La liste des etudiants a  renvoyer \n");
            System.out.println("Nom: " + etudiant.getNom() + " Prenom: " + etudiant.getPrenom() + " Nombre d'heure d'absence " + etudiant.getNombreHeureAbsence());
        }
    }
}
