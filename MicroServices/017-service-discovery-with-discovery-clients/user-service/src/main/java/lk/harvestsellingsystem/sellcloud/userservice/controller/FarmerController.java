package lk.harvestsellingsystem.sellcloud.userservice.controller;

import lk.harvestsellingsystem.sellcloud.servicecloudmodel.model.user.Buyer;
import lk.harvestsellingsystem.sellcloud.servicecloudmodel.model.user.Farmer;
import lk.harvestsellingsystem.sellcloud.servicecloudmodel.types.FarmerType;
//import lk.harvestsellingsystem.sellcloud.userservice.repository.FarmerTypeRepository;
import lk.harvestsellingsystem.sellcloud.userservice.service.BuyerService;
import lk.harvestsellingsystem.sellcloud.userservice.service.FarmerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/services/farmer")
public class FarmerController {

    @Autowired
    FarmerService farmerService;

    @PostMapping
    public Farmer save(@RequestBody Farmer farmer) {
        return farmerService.save(farmer);
    }

    @GetMapping(value = "/{id}")
    public Optional<Farmer> findById(@PathVariable("id") int farmerId) {
        return farmerService.findById(farmerId);
    }

//    @GetMapping(value = "/type/{id}")
//    public Optional<FarmerType> findByFramerTypeId(@RequestParam("id") int farmerTypeId) {
//        return farmerTypeRepository.findById(farmerTypeId);
//    }

    @GetMapping()
    public List<Farmer> getUsers() {
        return farmerService.findAll();
    }
}
