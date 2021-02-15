package lk.harvestsellingsystem.sellcloud.profileservice.service.serviceImpl;

import lk.harvestsellingsystem.sellcloud.commons.model.user.User;
import lk.harvestsellingsystem.sellcloud.profileservice.repository.ProfileRepository;
import lk.harvestsellingsystem.sellcloud.profileservice.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfileServiceImpl implements ProfileService {
    @Autowired
    ProfileRepository profileRepository;

    @Override
    public User save(User user) {
        profileRepository.save(user);
        return user;
    }

    @Override
    public User fetchById(int profileId) {
        Optional<User> customer = profileRepository.findById(profileId);
        if (customer.isPresent()) {
            return customer.get();
        } else {
            return null;
        }
    }

    @Override
    public List<User> fetchAllProfiles() {
        return profileRepository.findAll();
    }
}
