package br.com.lmb.serasa.transformese.wisedeliverylmb.repository.MenuItem;

import br.com.lmb.serasa.transformese.wisedeliverylmb.domain.entities.order.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuItemRepository extends JpaRepository<Order, Long>{
    
}
