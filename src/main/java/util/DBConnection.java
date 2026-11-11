package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static final String URL =
            "jdbc:mysql://localhost:3306/municipalitydb";

    private static final String USER =
            "Ashwin";

    private static final String PASSWORD =
            "Zinger@2026";

    public static Connection
            getConnection() {

        Connection con = null;

        try {

            con = DriverManager.getConnection(
                    URL,
                    USER,
                    PASSWORD);

        } catch (SQLException e) {

            e.printStackTrace();

        }

        return con;
    }
}
