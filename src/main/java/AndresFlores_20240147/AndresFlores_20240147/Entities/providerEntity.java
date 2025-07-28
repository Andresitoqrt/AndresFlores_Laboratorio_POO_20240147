package AndresFlores_20240147.AndresFlores_20240147.Entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table (name = "TBPROVIDER")
@Getter@Setter@ToString@EqualsAndHashCode
public class providerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "sqe_provider")
    @SequenceGenerator(name = "sqe_provider",sequenceName = "sqe_provider",allocationSize = 1)
    @Column(name = "PROVIDERID")
    private Long providerID;
    @Column(name = "PROVIDERNAME")
    private String providerName;
    @Column(name = "PROVIDERPHONE")
    private String providerPhone;
    @Column(name = "PROVIDERADDRESS")
    private String providerAddress;
    @Column(name = "PROVIDEREMAIL",unique = true)
    private String providerEmail;
    @Column(name = "PROVIDERCODE")
    private String providerCode;
    @Column(name = "PROVIDERSTASTUS")
    private Integer providerStatus;
    @Column(name = "PROVIDERCOMMENTS")
    private String providerComments;

}
