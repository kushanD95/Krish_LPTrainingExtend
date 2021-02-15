package lk.harvestsellingsystem.sellcloud.itemservice.itemservice.controller;

import lk.harvestsellingsystem.sellcloud.commons.model.Item;
import lk.harvestsellingsystem.sellcloud.itemservice.itemservice.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping(value = "/item", method = RequestMethod.POST)
    @PreAuthorize("hasRole('ROLE_farmer')")
    public Item save(@RequestBody Item item) {
        return itemService.save(item);
    }

    @RequestMapping(value = "/item", method = RequestMethod.GET)
    @PreAuthorize("hasAuthority('read_item')")
    public Optional<Item> fetch(@RequestParam int itemId) {
        return itemService.findById(itemId);
    }

    @RequestMapping(value = "/items", method = RequestMethod.GET)
    @PreAuthorize("hasAuthority('read_item')")
    public List<Item> fetch() {
        return itemService.findAll();
    }

    @RequestMapping(value = "/item", method = RequestMethod.PUT)
    @PreAuthorize("hasRole('ROLE_buyer')")
    public Optional<Item> itemRequest(@RequestParam int itemId) {
        Optional<Item> item = null;
        if(itemService.itemRequest(itemId) == 1) {
            item = fetch(itemId);
        }
        return item;
    }

}
