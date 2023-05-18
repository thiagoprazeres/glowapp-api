package life.glowapp.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServicoDTO {
    private Long id;
    private String nome;
    private String imagem;
    private String avatar;
    private String descricao;
    private Double preco;
}
