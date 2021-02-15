package lk.harvestsellingsystem.sellcloud.profileservice.repository;

import lk.harvestsellingsystem.sellcloud.commons.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<User,Integer> {
}
