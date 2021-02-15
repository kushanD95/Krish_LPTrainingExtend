package lk.harvestsellingsystem.sellcloud.servicecloudmodel.model.user;

import lk.harvestsellingsystem.sellcloud.servicecloudmodel.model.item.Item;
import lk.harvestsellingsystem.sellcloud.servicecloudmodel.types.FarmerType;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "farmer")
public class Farmer {

    public Farmer() {
    }

    public Farmer(String registeredNumber, FarmerType farmerType) {
        this.registeredNumber = registeredNumber;
        this.farmerType = farmerType;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "registered_number")
    private String registeredNumber;
    @Column(name = "farmer_type")
    private FarmerType farmerType;

    @OneToOne(mappedBy = "farmer",fetch = FetchType.LAZY,cascade = CascadeType.REMOVE)
    private User user;

//    @OneToMany(mappedBy = "farmer", fetch = FetchType.LAZY,cascade = CascadeType.REMOVE)
//    private List<Item> items;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRegisteredNumber() {
        return registeredNumber;
    }

    public void setRegisteredNumber(String registeredNumber) {
        this.registeredNumber = registeredNumber;
    }

    public FarmerType getFarmerType() {
        return farmerType;
    }

    public void setFarmerType(FarmerType farmerType) {
        this.farmerType = farmerType;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

//    public List<Item> getItems() {
//        return items;
//    }
//
//    public void setItems(List<Item> items) {
//        this.items = items;
//    }
}
