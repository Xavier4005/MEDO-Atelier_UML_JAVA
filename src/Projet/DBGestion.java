package Projet;

import Projet.Models.Etudiant;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBGestion {
    private String url = "jdbc:sqlite:c:UQAC_COVID.db";
    public void connect() {
        try (var conn = DriverManager.getConnection(url)) {
            System.out.println("Connection to SQLite has been established.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Etudiant> getListEtudiantARenvoyer() {
        List<Etudiant> listEtudiantARenvoyer = new ArrayList<>();
        var sql = "SELECT id, nom, prenom, nombreHeureAbsence FROM Etudiant WHERE nombreHeureAbsence > 30";
        try (var conn = DriverManager.getConnection(url);
            var stmt  = conn.createStatement();
            var result  = stmt.executeQuery(sql)
        ) {
            while (result.next()) {
                listEtudiantARenvoyer.add(
                        new Etudiant(
                                result.getInt("id"),
                                result.getString("nom"),
                                result.getString("prenom"),
                                result.getDouble("nombreHeureAbsence")
                                ));
            }
            return listEtudiantARenvoyer;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return listEtudiantARenvoyer;
    }
}
