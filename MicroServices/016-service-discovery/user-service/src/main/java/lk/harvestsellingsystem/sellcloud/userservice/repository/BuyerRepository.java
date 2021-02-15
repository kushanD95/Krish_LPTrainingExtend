package lk.harvestsellingsystem.sellcloud.userservice.repository;

import lk.harvestsellingsystem.sellcloud.servicecloudmodel.model.user.Buyer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BuyerRepository extends JpaRepository<Buyer,Integer> {
}
