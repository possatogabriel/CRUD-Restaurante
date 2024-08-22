package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connector {
    public static void main(String[] argv){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String passwd = "1234";

        Connection connection = null;

        try {
            connection = DriverManager.getConnection(url, user, passwd);
            System.out.println("Conexão estabelecida com sucesso!");

            Statement statement = connection.createStatement();
            String sql = "select * from test";
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                System.out.println("Nome: " + resultSet.getString("name"));
                System.out.println("Idade: " + resultSet.getString("idade"));
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            if (connection != null) {
                try {
                    connection.close();
                }
                catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
