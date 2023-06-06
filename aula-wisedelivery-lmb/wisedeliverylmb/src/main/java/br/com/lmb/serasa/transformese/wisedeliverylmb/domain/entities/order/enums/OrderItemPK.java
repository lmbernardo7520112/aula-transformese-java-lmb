package br.com.lmb.serasa.transformese.wisedeliverylmb.domain.entities.order.enums;

import br.com.lmb.serasa.transformese.wisedeliverylmb.domain.entities.order.Order;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Getter
@Embeddable
public class OrderItemPK {
    @ManyToOne
    private Order order;

    private Integer ordem;
}
