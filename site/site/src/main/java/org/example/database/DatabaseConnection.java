package org.example.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private Connection connection;

    public void connect(String dbPath){
        try{
        connection = DriverManager.getConnection("jdbc:sqlite:" + dbPath);
        } catch (SQLException e){
          throw new RuntimeException(e);
        }
    }

    public void disconnect(){
        if(connection==null){
            return;
        }

        try {
            //connection.commit();
            connection.close();
        }catch (SQLException e){
            System.err.println(e.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
