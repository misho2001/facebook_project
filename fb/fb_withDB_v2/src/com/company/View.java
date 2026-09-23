package com.company;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class View {
    Connection connection;
    @FXML
    ImageView imageView;
    @FXML
    TextField textfield;
    @FXML
    PasswordField pfield;

    public View() throws SQLException {

        DB db = new DB();
        this.connection = db.connection;
    }

    public int save_btn() {
        String password = pfield.getText();
        String login = textfield.getText();

        // უსაფრთხო მიდგომა PreparedStatement-ით (SQL Injection-ისგან დაცვა)
        String sql = "INSERT INTO person(Login, Password) VALUES (?, ?)";

        int result = 0;
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, login);
            statement.setString(2, password);
            result = statement.executeUpdate();
            System.out.println("მონაცემები წარმატებით გაიგზავნა TiDB Cloud ბაზაში!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}