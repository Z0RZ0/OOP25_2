package org.example;

import org.example.auth.AccountManager;
import org.example.database.DatabaseConnection;

import javax.xml.crypto.Data;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        DatabaseConnection db = new DatabaseConnection();
        db.connect("site.db");

        AccountManager am = new AccountManager(db);

        am.register("user1", "password123");
        am.register("user2", "qwerty");

        System.out.println("Uwierzytelniane: "+am.authenticate("user1", "password123"));

        System.out.println(am.getAccount("user1"));
        System.out.println(am.getAccount("smigla"));

        System.out.println(am.getAccount(0));
        System.out.println(am.getAccount(1));

        db.disconnect();

    }
}