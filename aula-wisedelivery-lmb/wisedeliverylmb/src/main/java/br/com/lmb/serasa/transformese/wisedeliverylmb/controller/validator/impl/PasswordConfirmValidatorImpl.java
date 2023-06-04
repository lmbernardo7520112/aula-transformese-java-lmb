package br.com.lmb.serasa.transformese.wisedeliverylmb.controller.validator.impl;



import org.springframework.stereotype.Component;

import br.com.gva.wisedelivery.controller.validator.Validator;
import br.com.gva.wisedelivery.dominio.dto.clientedto.ClienteDTO;

@Component
public class PasswordConfirmValidatorImpl implements Validator<ClienteDTO> {

    @Override
    public boolean validator(ClienteDTO cliente) {
        return !cliente.getSenha().equals(cliente.getConfirmaSenha());
    }
}