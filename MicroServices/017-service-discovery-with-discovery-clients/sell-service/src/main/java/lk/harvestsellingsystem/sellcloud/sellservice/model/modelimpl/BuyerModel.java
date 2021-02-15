package lk.harvestsellingsystem.sellcloud.sellservice.model.modelimpl;

import lk.harvestsellingsystem.sellcloud.servicecloudmodel.model.user.Buyer;
import lk.harvestsellingsystem.sellcloud.servicecloudmodel.types.FarmerType;

public class BuyerModel {

    private String fname;
    private String lname;
    private String email;
    private String registeredNumber;
    private boolean haveTransport;

    public BuyerModel() {
    }

    public BuyerModel(Buyer buyer) {
        if(buyer != null) {
            this.fname = buyer.getUser().getFname();
            this.lname = buyer.getUser().getLname();
            this.email = buyer.getUser().getEmail();
            this.registeredNumber = buyer.getRegisteredNumber();
            this.haveTransport = buyer.isHaveTransport();
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

    public boolean isHaveTransport() {
        return haveTransport;
    }
}
