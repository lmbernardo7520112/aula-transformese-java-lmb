package br.com.lmb.serasa.transformese.wisedeliverylmb.domain.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@MappedSuperclass
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @Column(length = 80, nullable = false)
    private String nome;

    @Column(length = 60, nullable = false)
    private String email;

    @Column(length = 80, nullable = false)
    private String senha;

    @Column(length = 20, nullable = false)
    private String telefone;
}
