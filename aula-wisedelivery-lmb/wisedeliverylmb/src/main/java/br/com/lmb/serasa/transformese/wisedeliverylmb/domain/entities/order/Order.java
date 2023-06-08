package br.com.lmb.serasa.transformese.wisedeliverylmb.domain.entities.order;
import br.com.lmb.serasa.transformese.wisedeliverylmb.domain.entities.client.Client;
import br.com.lmb.serasa.transformese.wisedeliverylmb.domain.entities.order.enums.Status;
import br.com.lmb.serasa.transformese.wisedeliverylmb.domain.entities.restaurant.Restaurant;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;


@Setter
@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder
@Entity
public class Order {
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private LocalDateTime data;
    private Status status;

    @ManyToOne
    private Client client;

    @ManyToOne
    private Restaurant restaurant;
    private BigDecimal subtotal;
    private BigDecimal deliveryTax;
    private BigDecimal total;

    @OneToMany(mappedBy = "id.order", fetch = FetchType.EAGER)
    private List<OrderItem> itens;

    public String getOrderDay() {
        return String.valueOf(data.getDayOfMonth());
    }

    public String getOrderMonth() {
        return String.valueOf(data.getMonth());
    }
}
