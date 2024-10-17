package edu.icet.controller;

import edu.icet.model.Employee;
import edu.icet.service.ServiceFactory;
import edu.icet.service.SuperService;
import edu.icet.service.custom.EmployeeService;
import edu.icet.util.ServiceType;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class EmployeeRegisterationFormController implements Initializable {

    @FXML
    private ComboBox<String> cmbTitle;

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
   public void btnDeleteOnAction(ActionEvent event) {
//        if (service.deleteCustomer(txtEmpId.getText())){
//            new Alert(Alert.AlertType.INFORMATION,"Employee Deleted !!").show();
//        }else{
//            new Alert(Alert.AlertType.ERROR).show();
//        }
//    }

    }

    @FXML
  public  void btnSaveOnAction(ActionEvent event) {
       EmployeeService employeeService = ServiceFactory.getInstance().getServiceType(ServiceType.EMPLOYEE);
       Employee employee= new Employee(
             txtEmpId.getText(),
                cmbTitle.getValue(),
                txtEmpname.getText(),
                txtEmpNic.getText(),
                txtEmpAddress.getText(),
                dobEmpDate.getValue(),
                txtEmpContact.getText(),
                txtEmpBankAcc.getText(),
                txtEmpBankBranch.getText()


        );
       // System.out.println(employee);
        if (employeeService.addEmployee(employee)) {
            new Alert(Alert.AlertType.INFORMATION,"Employee Added !!").show();
        }else {
            new Alert(Alert.AlertType.ERROR,"Employee Not Added :(").show();
        }

clear();




    }

    @FXML
    void btnUpdateOnAction(ActionEvent event) {

    }

    @FXML
    void txtIdSearchOnAction(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<String> tittle = FXCollections.observableArrayList();
        tittle.add("MR");
        tittle.add("MRS");
        tittle.add("MIS");
        cmbTitle.setItems(tittle);
    }
    private  void clear(){
        txtEmpId.setText("");
        txtEmpname.setText("");
        txtEmpNic.setText("");
        txtEmpAddress.setText("");
        dobEmpDate.setValue(null);
        txtEmpContact.setText("");
        txtEmpBankAcc.setText("");
        txtEmpBankBranch.setText("");

    }
}
