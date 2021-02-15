package lk.harvestsellingsystem.sellcloud.servicecloudmodel.model.types;

import javax.persistence.*;

@Entity
@Table(name = "quantity_unit")
public class QuantityUnit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String unit;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
