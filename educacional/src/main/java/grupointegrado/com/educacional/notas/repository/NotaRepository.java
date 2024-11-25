package grupointegrado.com.educacional.notas.repository;

import grupointegrado.com.educacional.notas.model.Nota;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotaRepository extends JpaRepository<Nota, Integer> {
}