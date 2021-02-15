package lk.harvestsellingsystem.sellcloud.sellservice.controller;

import lk.harvestsellingsystem.sellcloud.sellservice.model.Response;
import lk.harvestsellingsystem.sellcloud.sellservice.model.modelimpl.CreateSell;
import lk.harvestsellingsystem.sellcloud.sellservice.model.modelimpl.SimpleResponse;
import lk.harvestsellingsystem.sellcloud.sellservice.service.SellService;
import lk.harvestsellingsystem.sellcloud.servicecloudmodel.model.sell.Sell;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping(value = "services/sell")
public class SellController {

    @Autowired
    SellService sellService;

    @PostMapping(value = "/{id}")
    public Sell save(@RequestBody CreateSell createSell, @PathVariable("id") int farmerId) {

        return sellService.save(createSell,farmerId);
    }

    @GetMapping(value = "/{id}")
    public Response findById(@PathVariable int id, @RequestParam(required = false) String type) throws ExecutionException, InterruptedException {
        if(type == null) {
            return new SimpleResponse(sellService.findById(id));
        } else if(type.equals("half")){
            return sellService.findHalfDetails(id);
        } else {
            return sellService.findDetails(id);
        }
    }

}
