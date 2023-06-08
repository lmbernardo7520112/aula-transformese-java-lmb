package br.com.lmb.serasa.transformese.wisedeliverylmb.controller.validator.impl;

import org.springframework.stereotype.Component;

import br.com.lmb.serasa.transformese.wisedeliverylmb.controller.validator.Validator;
import br.com.lmb.serasa.transformese.wisedeliverylmb.domain.dto.clientdto.ClientDTO;

@Component
public class PasswordConfirmValidatorImpl implements Validator<ClientDTO> {

  
	@Override
	public boolean validator(ClientDTO client) {
		
		return !client.getPassword().equals(client.getConfirmPassword());
    
	}

}