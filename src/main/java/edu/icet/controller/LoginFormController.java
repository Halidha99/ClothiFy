package edu.icet.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import edu.icet.entity.UserEntity;
import edu.icet.util.CrudUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.ResultSet;

public class LoginFormController {

    @FXML
    private JFXButton btnCancel;

    @FXML
    private JFXButton btnLogin;

    @FXML
    private Label lblLogin;

    @FXML
    private Label lblSoreName;

    @FXML
    public JFXTextField txtEmail;

    @FXML
    public Hyperlink txtFGPassword;

    @FXML
    public JFXPasswordField txtpassword;

    private String userRole;

    @FXML
    void btnLoginOnAction(ActionEvent event) {


        UserEntity user = getUser();

        if (userRole != null) {
            ((Stage) btnLogin.getScene().getWindow()).close();
            Stage stage = new Stage();
            try {

                FXMLLoader loader = new FXMLLoader(getClass().getResource("../View/dash-board-form.fxml"));
                Parent root = loader.load();


                stage.setScene(new Scene(root));
                stage.setResizable(false);
                stage.show();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            lblLogin.setText("Invalid credentials. Please try again.");
        }
    }

    public UserEntity getUser() {
//        ResultSet resultSet = CrudUtil.execute();
           return null;
    }




    @FXML
    void btnRegisterOnAction(ActionEvent event) {


            Stage stage = new Stage();
            stage.setTitle("Admin Login");
            stage.setResizable(false);

            try {

                Parent root = FXMLLoader.load(getClass().getResource("/View/user_registeration_form.fxml"));
                Scene scene = new Scene(root);

                stage.setScene(scene);
                stage.show();


                ((Stage)(((Node) event.getSource()).getScene().getWindow())).close();

            } catch (IOException e) {
                e.printStackTrace();

                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Error loading admin login form.");
                alert.show();
            }
        }



}
