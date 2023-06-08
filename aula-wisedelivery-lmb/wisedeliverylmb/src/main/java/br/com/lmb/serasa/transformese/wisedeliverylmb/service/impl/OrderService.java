package br.com.lmb.serasa.transformese.wisedeliverylmb.service.impl;

import java.util.List;

import br.com.lmb.serasa.transformese.wisedeliverylmb.domain.dto.orderdto.CheckOutScreenDTO;
import br.com.lmb.serasa.transformese.wisedeliverylmb.domain.dto.orderdto.OrderDTO;
import br.com.lmb.serasa.transformese.wisedeliverylmb.domain.dto.restaurantdto.Cart;

public interface OrderService {
    OrderDTO searchinghOrderById(Long id);

    List<OrderDTO> searchingAllOrdersByRestaurantId(Long restaurantId);

    List<OrderDTO> searchingAllOrdersByClientId(Long clientId);

    CheckOutScreenDTO fromCartToOrder(Cart cart);

    OrderDTO finalizarPedido(CheckOutScreenDTO order);

}

