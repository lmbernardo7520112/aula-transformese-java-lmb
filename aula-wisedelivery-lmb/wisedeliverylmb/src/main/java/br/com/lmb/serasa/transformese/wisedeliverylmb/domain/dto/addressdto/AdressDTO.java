package br.com.lmb.serasa.transformese.wisedeliverylmb.domain.dto.addressdto;

import lombok.Data;

@Data
public class AdressDTO {
   private String cep;
   private String estado;
   private String cidade;
   private String bairro;
   private String rua;
   private String numero;

}
