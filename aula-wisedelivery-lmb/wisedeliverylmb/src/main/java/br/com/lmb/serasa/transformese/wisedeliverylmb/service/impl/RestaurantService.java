package br.com.lmb.serasa.transformese.wisedeliverylmb.service.impl;

import br.com.lmb.serasa.transformese.wisedeliverylmb.domain.dto.restaurantdto.RestaurantDTO;
import br.com.lmb.serasa.transformese.wisedeliverylmb.domain.dto.restaurantdto.RestaurantIdDTO;
import br.com.lmb.serasa.transformese.wisedeliverylmb.domain.dto.restaurantdto.RestaurantLoginDTO;
import br.com.lmb.serasa.transformese.wisedeliverylmb.domain.dto.restaurantdto.SavedRestaurantDTO;
import br.com.lmb.serasa.transformese.wisedeliverylmb.domain.entities.restaurant.Restaurant;
import br.com.lmb.serasa.transformese.wisedeliverylmb.domain.entities.restaurant.RestaurantCategory;
import java.util.List;


public interface RestaurantService {
    RestaurantIdDTO searchingRestaurantIdByEmail(String email);

    RestaurantIdDTO searchingRestaurantById(Long id);

    Restaurant searchingRestaurant(Long id);

    SavedRestaurantDTO searchingByEmail(String email);

    public SavedRestaurantDTO save(RestaurantDTO dto);

    public List<RestaurantCategory> getAllCategories();

    boolean login(RestaurantLoginDTO restaurant);

    List<RestaurantDTO> searchingAll();
}