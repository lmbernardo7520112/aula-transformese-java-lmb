package br.com.lmb.serasa.transformese.wisedeliverylmb.domain.entities.order;
import br.com.lmb.serasa.transformese.wisedeliverylmb.domain.entities.order.enums.OrderItemPK;
import br.com.lmb.serasa.transformese.wisedeliverylmb.domain.entities.restaurant.MenuItem;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;



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
