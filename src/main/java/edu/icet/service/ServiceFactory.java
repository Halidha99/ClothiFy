package edu.icet.service;


import edu.icet.service.custom.impl.EmployeeServiceImpl;
import edu.icet.service.custom.impl.ItemServiceImpl;
import edu.icet.service.custom.impl.SupplierServiceImpl;
import edu.icet.util.ServiceType;

public class ServiceFactory {
    public static ServiceFactory instance;

    private ServiceFactory() {
    }

    public static ServiceFactory getInstance() {
        return instance == null ? instance = new ServiceFactory() : instance;
    }

    public <T extends SuperService> T getServiceType(ServiceType type) {
        switch (type) {
            case ITEM:
                return (T) new ItemServiceImpl();
            case EMPLOYEE:
                return (T) new EmployeeServiceImpl();
            case SUPPLIER:
                return (T) new SupplierServiceImpl();
        }
        return null;

    }
}
