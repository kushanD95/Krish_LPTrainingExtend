package lk.harvestsellingsystem.sellcloud.auth.authserver.controller;

import lk.harvestsellingsystem.sellcloud.auth.authserver.model.User;
import lk.harvestsellingsystem.sellcloud.auth.authserver.service.UserDetailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserDetailServiceImpl userDetailService;

    @RequestMapping(value = "/credential", method = RequestMethod.POST)
    public User save(@RequestBody User user) {
        return userDetailService.save(user);
    }
}
