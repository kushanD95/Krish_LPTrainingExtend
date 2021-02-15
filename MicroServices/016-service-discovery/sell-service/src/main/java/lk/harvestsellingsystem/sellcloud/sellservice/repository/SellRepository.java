package lk.harvestsellingsystem.sellcloud.sellservice.repository;

import lk.harvestsellingsystem.sellcloud.servicecloudmodel.model.sell.Sell;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellRepository extends JpaRepository<Sell,Integer> {
}
