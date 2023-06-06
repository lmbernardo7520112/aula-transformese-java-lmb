package br.com.lmb.serasa.transformese.wisedeliverylmb.domain.entities.restaurant;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.lmb.serasa.transformese.wisedeliverylmb.domain.User;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.JoinColumn;

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
    private Set<CategoryRestaurant> categories = new HashSet<>();

    @OneToMany(mappedBy = "restaurante")
    private Set<MenuItem> menu = new HashSet<>();
}