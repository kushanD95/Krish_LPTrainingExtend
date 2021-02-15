package lk.harvestsellingsystem.sellcloud.sellservice.hystricx;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import lk.harvestsellingsystem.sellcloud.servicecloudmodel.model.item.Item;
import org.springframework.web.client.RestTemplate;

public class ItemCommand extends HystrixCommand<Item> {

    RestTemplate restTemplate;
    int itemId;

    public ItemCommand(RestTemplate restTemplate, int itemId) {
        super(HystrixCommandGroupKey.Factory.asKey("default"));
        this.restTemplate = restTemplate;
        this.itemId = itemId;
    }

    @Override
    protected Item run() throws Exception {
        return restTemplate.getForObject("http://item/services/item/"+itemId,Item.class);
    }

    @Override
    protected Item getFallback() {
        return new Item();
    }
}
