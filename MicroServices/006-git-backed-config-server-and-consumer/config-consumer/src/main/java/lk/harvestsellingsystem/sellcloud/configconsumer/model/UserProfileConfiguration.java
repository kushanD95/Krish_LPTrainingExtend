package lk.harvestsellingsystem.sellcloud.configconsumer.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class UserProfileConfiguration {

    @Autowired
    Environment environment;

    public String getItemCountMin() {
        return environment.getProperty("item.count.min");
    }

    public String getItemCountMax() {
        return environment.getProperty("item.count.max");
    }
}
