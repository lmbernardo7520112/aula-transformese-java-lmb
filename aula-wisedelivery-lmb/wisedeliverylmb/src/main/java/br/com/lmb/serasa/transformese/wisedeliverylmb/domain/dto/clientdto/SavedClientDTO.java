package br.com.lmb.serasa.transformese.wisedeliverylmb.domain.dto.clientdto;

import lombok.Data;

@Data
public class SavedClientDTO {

    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String cpf;

}
