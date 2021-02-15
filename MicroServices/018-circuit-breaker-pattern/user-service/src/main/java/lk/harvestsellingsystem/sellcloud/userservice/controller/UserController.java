package lk.harvestsellingsystem.sellcloud.userservice.controller;

import lk.harvestsellingsystem.sellcloud.servicecloudmodel.model.user.User;
import lk.harvestsellingsystem.sellcloud.userservice.model.RegisterModel;
import lk.harvestsellingsystem.sellcloud.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("services/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping
    public User save(@RequestBody RegisterModel registerModel) {
        return userService.save(registerModel);
    }

    @GetMapping(value = "/{id}")
    public Optional<User> findById(@RequestParam("id") int userId) {
       return userService.findById(userId);
    }

    @GetMapping()
    public List<User> getUsers() {
        return userService.findAll();
    }

}
