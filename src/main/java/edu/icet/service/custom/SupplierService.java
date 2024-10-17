package edu.icet.service.custom;

import edu.icet.model.Supplier;
import edu.icet.service.SuperService;
import javafx.collections.ObservableList;

public interface SupplierService extends SuperService {
    String generateSupplierId();
    boolean addSupplier(Supplier supplier);
    ObservableList getAllSupplier();
    boolean updateSupplier(Supplier supplier);
    boolean deleteSupplierById(String id);
    Supplier searchSupplierrByName(String name);

}
