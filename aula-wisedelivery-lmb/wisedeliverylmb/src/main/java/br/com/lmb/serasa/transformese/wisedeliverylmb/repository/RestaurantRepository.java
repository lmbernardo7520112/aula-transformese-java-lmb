package br.com.lmb.serasa.transformese.wisedeliverylmb.repository;

import br.com.lmb.serasa.transformese.wisedeliverylmb.domain.entities.restaurant.Restaurant;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
    Optional<Restaurant> findByEmail(String email);
}
