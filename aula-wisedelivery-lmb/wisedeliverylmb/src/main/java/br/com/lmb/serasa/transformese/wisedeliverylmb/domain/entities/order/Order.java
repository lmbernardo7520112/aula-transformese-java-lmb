package br.com.lmb.serasa.transformese.wisedeliverylmb.domain.entities.order;

import java.util.List;

//import javax.persistence.FetchType;

import br.com.lmb.serasa.transformese.wisedeliverylmb.domain.entities.client.Client;
import br.com.lmb.serasa.transformese.wisedeliverylmb.domain.entities.order.enums.Status;

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

    public String getOrderDay(){
        return String.valueOf(data.getDayOfMonth());
    }

    public String getOrderMonth() {
        return String.valueOf(data.getMonth());
    }
}
