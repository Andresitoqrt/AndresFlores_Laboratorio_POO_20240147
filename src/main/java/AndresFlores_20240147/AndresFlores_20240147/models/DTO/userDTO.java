package AndresFlores_20240147.AndresFlores_20240147.models.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@ToString@EqualsAndHashCode
@Getter@Setter
public class userDTO {

    private Long providerID;
    @NotBlank(message = "Elnombre del provedor es obligatorio")
    private String providerName;
    @Getter@Setter
    private String providerPhone;
    @NotBlank(message = "La direccion debe ser valida")
    private String providerAddress;
    @Email(message = "El correo debe ser valido")
    private String providerEmail;
    @Size(min = 8, message = "El codigo debe ser valido")
    private String providerCode;
    @Getter@Setter
    private Integer providerStatus;
    @Getter@Setter
    private String providerComments;

}
