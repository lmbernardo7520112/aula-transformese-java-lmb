package br.com.lmb.serasa.transformese.wisedeliverylmb.repository.OrderRepository;

import br.com.lmb.serasa.transformese.wisedeliverylmb.domain.entities.order.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long>{
    
}
