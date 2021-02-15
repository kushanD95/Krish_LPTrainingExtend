package lk.harvestsellingsystem.sellcloud.itemservice.service;

import lk.harvestsellingsystem.sellcloud.itemservice.repository.ItemRepository;
import lk.harvestsellingsystem.sellcloud.servicecloudmodel.model.item.Item;
import lk.harvestsellingsystem.sellcloud.servicecloudmodel.model.user.Farmer;
import lk.harvestsellingsystem.sellcloud.servicecloudmodel.types.FarmerType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    @Bean
    RestTemplate getRestTemplate(RestTemplateBuilder builder){

        return builder.build();
    }

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    ItemRepository itemRepository;

    public List<Item> findByFarmerId(int itemId) {
        return itemRepository.findByFarmerId(itemId);
    }

    public List<Item> findAll() {
        return itemRepository.findAll();
    }

    public Item save(Item item, int id) {
        //Farmer[] farmer = getFarmer(id);
//        Farmer farmer1 = new Farmer(farmer[0].getRegisteredNumber(),getFarmerTypes(1));
//        farmer1.setId(id);
//        System.out.println(farmer1.getId()+" "+farmer1.getFarmerType()+" "+farmer1.getRegisteredNumber());
        item.setFarmer_id(id);
        return itemRepository.save(item);
    }

    public Optional<Item> findById(int itemId) {
        return itemRepository.findById(itemId);
    }

    private Farmer[] getFarmer(int farmerId) {
        return restTemplate.getForObject("http://localhost:9092/services/farmer/?id="+farmerId,Farmer[].class);
    }

    private FarmerType getFarmerTypes(int typeId) {
        return restTemplate.getForObject("http://localhost:9092/services/farmer/types/?id="+typeId, FarmerType.class);
    }
}
