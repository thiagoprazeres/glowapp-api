package life.glowapp.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import life.glowapp.api.dto.ServicoDTO;
import life.glowapp.api.service.ServicoService;

import java.util.List;

@RestController
@RequestMapping("/servicos")
public class ServicoController {

    private final ServicoService servicoService;

    @Autowired
    public ServicoController(ServicoService servicoService) {
        this.servicoService = servicoService;
    }

    @GetMapping
    public List<ServicoDTO> getAllServicos() {
        return servicoService.getAllServicos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ServicoDTO> getServicoById(@PathVariable Long id) {
        ServicoDTO servico = servicoService.getServicoById(id);
        if (servico != null) {
            return new ResponseEntity<>(servico, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<ServicoDTO> createServico(@RequestBody ServicoDTO servicoDTO) {
        ServicoDTO createdServico = servicoService.createServico(servicoDTO);
        return new ResponseEntity<>(createdServico, HttpStatus.CREATED);
    }
}
