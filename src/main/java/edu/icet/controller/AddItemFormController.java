package edu.icet.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class AddItemFormController {

    @FXML
    private ComboBox<?> cmbSupplier;

    @FXML
    private TableColumn<?, ?> itemColBuyingprc;

    @FXML
    private TableColumn<?, ?> itemColId;

    @FXML
    private TableColumn<?, ?> itemColProfit;

    @FXML
    private TableColumn<?, ?> itemColQty;

    @FXML
    private TableColumn<?, ?> itemColSellingPrc;

    @FXML
    private TableColumn<?, ?> itemColSize;

    @FXML
    private TableColumn<?, ?> itemColSupplierId;

    @FXML
    private TableColumn<?, ?> itemColType;

    @FXML
    private TableColumn<?, ?> itemColdescription;

    @FXML
    private TableView<?> itemTable;

    @FXML
    private Label lblSoreName;

    @FXML
    private TextField txtItemBuyingPrc;

    @FXML
    private TextField txtItemCode;

    @FXML
    private TextField txtItemDescription;

    @FXML
    private TextField txtItemQty;

    @FXML
    private TextField txtItemSellingPrice;

    @FXML
    private TextField txtItemSize;

    @FXML
    private TextField txtItemType;

    @FXML
    private TextField txtSearchBar;

    @FXML
    private TextField txtitemProfit;

    @FXML
    void btnAddStockOnAction(ActionEvent event) {

    }

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
    void btnUpdateOnAction(ActionEvent event) {

    }

    @FXML
    void txtIdSearchOnAction(ActionEvent event) {

    }

}
