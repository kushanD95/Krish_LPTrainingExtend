package lk.harvestsellingsystem.sellcloud.sellservice.service;

import lk.harvestsellingsystem.sellcloud.sellservice.model.Response;
import lk.harvestsellingsystem.sellcloud.sellservice.model.modelimpl.CreateSell;
import lk.harvestsellingsystem.sellcloud.servicecloudmodel.model.sell.Sell;

import java.util.concurrent.ExecutionException;

public interface SellService {
    Sell save(CreateSell createSell, int farmerId);

    Sell findById(int id);

    Response findHalfDetails(int id);

    Response findDetails(int id) throws ExecutionException, InterruptedException;
}
