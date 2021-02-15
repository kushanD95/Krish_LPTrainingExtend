package lk.harvestsellingsystem.sellcloud.userservice.controller;

import lk.harvestsellingsystem.sellcloud.servicecloudmodel.model.user.Buyer;
import lk.harvestsellingsystem.sellcloud.servicecloudmodel.model.user.User;
import lk.harvestsellingsystem.sellcloud.userservice.service.BuyerService;
import lk.harvestsellingsystem.sellcloud.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping(value = "/services/buyer")
public class BuyerController {
    @Autowired
    BuyerService buyerService;

    @PostMapping
    public Buyer save(@RequestBody Buyer buyer) {
        return buyerService.save(buyer);
    }

    @GetMapping(value = "/{id}")
    public Optional<Buyer> findById(@PathVariable("id") int buyerId) {
        return buyerService.findById(buyerId);
    }

    @GetMapping()
    public List<Buyer> getUsers() {
        return buyerService.findAll();
    }
}
