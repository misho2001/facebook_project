package com.company;

import java.sql.*;



public class DB {

    String url = "jdbc:mysql://gateway01.eu-central-1.prod.aws.tidbcloud.com:4000/facebook_app?useSSL=true&requireSSL=true";
    String user = "2oxHNTFzVgCHZVz.root";
    String password = "mPdTuXCYSexPtq9O";


    Connection connection;
    public DB() throws SQLException {
        connection = DriverManager.getConnection(url,user,password);
    }

    public ResultSet select() throws SQLException {
        ResultSet result = null;
        String sql = "SELECT * FROM person";
        Statement statement = connection.createStatement();
        result = statement.executeQuery(sql);
        return   result;
    }
}
