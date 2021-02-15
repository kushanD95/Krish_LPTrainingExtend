package lk.harvestsellingsystem.sellcloud.userservice.service;

import lk.harvestsellingsystem.sellcloud.servicecloudmodel.model.user.Farmer;

import java.util.List;
import java.util.Optional;

public interface FarmerService {

    public Farmer save(Farmer farmer);

    public Optional<Farmer> findById(int farmerId);

    public List<Farmer> findAll();
}
