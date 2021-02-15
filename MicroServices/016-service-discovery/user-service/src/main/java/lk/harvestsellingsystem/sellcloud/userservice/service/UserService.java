package lk.harvestsellingsystem.sellcloud.userservice.service;

import lk.harvestsellingsystem.sellcloud.servicecloudmodel.model.user.User;
import lk.harvestsellingsystem.sellcloud.userservice.model.RegisterModel;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User save(RegisterModel registerModel);

    Optional<User> findById(int userId);

    List<User> findAll();
}
