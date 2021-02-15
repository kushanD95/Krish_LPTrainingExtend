package lk.harvestsellingsystem.sellcloud.configconsumer.controller;

import lk.harvestsellingsystem.sellcloud.configconsumer.model.UserProfileConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class UserConfigurationController {

    @Autowired
    UserProfileConfiguration userProfileConfiguration;

    @RequestMapping("/profile")
    public String getConfig(Model model) {
        model.addAttribute("max",userProfileConfiguration.getItemCountMax());
        model.addAttribute("min",userProfileConfiguration.getItemCountMin());
        return "userProfile";
    }
}
