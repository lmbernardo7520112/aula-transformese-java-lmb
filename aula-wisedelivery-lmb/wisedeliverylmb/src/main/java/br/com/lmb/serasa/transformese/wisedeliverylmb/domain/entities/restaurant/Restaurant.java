package br.com.lmb.serasa.transformese.wisedeliverylmb.domain.entities.restaurant;
import br.com.lmb.serasa.transformese.wisedeliverylmb.domain.User;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = true)
@Entity
@Table(name = "restaurant")
public class Restaurant extends User {
    @Getter
    @Setter
    private String cnpj;

    @Getter
    @Setter
    private String logo;

    @Getter
    @Setter
    private BigDecimal deliveryTax;

    @Getter
    @Setter
    private Integer deliveryTime;

    @Getter
    @Setter
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "restaurant_relationship_categories", joinColumns = @JoinColumn(name = "restaurant_id"), inverseJoinColumns = @JoinColumn(name = "category_restaurant_id"))
    @ToString.Exclude
    private Set<RestaurantCategory> categories = new HashSet<>();

    @OneToMany(mappedBy = "restaurante")
    private Set<MenuItem> menu = new HashSet<>();
}