package lk.harvestsellingsystem.sellcloud.userservice.service.serviceimpl;

import lk.harvestsellingsystem.sellcloud.servicecloudmodel.model.user.Buyer;
import lk.harvestsellingsystem.sellcloud.servicecloudmodel.model.user.Farmer;
import lk.harvestsellingsystem.sellcloud.servicecloudmodel.model.user.User;
import lk.harvestsellingsystem.sellcloud.userservice.model.RegisterModel;
import lk.harvestsellingsystem.sellcloud.userservice.repository.UserRepository;
import lk.harvestsellingsystem.sellcloud.userservice.service.BuyerService;
import lk.harvestsellingsystem.sellcloud.userservice.service.FarmerService;
import lk.harvestsellingsystem.sellcloud.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    FarmerService farmerService;

    @Autowired
    BuyerService buyerService;

    @Autowired
    UserRepository userRepository;

    @Override
    public User save(RegisterModel registerModel) {
        System.out.println(registerModel.isFarmer()+" "+registerModel.getRegisteredNumber()+" "+registerModel.getFarmerType());
        if(registerModel.isFarmer() == true) {

           Farmer farmer = farmerService.save(new Farmer(registerModel.getRegisteredNumber(),registerModel.getFarmerType()));
            return userRepository.save(new User(registerModel.getFname(),
                                                registerModel.getLname(),
                                                registerModel.getEmail(),
                                                registerModel.getUsername(),
                                                registerModel.getPassword(),
                                                registerModel.isFarmer(),
                                                farmer,
                                            null)
                                        );
        } else {

            Buyer buyer = buyerService.save(new Buyer(registerModel.getRegisteredNumber(),registerModel.isHaveTransport()));
            return userRepository.save(new User(registerModel.getFname(),
                                                registerModel.getLname(),
                                                registerModel.getEmail(),
                                                registerModel.getUsername(),
                                                registerModel.getPassword(),
                                                registerModel.isFarmer(),
                                                null,
                                                buyer)
                                        );
        }
    }

    @Override
    public Optional<User> findById(int userId) {
       return userRepository.findById(userId);
    }

    @Override
    public List<User> findAll() {
       return userRepository.findAll();
    }


}
