package lk.harvestsellingsystem.sellcloud.userservice.service.serviceimpl;

import lk.harvestsellingsystem.sellcloud.servicecloudmodel.model.user.Farmer;
import lk.harvestsellingsystem.sellcloud.userservice.repository.FarmerRepository;
import lk.harvestsellingsystem.sellcloud.userservice.service.FarmerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class FarmerServiceImpl implements FarmerService {

    @Autowired
    FarmerRepository farmerRepository;

    @Override
    public Farmer save(Farmer farmer) {
        return farmerRepository.save(farmer);
    }

    @Override
    public Optional<Farmer> findById(int farmerId) {
        return farmerRepository.findById(farmerId);
    }

    @Override
    public List<Farmer> findAll() {
        return farmerRepository.findAll();
    }
}
