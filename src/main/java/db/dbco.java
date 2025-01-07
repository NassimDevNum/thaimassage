package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbco {
    private static final String URL = "jdbc:mysql://localhost:3306/thaimmassage"; // Remplace par tes infos
    private static final String USER = "root"; // Ton utilisateur MySQL
    private static final String PASSWORD = "root"; // Ton mot de passe MySQL

    public static Connection getConnection() {
        try {
            // Charger le driver MySQL (pas nécessaire depuis les versions modernes de Java)
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println("Erreur de connexion à la base de données : " + e.getMessage());
            return null;
        }
    }
}
