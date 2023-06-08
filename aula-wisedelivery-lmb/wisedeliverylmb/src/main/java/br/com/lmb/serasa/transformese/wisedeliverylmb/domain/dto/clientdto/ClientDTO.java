package br.com.lmb.serasa.transformese.wisedeliverylmb.domain.dto.clientdto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.Getter;

import javax.validation.constraints.*;

@Data
@Getter
public class ClientDTO {
    private Long id;

    @NotBlank(message = "Name cannot be empty")
    @Size(max = 80)
    private String name;

    @NotBlank(message = "Email cannot be empty")
    @Size(max = 60)
    @Email(message = "Invalid email format")
    private String email;

    @NotBlank(message = "Password cannot be empty")
    @Size(max = 80)
    private String password;

    @NotBlank(message = "Password confirmation cannot be empty")
    @Size(max = 80)
    private String confirmPassword;

    @NotBlank(message = "Phone cannot be empty")
    @Size(max = 20)
    @Pattern(regexp = "[0-9]+")
    private String phone;

    @NotBlank(message = "CPF cannot be empty")
    @Size(max = 11)
    @Pattern(regexp = "[0-9]{11}")
    private String cpf;
}
