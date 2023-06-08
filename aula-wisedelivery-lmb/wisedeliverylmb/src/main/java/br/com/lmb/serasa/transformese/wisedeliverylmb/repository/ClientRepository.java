package br.com.lmb.serasa.transformese.wisedeliverylmb.repository.ClientRepository;

import br.com.lmb.serasa.transformese.wisedeliverylmb.domain.entities.client.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository <Client, Long>{
    
}
