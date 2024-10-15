package edu.icet.controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.BubbleChart;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

public class SalesReportFormController {

    @FXML
    private DatePicker DateSales;

    @FXML
    private Label lblSoreName;

    @FXML
    private BubbleChart<?, ?> salesChart;

    @FXML
    private JFXTextField txtsaleCount;

    @FXML
    private JFXTextField txtsalesProfit;

    @FXML
    void btnAnualReportOnAction(ActionEvent event) {

    }

    @FXML
    void btnDailyReportOnAction(ActionEvent event) {

    }

    @FXML
    void btnMonthlyReportOnAction(ActionEvent event) {

    }

    @FXML
    void btnReturnReportOnAction(ActionEvent event) {

    }

}
