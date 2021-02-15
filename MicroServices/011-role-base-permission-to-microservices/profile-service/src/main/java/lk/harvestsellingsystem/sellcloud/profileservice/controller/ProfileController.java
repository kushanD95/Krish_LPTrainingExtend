package lk.harvestsellingsystem.sellcloud.profileservice.controller;

import lk.harvestsellingsystem.sellcloud.commons.model.User;
import lk.harvestsellingsystem.sellcloud.profileservice.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/services")
public class ProfileController {

    @Autowired
    ProfileService profileService;

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public User save(@RequestBody User user) {
        return profileService.save(user);
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public User fetch(@RequestParam int userId) {
        return profileService.fetchById(userId);
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<User> fetch() {
        return profileService.fetchAllProfiles();
    }
}
