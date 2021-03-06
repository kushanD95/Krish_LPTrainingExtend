package lk.harvestsellingsystem.sellcloud.servicecloudmodel.model.types;

import javax.persistence.*;

@Entity
@Table(name = "harvest_type")
public class HarvestType {

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
