package lk.harvestsellingsystem.sellcloud.sellcloudmodel.repository;

import lk.harvestsellingsystem.sellcloud.sellcloudmodel.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
