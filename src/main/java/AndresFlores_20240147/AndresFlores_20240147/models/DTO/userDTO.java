package AndresFlores_20240147.AndresFlores_20240147.models.DTO;

import lombok.*;

@ToString@EqualsAndHashCode
@Getter@Setter
public class userDTO {

    private Long providerID;

    
    private String providerName;

    private String providerPhone;

    private String providerAddress;

    private String providerEmail;

    private String providerCode;

    private Integer providerStatus;

    private String providerComments;

}
