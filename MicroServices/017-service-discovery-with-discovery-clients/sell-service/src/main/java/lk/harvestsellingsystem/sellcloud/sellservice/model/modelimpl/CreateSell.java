package lk.harvestsellingsystem.sellcloud.sellservice.model.modelimpl;

import lk.harvestsellingsystem.sellcloud.servicecloudmodel.types.HarvestTypes;
import lk.harvestsellingsystem.sellcloud.servicecloudmodel.types.PriceUnits;

import java.math.BigDecimal;

public class CreateSell {

    private HarvestTypes harvestType;
    private String category;
    private BigDecimal pricePerUnit;
    private PriceUnits priceUnit;
    private BigDecimal quantity;
    private int farmer_id;
    private int buyer_id;

    public CreateSell() {
    }

    public CreateSell(HarvestTypes harvestType, String category, BigDecimal pricePerUnit, PriceUnits priceUnit, BigDecimal quantity, int farmer_id, int buyer_id) {
        this.harvestType = harvestType;
        this.category = category;
        this.pricePerUnit = pricePerUnit;
        this.priceUnit = priceUnit;
        this.quantity = quantity;
        this.farmer_id = farmer_id;
        this.buyer_id = buyer_id;
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

    public int getFarmer_id() {
        return farmer_id;
    }

    public void setFarmer_id(int farmer_id) {
        this.farmer_id = farmer_id;
    }

    public int getBuyer_id() {
        return buyer_id;
    }

    public void setBuyer_id(int buyer_id) {
        this.buyer_id = buyer_id;
    }
}
