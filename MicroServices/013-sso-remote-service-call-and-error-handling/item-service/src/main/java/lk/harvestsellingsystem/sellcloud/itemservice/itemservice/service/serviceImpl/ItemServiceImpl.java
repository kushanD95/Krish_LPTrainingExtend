package lk.harvestsellingsystem.sellcloud.itemservice.itemservice.service.serviceImpl;

import lk.harvestsellingsystem.sellcloud.commons.model.Item;
import lk.harvestsellingsystem.sellcloud.itemservice.itemservice.reopsitory.ItemRepository;
import lk.harvestsellingsystem.sellcloud.itemservice.itemservice.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public Item save(Item item) {
        itemRepository.save(item);
        return item;
    }

    @Override
    public Optional<Item> findById(int itemId) {
        return itemRepository.findById(itemId);
    }

    @Override
    public List<Item> findAll() {
        return itemRepository.findAll();
    }

    @Override
    public int itemRequest(int itemId) {
         return itemRepository.itemRequest(itemId);
    }
}
