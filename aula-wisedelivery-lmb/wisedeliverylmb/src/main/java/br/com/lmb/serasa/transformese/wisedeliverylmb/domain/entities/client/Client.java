package br.com.lmb.serasa.transformese.wisedeliverylmb.domain.entities.client;

import br.com.lmb.serasa.transformese.wisedeliverylmb.domain.User;
import jakarta.persistence.Column;
import lombok.Getter;

@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
@Entity
@Table(name = "client")
public class Client extends User {

    @Getter
    @Setter
    @Column(length = 11, nullable = false)
    private String cpf;

}