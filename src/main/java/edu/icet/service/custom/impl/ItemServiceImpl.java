package edu.icet.service.custom.impl;


import edu.icet.model.Item;
import edu.icet.service.custom.ItemService;
import javafx.collections.ObservableList;

public class ItemServiceImpl  implements ItemService {
    @Override
    public String genarateItemCode() {
        return "";
    }

    @Override
    public boolean addItem(Item item) {
        return false;
    }

    @Override
    public ObservableList getAllItem() {
        return null;
    }

    @Override
    public boolean updateItem(Item item) {
        return false;
    }

    @Override
    public boolean deleteItemById(String id) {
        return false;
    }

    @Override
    public Item searchItemUByName(String name) {
        return null;
    }
}
