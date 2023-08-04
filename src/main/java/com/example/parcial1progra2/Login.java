package com.example.parcial1progra2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.application.Application.launch;

public class Login {

    public static void show(String username) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Login.class.getResource("hello-view.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(fxmlLoader.load(), 652, 442);
        stage.setTitle("Programa");
        stage.setScene(scene);
        stage.show();

    }
    String USERNAME = "elferras2000";
    String PASSWORD = "ceromil";
    @FXML
    private TextField fiel1;
    @FXML
    private PasswordField fielpass;


    public void ingreso1() throws IOException {
        String username = fiel1.getText();
        String password = fielpass.getText();

        if (username.equals(USERNAME) && password.equals(PASSWORD)) {
            Login.show(username);
            Stage loginStage = (Stage) fiel1.getScene().getWindow();
            loginStage.close();
        } else {
            System.out.println("Credenciales incorrectas. Inténtalo de nuevo.");
        }
    }
}
