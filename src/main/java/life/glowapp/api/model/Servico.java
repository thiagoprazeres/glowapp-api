package life.glowapp.api.model;

import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "servicos")
@Data
public class Servico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nome;

    @NotBlank
    private String imagem;

    @NotBlank
    private String avatar;

    @NotBlank
    private String descricao;

    @NotNull
    @Min(0)
    private Double preco;

}
