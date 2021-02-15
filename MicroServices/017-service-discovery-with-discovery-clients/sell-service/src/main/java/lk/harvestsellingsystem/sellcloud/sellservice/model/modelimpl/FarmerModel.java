package lk.harvestsellingsystem.sellcloud.sellservice.model.modelimpl;

import lk.harvestsellingsystem.sellcloud.servicecloudmodel.model.user.Farmer;
import lk.harvestsellingsystem.sellcloud.servicecloudmodel.types.FarmerType;

public class FarmerModel {

    private String fname;
    private String lname;
    private String email;
    private String registeredNumber;
    private FarmerType farmerType;

    public FarmerModel() {
    }

    public FarmerModel(Farmer farmer) {
        if(farmer != null) {
            this.fname = farmer.getUser().getFname();
            this.lname = farmer.getUser().getLname();
            this.email = farmer.getUser().getEmail();
            this.registeredNumber = farmer.getRegisteredNumber();
            this.farmerType = farmer.getFarmerType();
        }
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getEmail() {
        return email;
    }

    public String getRegisteredNumber() {
        return registeredNumber;
    }

    public FarmerType getFarmerType() {
        return farmerType;
    }
}
