package br.com.lmb.serasa.transformese.wisedeliverylmb.repository.RestaurantCategoryRepository;

import br.com.lmb.serasa.transformese.wisedeliverylmb.domain.entities.order.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantCategoryRepository extends JpaRepository<Order, Long>{
    
}
