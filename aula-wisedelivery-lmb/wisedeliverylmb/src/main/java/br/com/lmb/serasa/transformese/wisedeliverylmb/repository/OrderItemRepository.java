package br.com.lmb.serasa.transformese.wisedeliverylmb.repository.OrderItemRepository;

import br.com.lmb.serasa.transformese.wisedeliverylmb.domain.entities.order.OrderItem;
import br.com.lmb.serasa.transformese.wisedeliverylmb.domain.entities.order.enums.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
    
}
