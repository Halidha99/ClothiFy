package edu.icet.service.custom.impl;

import edu.icet.model.Supplier;
import edu.icet.service.custom.SupplierService;
import javafx.collections.ObservableList;

public class SupplierServiceImpl implements SupplierService {
    @Override
    public String generateSupplierId() {
        return "";
    }

    @Override
    public boolean addSupplier(Supplier supplier) {
        return false;
    }

    @Override
    public ObservableList getAllSupplier() {
        return null;
    }

    @Override
    public boolean updateSupplier(Supplier supplier) {
        return false;
    }

    @Override
    public boolean deleteSupplierById(String id) {
        return false;
    }

    @Override
    public Supplier searchSupplierrByName(String name) {
        return null;
    }
}
