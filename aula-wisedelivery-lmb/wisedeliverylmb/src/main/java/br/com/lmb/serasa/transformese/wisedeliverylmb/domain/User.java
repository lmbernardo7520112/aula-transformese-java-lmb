package br.com.lmb.serasa.transformese.wisedeliverylmb.domain;

import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

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
