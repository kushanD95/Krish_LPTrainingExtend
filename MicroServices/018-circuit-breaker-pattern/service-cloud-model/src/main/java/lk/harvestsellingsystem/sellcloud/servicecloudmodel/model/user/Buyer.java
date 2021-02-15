package lk.harvestsellingsystem.sellcloud.servicecloudmodel.model.user;

import javax.persistence.*;

@Entity
@Table(name = "buyer")
public class Buyer {

    public Buyer() {
    }

    public Buyer(String registeredNumber, boolean haveTransport) {
        this.registeredNumber = registeredNumber;
        this.haveTransport = haveTransport;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "registered_number")
    private String registeredNumber;
    @Column(name = "has_transport")
    private boolean haveTransport;

    @OneToOne(mappedBy = "buyer",fetch = FetchType.LAZY,cascade = CascadeType.REMOVE)
    private User user;

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

    public boolean isHaveTransport() {
        return haveTransport;
    }

    public void setHaveTransport(boolean haveTransport) {
        this.haveTransport = haveTransport;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
