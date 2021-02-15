package lk.harvestsellingsystem.sellcloud.servicecloudmodel.model.user;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {

    public User() {
    }

    public User(String fname, String lname, String email, String username, String password, boolean isFarmer, Farmer farmer, Buyer buyer) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.username = username;
        this.password = password;
        this.isFarmer = isFarmer;
        this.farmer = farmer;
        this.buyer = buyer;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String fname;
    private String lname;
    private String email;
    private String username;
    private String password;
    @Column(name = "is_farmer")
    private boolean isFarmer;

    @OneToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "farmer_id")
    private Farmer farmer;

    @OneToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "buyer_id")
    private Buyer buyer;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isFarmer() {
        return isFarmer;
    }

    public void setFarmer(boolean farmer) {
        isFarmer = farmer;
    }
}
