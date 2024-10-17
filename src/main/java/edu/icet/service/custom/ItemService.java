package edu.icet.service.custom;


import edu.icet.model.Item;
import edu.icet.service.SuperService;
import javafx.collections.ObservableList;

public interface ItemService extends SuperService {
    String genarateItemCode();
    boolean addItem(Item item);
    ObservableList getAllItem();
    boolean updateItem(Item item);
    boolean deleteItemById(String id);
    Item searchItemUByName(String name);
}
