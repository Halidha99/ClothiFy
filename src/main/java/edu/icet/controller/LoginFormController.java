package edu.icet.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFormController {

    @FXML
    private JFXButton btnLogin;

    @FXML
    private Label lblLogin;

    @FXML
    private Label lblSoreName;

    @FXML
    private JFXTextField txtEmail;

    @FXML
    private Hyperlink txtFGPassword;

    @FXML
    private JFXPasswordField txtpassword;

    @FXML
    void btnLoginOnAction(ActionEvent event) {
        String email = txtEmail.getText();
        String password = txtpassword.getText();

        if (validateLogin(email, password)) {

            ((Stage) btnLogin.getScene().getWindow()).close();
            Stage stage = new Stage();
            try {
                stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../View/dash-board-form.fxml"))));
                stage.show();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            lblLogin.setText("Invalid credentials. Please try again.");
        }
    }

    private boolean validateLogin(String email, String password) {

        return email.equals("user@example.com") && password.equals("password123");
    }

    @FXML
    void btnRegisterOnAction(ActionEvent event) {
        Stage stage=new Stage();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../../../../resources/View/user_registeration_form.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.show();

    }

}
