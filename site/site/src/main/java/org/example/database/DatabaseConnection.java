package org.example.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    private Connection connection;

    public void connect(String dbPath){
        connection = DriverManager.getConnection("jdbc:sqlite:" + dbPath);
    }
    public void disconnect(){

    }

    public Connection getConnection() {
        return connection;
    }
}
