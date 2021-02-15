package lk.harvestsellingsystem.sellcloud.itemservice.sellprocesstask.sellprocesstask.service.serviceImpl;

import lk.harvestsellingsystem.sellcloud.itemservice.sellprocesstask.sellprocesstask.service.SellProcessService;

public class SellProcessServiceImpl implements SellProcessService {

    @Override
    public boolean validateQuantity(String quantity){
        boolean isValidate = false;
       if(quantity > 50) {
          isValidate =true;
       }
       return isValidate;
    }
}
