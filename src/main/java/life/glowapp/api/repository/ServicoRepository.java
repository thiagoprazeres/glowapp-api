package life.glowapp.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import life.glowapp.api.model.Servico;

@Repository
public interface ServicoRepository extends JpaRepository<Servico, Long> {
    
}
