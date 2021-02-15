package lk.harvestsellingsystem.sellcloud.profileservice.service;

import lk.harvestsellingsystem.sellcloud.commons.model.User;

import java.util.List;

public interface ProfileService {

    User save(User user);

    User fetchById(int profileId);

    List<User> fetchAllProfiles();
}
