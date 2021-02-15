package lk.harvestsellingsystem.sellcloud.userservice.model;

import lk.harvestsellingsystem.sellcloud.servicecloudmodel.types.FarmerType;

import javax.persistence.Column;

public class RegisterModel {

    private int id;
    private String fname;
    private String lname;
    private String email;
    private String username;
    private String password;
    private boolean isFarmer;
    private String registeredNumber;
    private FarmerType farmerType;
    private boolean haveTransport;

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
        this.isFarmer = farmer;
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

    public boolean isHaveTransport() {
        return haveTransport;
    }

    public void setHaveTransport(boolean haveTransport) {
        this.haveTransport = haveTransport;
    }
}
