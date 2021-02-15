package lk.harvestsellingsystem.sellcloud.userservice.service.serviceimpl;

import lk.harvestsellingsystem.sellcloud.servicecloudmodel.model.user.Buyer;
import lk.harvestsellingsystem.sellcloud.userservice.repository.BuyerRepository;
import lk.harvestsellingsystem.sellcloud.userservice.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BuyerServiceImpl implements BuyerService {

    @Autowired
    BuyerRepository buyerRepository;

    @Override
    public Buyer save(Buyer buyer) {
        return buyerRepository.save(buyer);
    }

    @Override
    public Optional<Buyer> findById(int buyerId) {
        return buyerRepository.findById(buyerId);
    }

    @Override
    public List<Buyer> findAll() {
        return buyerRepository.findAll();
    }
}
