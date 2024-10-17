package edu.icet.service.custom.impl;

import edu.icet.model.Employee;
import edu.icet.service.custom.EmployeeService;
import javafx.collections.ObservableList;

public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public String generateEmployeeId() {
        return "";
    }

    @Override
    public boolean addEmployee(Employee employee) {
       // System.out.println("Service :"+employee);
        return false;
    }

    @Override
    public ObservableList getAllEmployees() {
        return null;
    }

    @Override
    public boolean updateEmployee(Employee employee) {
        return false;
    }

    @Override
    public boolean deleteEmployeeById(String id) {
        return false;
    }

    @Override
    public Employee searchEmployeeByContact(String contact) {
        return null;
    }


}
