package lk.harvestsellingsystem.sellcloud.sellservice.model.modelimpl;

import lk.harvestsellingsystem.sellcloud.sellservice.model.Response;
import lk.harvestsellingsystem.sellcloud.servicecloudmodel.model.item.Item;
import lk.harvestsellingsystem.sellcloud.servicecloudmodel.model.sell.Sell;
import lk.harvestsellingsystem.sellcloud.servicecloudmodel.model.user.Buyer;
import lk.harvestsellingsystem.sellcloud.servicecloudmodel.model.user.Farmer;

public class DetailResponse implements Response {

    private Sell sell;
    private FarmerModel farmer;
    private BuyerModel buyer;
    private Item item;

    public DetailResponse(Sell sell, Farmer farmer, Buyer buyer, Item item) {
        this.sell = sell;
        this.farmer = new FarmerModel(farmer);
        this.buyer = new BuyerModel(buyer);
        this.item = item;
    }

    public Sell getSell() {
        return sell;
    }

    public void setSell(Sell sell) {
        this.sell = sell;
    }

    public FarmerModel getFarmer() {
        return farmer;
    }

    public void setFarmer(FarmerModel farmer) {
        this.farmer = farmer;
    }

    public BuyerModel getBuyer() {
        return buyer;
    }

    public void setBuyer(BuyerModel buyer) {
        this.buyer = buyer;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
