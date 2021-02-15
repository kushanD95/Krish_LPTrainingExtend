package lk.harvestsellingsystem.sellcloud.servicecloudmodel.model.item;

import lk.harvestsellingsystem.sellcloud.servicecloudmodel.model.user.Farmer;
import lk.harvestsellingsystem.sellcloud.servicecloudmodel.types.HarvestTypes;
import lk.harvestsellingsystem.sellcloud.servicecloudmodel.types.PriceUnits;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "item")
public class Item {

    public Item() {
    }

    public Item(HarvestTypes harvestType, String category, BigDecimal pricePerUnit, PriceUnits priceUnit, BigDecimal quantity, int farmer_id) {
        this.harvestType = harvestType;
        this.category = category;
        this.pricePerUnit = pricePerUnit;
        this.priceUnit = priceUnit;
        this.quantity = quantity;
        this.farmer_id = farmer_id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private HarvestTypes harvestType;
    private String category;
    private BigDecimal pricePerUnit;
    private PriceUnits priceUnit;
    private BigDecimal quantity;
    private int farmer_id;
//    @ManyToOne(cascade = CascadeType.REMOVE)
//    @JoinColumn(name="farmer_id",referencedColumnName = "id", nullable=false)
//    private Farmer farmer;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public HarvestTypes getHarvestType() {
        return harvestType;
    }

    public void setHarvestType(HarvestTypes harvestType) {
        this.harvestType = harvestType;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public BigDecimal getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(BigDecimal pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public PriceUnits getPriceUnit() {
        return priceUnit;
    }

    public void setPriceUnit(PriceUnits priceUnit) {
        this.priceUnit = priceUnit;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

//    public Farmer getFarmer() {
//        return farmer;
//    }
//
//    public void setFarmer(Farmer farmer) {
//        this.farmer = farmer;
//    }

    public int getFarmer_id(int id) {
        return farmer_id;
    }

    public void setFarmer_id(int farmer_id) {
        this.farmer_id = farmer_id;
    }

}
