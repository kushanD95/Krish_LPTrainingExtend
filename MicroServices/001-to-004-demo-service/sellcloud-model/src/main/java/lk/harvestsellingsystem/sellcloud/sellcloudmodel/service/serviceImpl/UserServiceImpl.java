package lk.harvestsellingsystem.sellcloud.sellcloudmodel.service.serviceImpl;

import lk.harvestsellingsystem.sellcloud.sellcloudmodel.model.user.User;
import lk.harvestsellingsystem.sellcloud.sellcloudmodel.repository.UserRepository;
import lk.harvestsellingsystem.sellcloud.sellcloudmodel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User save(User user) {
         return userRepository.save(user);
    }

    @Override
    public User findUserById(int id) {

        Optional<User> user = userRepository.findById(id);
        if(user.isPresent()) {
            return user.get();
        } else {
            return null;
        }
    }
}
