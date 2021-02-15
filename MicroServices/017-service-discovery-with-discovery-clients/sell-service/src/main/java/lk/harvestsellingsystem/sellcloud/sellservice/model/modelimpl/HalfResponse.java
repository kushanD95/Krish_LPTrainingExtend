package lk.harvestsellingsystem.sellcloud.sellservice.model.modelimpl;

import lk.harvestsellingsystem.sellcloud.sellservice.model.Response;
import lk.harvestsellingsystem.sellcloud.servicecloudmodel.model.item.Item;
import lk.harvestsellingsystem.sellcloud.servicecloudmodel.model.sell.Sell;
import lk.harvestsellingsystem.sellcloud.servicecloudmodel.model.user.Buyer;
import lk.harvestsellingsystem.sellcloud.servicecloudmodel.model.user.Farmer;

public class HalfResponse implements Response {
    private Sell sell;
    private Item item;

    public HalfResponse(Sell sell, Item item) {
        this.sell = sell;
        this.item = item;
    }

    public Sell getSell() {
        return sell;
    }

    public void setSell(Sell sell) {
        this.sell = sell;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
