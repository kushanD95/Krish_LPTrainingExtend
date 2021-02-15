package lk.harvestsellingsystem.sellcloud.servicecloudmodel.model.types;

import javax.persistence.*;

@Entity
@Table(name = "farmer_type")
public class FarmerTypes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
