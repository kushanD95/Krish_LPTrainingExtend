package lk.harvestsellingsystem.sellcloud.sellcloudmodel.controller;

import lk.harvestsellingsystem.sellcloud.sellcloudmodel.model.user.User;
import lk.harvestsellingsystem.sellcloud.sellcloudmodel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public User save(@RequestBody User user) {

        return userService.save(user);
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public ResponseEntity<User> fetchStudent(@RequestParam int id){

        User user= userService.findUserById(id);
        if(user == null){
            return   ResponseEntity.notFound().build();
        }else{
            return  ResponseEntity.ok().body(user);
        }
    }
}
