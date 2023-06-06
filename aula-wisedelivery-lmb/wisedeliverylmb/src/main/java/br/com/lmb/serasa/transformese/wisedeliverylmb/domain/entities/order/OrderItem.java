package br.com.lmb.serasa.transformese.wisedeliverylmb.domain.entities.order;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import br.com.lmb.serasa.transformese.wisedeliverylmb.domain.entities.order.enums.OrderItemPK;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class OrderItem {
    @EqualsAndHashCode.Include
    @Getter
    @Setter
    @EmbeddedId
    private OrderItemPK id;

    @Getter
    @Setter
    @ManyToOne
    private MenuItem menuItem;

    @Getter
    @Setter
    private String specialRequests;

    @Getter
    @Setter
    private BigDecimal price;

    @Getter
    @Setter
    private int quantity;
}
