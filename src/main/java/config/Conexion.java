package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private final String database = "base-eo";
    private final String hostname = "localhost";
    private final String port = "3306";
    private final String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database;
    private final String username = "root";
    private final String password = "";

    public Connection conectarMySQL() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            System.out.println(e.getCause());
        }
        return conn;
    }
}
