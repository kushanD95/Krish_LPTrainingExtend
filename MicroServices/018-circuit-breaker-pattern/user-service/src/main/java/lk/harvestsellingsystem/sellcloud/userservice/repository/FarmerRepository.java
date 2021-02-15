package lk.harvestsellingsystem.sellcloud.userservice.repository;

import lk.harvestsellingsystem.sellcloud.servicecloudmodel.model.user.Farmer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FarmerRepository extends JpaRepository<Farmer,Integer> {
}
