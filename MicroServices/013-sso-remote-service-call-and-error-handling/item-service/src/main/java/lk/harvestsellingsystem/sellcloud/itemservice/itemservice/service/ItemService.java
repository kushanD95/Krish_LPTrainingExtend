package lk.harvestsellingsystem.sellcloud.itemservice.itemservice.service;

import lk.harvestsellingsystem.sellcloud.commons.model.Item;

import java.util.List;
import java.util.Optional;

public interface ItemService {
    
    Item save(Item item);

    Optional<Item> findById(int itemId);

    List<Item> findAll();

    int itemRequest(int itemId);
}
