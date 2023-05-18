package life.glowapp.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import life.glowapp.api.dto.ServicoDTO;
import life.glowapp.api.model.Servico;
import life.glowapp.api.repository.ServicoRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ServicoService {

    private final ServicoRepository servicoRepository;

    @Autowired
    public ServicoService(ServicoRepository servicoRepository) {
        this.servicoRepository = servicoRepository;
    }

    public List<ServicoDTO> getAllServicos() {
        List<Servico> servicos = servicoRepository.findAll();
        return servicos.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    public ServicoDTO getServicoById(Long id) {
        Optional<Servico> optionalServico = servicoRepository.findById(id);
        return optionalServico.map(this::convertToDto).orElse(null);
    }

    public ServicoDTO createServico(ServicoDTO servicoDTO) {
        Servico servico = convertToEntity(servicoDTO);
        Servico savedServico = servicoRepository.save(servico);
        return convertToDto(savedServico);
    }

    private ServicoDTO convertToDto(Servico servico) {
        return new ServicoDTO(
                servico.getId(),
                servico.getNome(),
                servico.getImagem(),
                servico.getAvatar(),
                servico.getDescricao(),
                servico.getPreco());
    }

    private Servico convertToEntity(ServicoDTO servicoDTO) {
        Servico servico = new Servico();
        servico.setNome(servicoDTO.getNome());
        servico.setImagem(servicoDTO.getImagem());
        servico.setAvatar(servicoDTO.getAvatar());
        servico.setDescricao(servicoDTO.getDescricao());
        servico.setPreco(servicoDTO.getPreco());
        return servico;
    }
}
