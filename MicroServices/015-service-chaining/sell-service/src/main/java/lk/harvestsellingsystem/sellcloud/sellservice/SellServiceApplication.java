package lk.harvestsellingsystem.sellcloud.sellservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "lk.harvestsellingsystem.sellcloud.servicecloudmodel.model.sell")
public class SellServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SellServiceApplication.class, args);
	}

}
