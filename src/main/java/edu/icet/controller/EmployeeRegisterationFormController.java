package edu.icet.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class EmployeeRegisterationFormController {

    @FXML
    private ComboBox<?> cmbTitle;

    @FXML
    private DatePicker dobEmpDate;

    @FXML
    private TableColumn<?, ?> empColAddress;

    @FXML
    private TableColumn<?, ?> empColBankAccountNo;

    @FXML
    private TableColumn<?, ?> empColBankBranch;

    @FXML
    private TableColumn<?, ?> empColContact;

    @FXML
    private TableColumn<?, ?> empColDob;

    @FXML
    private TableColumn<?, ?> empColId;

    @FXML
    private TableColumn<?, ?> empColName;

    @FXML
    private TableColumn<?, ?> empColNic;

    @FXML
    private TableView<?> empTable;

    @FXML
    private Label lblSoreName;

    @FXML
    private TextField txtEmpAddress;

    @FXML
    private TextField txtEmpBankAcc;

    @FXML
    private TextField txtEmpBankBranch;

    @FXML
    private TextField txtEmpContact;

    @FXML
    private TextField txtEmpId;

    @FXML
    private TextField txtEmpNic;

    @FXML
    private TextField txtEmpname;

    @FXML
    private TextField txtSearchBar;

    @FXML
    void btnBackOnAction(ActionEvent event) {

    }

    @FXML
    void btnClearOnAction(ActionEvent event) {

    }

    @FXML
    void btnDeleteOnAction(ActionEvent event) {

    }

    @FXML
    void btnSaveOnAction(ActionEvent event) {

    }

    @FXML
    void btnUpdateOnAction(ActionEvent event) {

    }

    @FXML
    void txtIdSearchOnAction(ActionEvent event) {

    }

}
