package br.com.lmb.serasa.transformese.wisedeliverylmb.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.lmb.serasa.transformese.wisedeliverylmb.domain.dto.restaurantdto.RestaurantDTO;
import br.com.lmb.serasa.transformese.wisedeliverylmb.service.impl.RestaurantService;

@Controller
@RequestMapping("restaurants")
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @GetMapping("form-cadastro")
    String formCadastroRestaurante(Model model) {
        model.addAttribute("categorias", restaurantService.getAllCategories());
        model.addAttribute("restaurante", new RestaurantDTO());
        return "restaurante-cadastro";
    }

    @PostMapping("salvar")
    public String salvarRestaurante(@ModelAttribute("restaurante") @Valid RestaurantDTO dto) {
        restaurantService.save(dto);
        return "restaurante-cadastro";
    }
}