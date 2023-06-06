package br.com.lmb.serasa.transformese.wisedeliverylmb.domain.entities.restaurant;

import java.util.List;

import javax.persistence.GenerationType;
import javax.persistence.ManyToMany;

import javax.persistence.GeneratedValue;

import javax.persistence.Id;

import lombok.EqualsAndHashCode;

public class ItemCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long Id;
    private String name;
    private String image;

    @ManyToMany(mappedBy = "categorias")
    private List<MenuItem> itens;

}
