package grupointegrado.com.educacional.matriculas.repository;

import grupointegrado.com.educacional.matriculas.model.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MatriculaRepository extends JpaRepository<Matricula, Integer> {
}
