package br.com.lmb.serasa.transformese.wisedeliverylmb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.lmb.serasa.transformese.wisedeliverylmb.controller.validator.Validator;
import br.com.lmb.serasa.transformese.wisedeliverylmb.domain.dto.clientdto.ClientDTO;
import br.com.lmb.serasa.transformese.wisedeliverylmb.domain.dto.clientdto.ClientLoginDTO;
import br.com.gva.wisedelivery.exception.SenhaInvalidaException;
import br.com.gva.wisedelivery.service.ClienteService;
import jakarta.validation.Valid;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Controller
@RequestMapping("clientes")
public class ClientController {

    @Autowired
    @Getter
    private ClienteService clienteService;

    @Autowired
    @Getter
    private Validator<ClientDTO> validator;

    @GetMapping("form-cadastro")
    public String formCadastroCliente(Model model) {
        model.addAttribute("client", new ClientDTO());
        return "cliente-cadastro";
    }

    @PostMapping("/save")
    public String salvarCliente(@ModelAttribute("client") @Valid ClientDTO client, BindingResult result) {
        if (validator.validator(client)) {
            log.error("Senha e confirmação não estão batendo: {}", client);
            throw new SenhaInvalidaException("Senha e confirmação não estão batendo");
        }
        getClienteService().salvar(client);
        log.info("Cliente salvo. Nome: [{}]", client.getNome());
        return "cliente-cadastro-ok";
    }

    @GetMapping("/login")
    public String telaLogin(Model model) {
        model.addAttribute("client", new ClientLoginDTO());
        return "login";
    }

    @PostMapping("/logar")
    public String login(@ModelAttribute("client") ClientLoginDTO client) {
        if (!getClienteService().login(client)) {
            return "login";
        }
        return "cliente-home";
    }
}