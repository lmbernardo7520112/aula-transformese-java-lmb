package br.com.lmb.serasa.transformese.wisedeliverylmb.service.impl;

import br.com.lmb.serasa.transformese.wisedeliverylmb.domain.entities.restaurant.ItemCategory;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.math.BigDecimal;

import br.com.lmb.serasa.transformese.wisedeliverylmb.domain.entities.restaurant.Restaurant;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class MenuItem {
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private String image;
    private BigDecimal price;
    private boolean highlight;
    private boolean active;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "item_relacao_categoria",
        joinColumns = @JoinColumn(name = "itemId"),
        inverseJoinColumns = @JoinColumn(name = "categoriaItemId")
    )
    private List<ItemCategory> categories;

    @ManyToOne
    @JoinColumn(name = "restaurante_id")
    private Restaurant restaurants;
    
}
