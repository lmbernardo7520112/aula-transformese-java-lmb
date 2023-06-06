package br.com.lmb.serasa.transformese.wisedeliverylmb.domain.dto.clientdto;

import lombok.Data;
import javax.validation.constraints.*;

@Data
public class ClientDTO {
    private Long id;

    @NotBlank(message = "Name cannot be empty")
    @Size(max = 80)
    private String nome;

    @NotBlank(message = "Email cannot be empty")
    @Size(max = 60)
    @Email(message = "Invalid email format")
    private String email;

    @NotBlank(message = "Password cannot be empty")
    @Size(max = 80)
    private String senha;

    @NotBlank(message = "Password confirmation cannot be empty")
    @Size(max = 80)
    private String confirmaSenha;

    @NotBlank(message = "Phone cannot be empty")
    @Size(max = 20)
    @Pattern(regexp = "[0-9]+")
    private String telefone;

    @NotBlank(message = "CPF cannot be empty")
    @Size(max = 11)
    @Pattern(regexp = "[0-9]{11}")
    private String cpf;
}
