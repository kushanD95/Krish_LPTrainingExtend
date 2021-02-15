package lk.harvestsellingsystem.sellcloud.userservice.repository;

import lk.harvestsellingsystem.sellcloud.servicecloudmodel.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
