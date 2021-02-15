package lk.harvestsellingsystem.sellcloud.itemservice.controller;

import lk.harvestsellingsystem.sellcloud.itemservice.service.ItemService;
import lk.harvestsellingsystem.sellcloud.servicecloudmodel.model.item.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "services/item")
public class ItemController {
    @Autowired
    ItemService itemService;

    @PostMapping(value = "/{id}")
    public Item save(@RequestBody Item item,@PathVariable("id") int id) {

        return itemService.save(item,id);
    }

    @GetMapping(value = "/{id}")
    public Optional<Item> findById(@PathVariable("id") int itemId) {
        return itemService.findById(itemId);
    }

    @GetMapping(value = "/farmer/{id}")
    public List<Item> findByFarmerId(@PathVariable("id") int itemId) {
        return itemService.findByFarmerId(itemId);
    }

    @GetMapping()
    public List<Item> getUsers() {
        return itemService.findAll();
    }
}
