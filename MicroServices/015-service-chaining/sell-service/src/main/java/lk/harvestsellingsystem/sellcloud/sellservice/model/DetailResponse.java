package lk.harvestsellingsystem.sellcloud.sellservice.model;

import lk.harvestsellingsystem.sellcloud.servicecloudmodel.model.item.Item;
import lk.harvestsellingsystem.sellcloud.servicecloudmodel.model.sell.Sell;
import lk.harvestsellingsystem.sellcloud.servicecloudmodel.model.user.Buyer;
import lk.harvestsellingsystem.sellcloud.servicecloudmodel.model.user.Farmer;

public class DetailResponse implements Response {

    private Sell sell;
    private Farmer farmer;
    private Buyer buyer;
    private Item item;

    public DetailResponse(Sell sell, Farmer farmer, Buyer buyer, Item item) {
        this.sell = sell;
        this.farmer = farmer;
        this.buyer = buyer;
        this.item = item;
    }

    public Sell getSell() {
        return sell;
    }

    public void setSell(Sell sell) {
        this.sell = sell;
    }
}
