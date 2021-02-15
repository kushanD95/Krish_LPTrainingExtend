package lk.harvestsellingsystem.sellcloud.servicecloudmodel.model.sell;

import javax.persistence.*;

@Entity
public class Sell {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "farmer_id")
    private int farmerId;
    @Column(name = "buyer_id")
    private int buyerId;
    @Column(name = "item_id")
    private int itemId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFarmerId() {
        return farmerId;
    }

    public void setFarmerId(int farmerId) {
        this.farmerId = farmerId;
    }

    public int getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(int buyerId) {
        this.buyerId = buyerId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }
}
