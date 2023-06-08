package br.com.lmb.serasa.transformese.wisedeliverylmb.domain.dto.orderdto;

import br.com.lmb.serasa.transformese.wisedeliverylmb.domain.dto.addressdto.AdressDTO;
import br.com.lmb.serasa.transformese.wisedeliverylmb.domain.dto.clientdto.SavedClientDTO;
import br.com.lmb.serasa.transformese.wisedeliverylmb.domain.dto.restaurantdto.SavedRestaurantDTO;
import br.com.lmb.serasa.transformese.wisedeliverylmb.domain.entities.order.OrderItem;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class CheckOutScreenDTO {
    private LocalDateTime date;
    private SavedRestaurantDTO restaurant;
    private SavedClientDTO client;
    private BigDecimal subTotal;
    private BigDecimal deliveryTax;
    private BigDecimal total;
    private List<OrderItem> itens;
    private AdressDTO adress;

}
