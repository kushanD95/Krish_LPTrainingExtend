package lk.harvestsellingsystem.sellcloud.itemservice.itemservice.reopsitory;

import lk.harvestsellingsystem.sellcloud.commons.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

public interface ItemRepository extends JpaRepository<Item,Integer> {

    @Modifying
    @Transactional
    @Query(value = "update Item set Item.isRequest = true where Item.id = :itemId",nativeQuery = true)
    int itemRequest(@Param("itemId") int itemId);
}
