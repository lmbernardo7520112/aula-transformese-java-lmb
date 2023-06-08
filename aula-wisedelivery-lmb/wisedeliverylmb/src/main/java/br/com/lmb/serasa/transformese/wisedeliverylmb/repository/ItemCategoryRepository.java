package br.com.lmb.serasa.transformese.wisedeliverylmb.repository.ItemCategoryRepository;

import br.com.lmb.serasa.transformese.wisedeliverylmb.domain.entities.restaurant.ItemCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemCategoryRepository extends JpaRepository <ItemCategory, Long> {

}
