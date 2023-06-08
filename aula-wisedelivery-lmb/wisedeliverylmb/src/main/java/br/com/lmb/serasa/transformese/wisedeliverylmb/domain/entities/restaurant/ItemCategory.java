package br.com.lmb.serasa.transformese.wisedeliverylmb.domain.entities.restaurant;

import java.util.List;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToMany;
import lombok.EqualsAndHashCode;



public class ItemCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long Id;
    private String name;
    private String image;

    @ManyToMany(mappedBy = "categories")
    private List<MenuItem> itens;

}
