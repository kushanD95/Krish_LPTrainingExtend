package lk.harvestsellingsystem.sellcloud.userservice.service;

import lk.harvestsellingsystem.sellcloud.servicecloudmodel.model.user.Buyer;

import java.util.List;
import java.util.Optional;

public interface BuyerService {
    Buyer save(Buyer buyer);

    Optional<Buyer> findById(int buyerId);

    List<Buyer> findAll();
}
