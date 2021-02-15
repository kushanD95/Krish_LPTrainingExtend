package lk.harvestsellingsystem.sellcloud.itemservice.sellprocesstask.sellprocesstask.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class SellProcessTaskRunner implements CommandLineRunner {
    @Autowired
    SellProcessService sellProcessService;

    @Override
    public void run(String... args) throws Exception {

        if(args.length > 0) {
            if(sellProcessService.validateQuantity(args[0])) {
                System.out.println("Quantity is Valid");
            } else {
                System.out.println("Quantity is Invalid!");
            }
        } else {
            System.out.println("Task run without Quantity value!");
        }
    }
}
