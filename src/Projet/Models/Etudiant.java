package Projet.Models;

import java.util.Date;

public class Etudiant {
    private int id;
    private String nom;
    private String prenom;
    private int matricule;
    private Statut statut;
    private Date dateAdmission;
    private double nombreHeureAbsence;

    public Etudiant() {}

    public Etudiant(int id, String nom, String prenom, double nombreHeureAbsence) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nombreHeureAbsence = nombreHeureAbsence;
    }

    public Etudiant(String nom, String prenom, int matricule, Statut statut, Date dateAdmission, double nombreHeureAbsence ) {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
        this.statut = statut;
        this.dateAdmission = dateAdmission;
        this.nombreHeureAbsence = nombreHeureAbsence;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getMatricule() {
        return matricule;
    }
    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public Statut getStatut() {
        return statut;
    }
    public void setStatut(Statut statut) {
        this.statut = statut;
    }

    public Date getDateAdmission() {
        return dateAdmission;
    }
    public void setDateAdmission(Date dateAdmission) {
        this.dateAdmission = dateAdmission;
    }

    public double getNombreHeureAbsence() {
        return nombreHeureAbsence;
    }
    public void setNombreHeureAbsence(double nombreHeureAbsence) {
        this.nombreHeureAbsence = nombreHeureAbsence;
    }
}
