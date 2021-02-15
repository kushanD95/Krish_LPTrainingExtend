package lk.harvestsellingsystem.sellcloud.itemservice.repository;

import lk.harvestsellingsystem.sellcloud.servicecloudmodel.model.item.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface ItemRepository extends JpaRepository<Item,Integer> {

    @Transactional
    @Query(value = "SELECT * FROM Item WHERE Item.farmer_id = :itemId",nativeQuery = true)
    List<Item> findByFarmerId(@Param("itemId") int itemId);
}
