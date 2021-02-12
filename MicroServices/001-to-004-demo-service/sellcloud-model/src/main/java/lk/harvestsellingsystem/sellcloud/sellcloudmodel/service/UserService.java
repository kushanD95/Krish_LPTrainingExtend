package lk.harvestsellingsystem.sellcloud.sellcloudmodel.service;

import lk.harvestsellingsystem.sellcloud.sellcloudmodel.model.user.User;

public interface UserService {

    User save(User user);

    public User findUserById(int id);
}
