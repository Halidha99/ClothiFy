package edu.icet.service.custom;

import edu.icet.model.Employee;
import edu.icet.service.SuperService;
import javafx.collections.ObservableList;

public interface EmployeeService extends SuperService {

//    CRUD OPERATIONS
    String generateEmployeeId();
    boolean addEmployee(Employee employee);
    ObservableList getAllEmployees();
    boolean updateEmployee(Employee employee);
    boolean deleteEmployeeById(String id);
    Employee searchEmployeeByContact(String contact);


}
